package com.sanjay.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentAdmissionController {

	@ResponseBody
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getStudentList() {
		
		System.out.println("Inside BodyF");
		List<Student> stuList = new ArrayList<Student>();
		//ApplicationContext context = null;

		//context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		//Student student1 = (Student) context.getBean("student");
		Student student1=new Student();
		student1.setStudentName("Sanjay");
		student1.setStudentHobby("Cricket");
		stuList.add(student1);
		Student student2=new Student();
		student1.setStudentName("Kumar");
		student1.setStudentHobby("FootBAll");
		stuList.add(student2);
		Student student3=new Student();
		student1.setStudentName("Shashi");
		student1.setStudentHobby("Chess");
		stuList.add(student3);

		return stuList;
	}

}
