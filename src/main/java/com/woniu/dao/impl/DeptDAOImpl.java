package com.woniu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;

@Repository
public class DeptDAOImpl implements IDeptDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Dept dept) {
		sessionFactory.getCurrentSession().save(dept);

	}

	

}
