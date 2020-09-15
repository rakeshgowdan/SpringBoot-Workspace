package com.rakesh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rakesh.demo.dao.StudentDao;
import com.rakesh.demo.model.Student;

@Controller
public class HomeController {

	@Autowired
	StudentDao sd;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home controller->home req map");
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student s) {
		sd.save(s);
		System.out.println("data added");
		return "home";
	}
}
