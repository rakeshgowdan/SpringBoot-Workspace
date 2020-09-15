package com.rakesh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("/getStudent")
	public ModelAndView  getStudent(@RequestParam String sid)
	{
		ModelAndView mv=new ModelAndView("showStudent");
		Student student=sd.findById(Integer.parseInt(sid)).orElse(new Student());
		mv.addObject(student);
		return mv;
	}
}
