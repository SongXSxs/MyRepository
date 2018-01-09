package com.zuikc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuikc.dao.DeptMapper;
import com.zuikc.entity.Dept;
import com.zuikc.service.DeptService;
@Service("ds")
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<Dept> queryAll() {
		// TODO Auto-generated method stub
		return deptMapper.queryAll();
	}

	@Override
	public void addDept(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.addDept(dept);
	}

	@Override
	public void deleteDeptById(int id) {
		// TODO Auto-generated method stub
		deptMapper.deleteDeptById(id);
	}
	
}
