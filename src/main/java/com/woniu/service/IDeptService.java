package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {
	void save(Dept dept);

	void delete(Dept dept);
	void update(Dept dept);

	Dept findOne(Integer id);
	List<Dept> findAll();
}
