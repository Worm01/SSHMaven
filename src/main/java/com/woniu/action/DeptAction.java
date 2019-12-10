package com.woniu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Controller
@Scope("prototype")//多例
public class DeptAction {
	private List<Dept> list=new ArrayList<Dept>();
	private Dept dept;
	@Autowired
	private IDeptService ds;
	
	public List<Dept> getList() {
		return list;
	}

	public void setList(List<Dept> list) {
		this.list = list;
	}

	public Dept getDept() {
		return dept;
	}	
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public String save() {
		ds.save(dept);
		return "success";
	}
	
	public String findOne(Dept dept) {
		Dept Deptone= ds.findOne(dept.getDeptno());
		return "success";
	}
}
