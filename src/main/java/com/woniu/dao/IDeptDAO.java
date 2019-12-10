package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptDAO {

	void delete(Dept dept);
	void update(Dept dept);
	void save(Dept dept);
	Dept findOne(Dept dept);
	List<Dept> findAll();
}
