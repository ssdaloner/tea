package com.zhiyou100.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.TeaGradeDao;
import com.zhiyou100.model.TeaLeaf;
import com.zhiyou100.model.Teagrade;
import com.zhiyou100.service.TeaGradeService;

@Service
public class TeaGradeServiceImpl implements TeaGradeService{

	@Autowired
	private TeaGradeDao dao;
	
	public List<Teagrade> listTeagrade() {
		
		return dao.listTeagrade();
	}

	public Long getTeagradeId(TeaLeaf teaLeaf) {
		
		return null;
	}
	
	//===========================================================================
	public TeaLeaf method1(Teagrade teagrade, TeaLeaf tLeaf) {
		
		tLeaf.setTeagradeId(teagrade.getId());
		
		tLeaf.setGradeName(teagrade.getName());
		
		double[] t= {tLeaf.getShape(),tLeaf.getColor(),tLeaf.getPurity(),tLeaf.getSoupColor(),tLeaf.getSweetSmell(),tLeaf.getSmell(),tLeaf.getLeafButtom()};
		
		double[] s= {teagrade.getShape(),teagrade.getColor(),teagrade.getPurity(),teagrade.getSoupColor(),teagrade.getSweetSmell(),teagrade.getSmell(),teagrade.getLeafButtom()};
		
		
		/**
		 * 每列最小和
		 */
		double sum = 0;
		double sumall = 0;
		for (int i = 0; i < s.length; i++) {

			sum += s[i] < t[i] ? s[i] : t[i];
			sumall += s[i] + t[i];

		}
		double r = 2 * sum / sumall;
		
		tLeaf.setR(r);

		return tLeaf;
	}

	public TeaLeaf method2(ArrayList<TeaLeaf> al) {
		
		double a1max = al.get(0).getR();
		int maxindex = 0;
		for (int i = 1; i < al.size(); i++) {
			if (a1max < al.get(i).getR()) {

				a1max = al.get(i).getR();
				maxindex = i;

				
			}

			
		}

		//TeaLeaf tLeaf=al.get(maxindex);
		
		
		
		return al.get(maxindex);
	}
	
	public ArrayList<TeaLeaf> method3(List<Teagrade> aList, TeaLeaf tLeaf) {

		//tLeaf.setTeagradeId(teagrade.getId());

		//tLeaf.setGradeName(teagrade.getName());
		
		TeaLeaf t1=new TeaLeaf();
		TeaLeaf t2=new TeaLeaf();
		TeaLeaf t3=new TeaLeaf();
		TeaLeaf t4=new TeaLeaf();
		TeaLeaf t5=new TeaLeaf();
		TeaLeaf t6=new TeaLeaf();
		TeaLeaf t7=new TeaLeaf();
		
		ArrayList<TeaLeaf> aList2=new ArrayList<TeaLeaf>();
		
		aList2.add(t1);
		aList2.add(t2);
		aList2.add(t3);
		aList2.add(t4);
		aList2.add(t5);
		aList2.add(t6);
		aList2.add(t7);
		
		double[] t= {tLeaf.getShape(),tLeaf.getColor(),tLeaf.getPurity(),tLeaf.getSoupColor(),tLeaf.getSweetSmell(),tLeaf.getSmell(),tLeaf.getLeafButtom()};

		for (int i1=0;i1<aList.size();i1++) {
			
			
			
			Teagrade teagrade=aList.get(i1);
			
			double[] s= {teagrade.getShape(),teagrade.getColor(),teagrade.getPurity(),teagrade.getSoupColor(),teagrade.getSweetSmell(),teagrade.getSmell(),teagrade.getLeafButtom()};


			/**
			 * 每列最小和
			 */
			double sum = 0;
			double sumall = 0;
			for (int i = 0; i < s.length; i++) {

				sum += s[i] < t[i] ? s[i] : t[i];
				sumall += s[i] + t[i];

			}
			double r = 2 * sum / sumall;

			tLeaf.setR(r);
			
			aList2.get(i1).setTeagradeId(teagrade.getId());
			
			aList2.get(i1).setGradeName(teagrade.getName());
			
			aList2.get(i1).setR(r);
			
		}

		return aList2;
	}

}
