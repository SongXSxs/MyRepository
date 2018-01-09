package com.zuikc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zuikc.entity.Dept;
import com.zuikc.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	private DeptService ds;
	
	@RequestMapping("/queryAll")
	public String queryAll(HttpServletRequest request) {
		List<Dept> list = ds.queryAll();
		request.setAttribute("depts", list);
		return "showDepts";
	}
	@RequestMapping("/deleteDept/{id}")
	public String deleteDeptById(@PathVariable("id")int id) {
		ds.deleteDeptById(id);
		
		return "forward:../queryAll";
	}
}
