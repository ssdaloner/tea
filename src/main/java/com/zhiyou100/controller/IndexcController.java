package com.zhiyou100.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.model.ReponseVo;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.TeaBrand;
import com.zhiyou100.model.TeaLeaf;
import com.zhiyou100.model.TeaSortType;
import com.zhiyou100.model.TeaUser;
import com.zhiyou100.model.Teagrade;
import com.zhiyou100.model.User;
import com.zhiyou100.service.TeaBrandService;
import com.zhiyou100.service.TeaGradeService;
import com.zhiyou100.service.TeaService;
import com.zhiyou100.service.TeaUserService;
import com.zhiyou100.service.UserService;

@RestController
public class IndexcController {

	@Autowired
	private TeaService teaService;
	@Autowired
	private TeaGradeService teaGradeService;
	@Autowired
	private TeaUserService teauserService;
	@Autowired
	private TeaBrandService teabrandService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/getchart",method=RequestMethod.POST)
	public ReponseVo<Double[]> getChart(@RequestBody TeaLeaf teaLeaf) {
		
		List<Teagrade> teagrades=teaGradeService.listTeagrade();
	
		double[] data=new double[7];
		
		ArrayList<TeaLeaf> teaLeafs=new ArrayList<TeaLeaf>();
		
		
		
		teaLeafs=teaGradeService.method3(teagrades, teaLeaf);
		
		
		for (int i = 0; i < teaLeafs.size(); i++) {
			
			TeaLeaf teaLeaf2=teaLeafs.get(i);
			
			
			
			data[i]=teaLeaf2.getR();
			
			//System.out.println(data[i]+"======");
			
		}
		
		Long id=teaGradeService.method2(teaLeafs).getTeagradeId();
		
		String name="该茶叶属于"+teaGradeService.method2(teaLeafs).getGradeName();
			
		teaLeaf.setTeagradeId(id);
		
		teaService.addTeaLeaf(teaLeaf);
		
		return new ReponseVo(0,"",data,name);
	}
	
	@RequestMapping(path="/listtea",method=RequestMethod.POST)
	public ReponseVo listTea(@RequestBody HashMap<String, Integer> param) {
		
		int number=param.get("");
		
		int pageIndex=param.get("");
		
       if (number == 1 || number == 2) {
			
			TeaLeaf.sortType = TeaSortType.SIZE;
		}else {
			
			TeaLeaf.sortType = TeaSortType.INSTALL_TIME;
		}
		
		if (number == 1 || number == 3) {
			
			TeaLeaf.desc = false;
		}else {
			
			TeaLeaf.desc = true;
		}
		
		Selector selector=new Selector();
		
		selector.setPageIndex(pageIndex);
		
		//疑问：是对tostring的排序还是对集合的排序
		List<TeaLeaf> data=teaService.listTeaLeaf(selector);
		
		
		return new ReponseVo(0,"",data);
	}
	
	@RequestMapping(path="/list",method=RequestMethod.POST)
	public ReponseVo list2(@RequestBody HashMap<String, Integer> param) {
		
		Selector selector=new Selector();
		
		int sort=param.get("sort");
		
		int pageIndex=param.get("pageIndex");
		//总页数
		int c=teaService.getPageCount();
		
		switch (sort) {
		case 1:
			
			selector.setSort("teagrade_id");

			break;
		case 2:
			
			selector.setSort("teagrade_id desc");

			break;
		case 3:
			
			selector.setSort("create_time");

			break;
		case 4:
			
			selector.setSort("create_time desc");

			break;

		default:
			break;
		}
		if (pageIndex>c) {

			pageIndex=c;

		}

		if (pageIndex<1) {

			pageIndex=1;

		}
		
		selector.setPageIndex(pageIndex);
		
		List<TeaLeaf> data=teaService.listTeaLeaf(selector);
		
		//System.out.println(c);
	
		
		//System.out.println(data.toString());
		
		return new ReponseVo(0,"",data,pageIndex,c);
		
	}
	
