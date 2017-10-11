package com.zhiyou100.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhiyou100.model.ReponseVo;


public class LoginFilter extends HandlerInterceptorAdapter {

	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object obj) throws Exception{
		
		
		HttpSession session =request.getSession();
		
		Object user=session.getAttribute("user");
		
		if (user==null) {
			
			ReponseVo<String> vo=new ReponseVo<String>(-1000,"你需要进行登录",null);
			
			
			ObjectMapper om=new ObjectMapper();
			
			String json=om.writeValueAsString(vo);
			
			//设置返回的数据格式是json
			
			response.setContentType("application/json;charset=utf-8");
			
			response.getWriter().print(json);
			
			//System.out.println("我生效了");
			
			return false;
			
		}else {
			
			//System.out.println("我也生效了");
			
			return true;
		}
		
	}
}
