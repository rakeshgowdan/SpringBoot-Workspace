package com.rakesh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/addStudent")
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
	@RequestMapping("/getStudentbyName")
	public ModelAndView getStudentbyName(@RequestParam String sname) {
		ModelAndView mv=new ModelAndView("showStudent");
		Student student=sd.findByName(sname);
		mv.addObject(student);
		return mv;
	}
	
	//@RequestMapping(path="/students",produces={"application/xml"})
	@RequestMapping("/students")
	@ResponseBody
	public List<Student> getAllStudents() {
		return sd.findAll();
	}
	@RequestMapping("/student/{sid}")
	@ResponseBody
	public Optional<Student> getStudent(@PathVariable("sid") int sid) {
		return sd.findById(sid);
	}
	@PostMapping("/student")
	@ResponseBody
	public Student addStudent1(Student s){
		sd.save(s);
		return s;
	}
	@DeleteMapping("/student/{sid}")
	@ResponseBody
	public String deleteStduent(@PathVariable("sid") int sid) {
		Student s=sd.getOne(sid);
		sd.delete(s);
		return "Deleted";
		
	}
	@PutMapping(path="/Ustudents",consumes = {"application/json"})
	@ResponseBody
	public Student saveOrUpdateStudent(@RequestBody Student s) {
		sd.save(s);
		System.out.println("data added");
		return s;
	}
}
