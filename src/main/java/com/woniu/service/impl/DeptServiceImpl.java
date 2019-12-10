package com.woniu.service.impl;

import java.util.List;

import org.apache.taglibs.standard.tag.common.xml.TransformSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional//表示此类处理事务，自动处理事务
public class DeptServiceImpl implements IDeptService{
	@Autowired
	private IDeptDAO ddao;
	
	public IDeptDAO getDdao() {
		return ddao;
	}

	public void setDdao(IDeptDAO ddao) {
		this.ddao = ddao;
	}

	@Override
	public void save(Dept dept) {
		ddao.save(dept);
	}

	@Override
	public void delete(Dept dept) {
		ddao.delete(dept);
	}
	@Override
	public void update(Dept dept) {
		ddao.update(dept);
	}

	

}
