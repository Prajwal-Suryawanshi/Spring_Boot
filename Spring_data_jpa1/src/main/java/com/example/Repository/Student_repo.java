package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.Student;


//public interface Student_repo extends CrudRepository<Student, Integer>{
	public interface Student_repo extends JpaRepository<Student, Integer>{

	Student findByName(String name);
	Student findByIdAndName(Integer id, String name);
	List<Student> findByOrderByNameDesc();
	/*
	@Query("select u from StudentData_JPA u where u.id=?1 and u.name=?2")
	Student selectbyIdandname(Integer id, String Name);
	*/
}
