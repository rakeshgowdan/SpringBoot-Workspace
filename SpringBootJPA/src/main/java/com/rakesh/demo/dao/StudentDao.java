package com.rakesh.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rakesh.demo.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	

	public Student findByName(String name);
}
