package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	@Autowired
	private SystemLaptop sl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("In Student.show()--->Student Class");
		sl.load();
	}
}
