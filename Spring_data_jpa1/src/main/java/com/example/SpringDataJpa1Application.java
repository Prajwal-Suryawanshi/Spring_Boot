package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Repository.Student_repo;
import com.example.entity.Student;

import io.micrometer.observation.Observation.Context;
import lombok.Setter;

@SpringBootApplication

public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpa1Application.class, args);
		
		Student_repo srepo=context.getBean(Student_repo.class);
		
		Student st= new Student();
		int a=8;
		switch(a) {
			case 1: 
				st.setName("Sanket");
				st.setAddress("sangli");
				srepo.save(st);
				break;
		
			case 2://findall method
				List<Student> list=(List<Student>) srepo.findAll();	
				list.forEach(student -> System.out.println(student));
				break;
			
			case 3://find one data
				st=srepo.findById(1).get();
				System.out.println(st);
				break;
		
			case 4:	//update 
				st=srepo.findById(3).get();
				st.setName("yash");
				st.setAddress("shirala");
				srepo.save(st);
				break;
				
			case 5:
				st=srepo.findByName("sanket");
				System.out.println(st);
				break;
				
			case 6:
				st=srepo.findByIdAndName(1, "Prajwal");
				System.out.println(st);
				break;
				
			case 7:
				List<Student> li=(List<Student>) srepo.findByOrderByNameDesc();
				li.forEach(x->System.out.println(x));
				break;
			/*	
			case 8:
				st=srepo.selectbyIdandname(1, "Prajwal");
				System.out.println(st);
				break;*/
		}
		
		
	}

}
