package com.rakesh.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.rakesh.demo.model.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {
	

	public Student findByName(String name);
}