	@RequestMapping(path="/getpie",method=RequestMethod.POST)
	public ReponseVo<Integer[]> getCount() {
		
		//ArrayList<Integer> list=new ArrayList<Integer>();
		
		int[] list=new int[7];
		
		list[0]=teaService.getCountBy(1);
		list[1]=teaService.getCountBy(2);
		list[2]=teaService.getCountBy(3);
		list[3]=teaService.getCountBy(4);
		list[4]=teaService.getCountBy(5);
		list[5]=teaService.getCountBy(6);
		list[6]=teaService.getCountBy(7);
		
		return new ReponseVo(0,"",list);
	}
	
	@RequestMapping(path="/getTea",method=RequestMethod.POST)
	public ReponseVo<TeaLeaf> getTea(@RequestBody HashMap<String, Integer> param) {
		
		TeaLeaf data=teaService.getTea(param.get("id"));
		
		//System.out.println(data);
		
		return new ReponseVo(0,"",data);
	}
	
	@RequestMapping(path="/loadUser",method=RequestMethod.POST)
	public ReponseVo<String> loadUser(@RequestBody HashMap<String, String> param, HttpSession session) {
		
		String number=param.get("number");
		
		session.setAttribute("user", number);
		
		User user=new User();
		
		user.setNumber(number);
		
		String tips="";
		
		
		User m=userService.getUser(user);
		
		if (m!=null) {
			
			tips="登录成功";
			
		}else {
			userService.addUser(user);
			
			tips="已帮你注册，并登录";
		}
		
		
		
		return new ReponseVo(0,tips,"");
	}
	
	@RequestMapping(path="/vote",method=RequestMethod.POST)
	public ReponseVo<String[]> putVotes(@RequestBody HashMap<String, Integer> param,HttpSession session) {
	
		
		String number=(String)session.getAttribute("user");
		User user=new User();
		
		System.out.println(number);
		
		user.setNumber(number);
		
		int m=userService.getUser(user).getId();
		
		System.out.println("m:"+m);
		
		int id=param.get("id");
		String[] data=new String[12];
		
		String tips=null;
		
		int n=teauserService.getUser(m);
		//是否投过票
		if (n==0) {
			
			
			teabrandService.updateVotes(id);
			
			TeaUser teaUser=new TeaUser();
			
			teaUser.setUserId(m);
			
			teaUser.setTeabrandId(id);
			
			teauserService.addUser(teaUser);
			
			List<Integer> list=teabrandService.getVotes();
			
			for (int i = 0; i < list.size(); i++) {
				
				data[i]="投票("+list.get(i)+")";
				
				//System.out.println(data[i]);
				
			}
			
		}else {
			tips="你已投过票了";
		}
		
		
		
		return new ReponseVo<String[]>(0,tips,data);
	}
	
	@RequestMapping(path="/listvote",method=RequestMethod.GET)
	public ReponseVo<String[]> listVotes() {
		
		String[] data=new String[12];
		
		List<Integer> list=teabrandService.getVotes();
		
		for (int i = 0; i < list.size(); i++) {
			
			data[i]="投票("+list.get(i)+")";
			
			//System.out.println(data[i]);
			
		}
		
		
		return new ReponseVo<String[]>(0,"",data);
		
	}
	
	@RequestMapping(path="/chart",method=RequestMethod.GET)
	public ReponseVo<int[]> getVotes() {
		
		int[] data=new int[8];
		
		List<TeaBrand> list=teabrandService.listTeabrands();
		
		for (int i = 0; i <list.size(); i++) {
			
			TeaBrand t=list.get(i);
			
			data[i]=t.getVotes();
			
			//System.out.println("排名"+data[i]);
			
		}
		
		return new ReponseVo<int[]>(0,"",data);
		
	}
	
}
