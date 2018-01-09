package com.zuikc.dao;

import java.util.List;

import com.zuikc.entity.Dept;

public interface DeptMapper {
	public List<Dept> queryAll();
	public void addDept(Dept dept);
	public void deleteDeptById(int id);
}
