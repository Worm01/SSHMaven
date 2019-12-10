package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptDAO {
	void save(Dept dept);
	Dept findOne(Integer id);
	List<Dept> findAll();
}
