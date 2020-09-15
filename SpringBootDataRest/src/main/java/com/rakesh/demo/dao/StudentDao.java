package com.rakesh.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rakesh.demo.model.Student;

@RepositoryRestResource(collectionResourceRel ="students",path="students")
public interface StudentDao extends JpaRepository<Student, Integer> {
	

	public Student findByName(String name);
}
