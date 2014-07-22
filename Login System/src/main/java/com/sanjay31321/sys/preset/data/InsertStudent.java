package com.sanjay31321.sys.preset.data;

import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.service.CourseService;
import com.sanjay31321.sys.service.StudentService;
import com.sanjay31321.sys.service.UserService;

public class InsertStudent {
	private UserService userService;
	private StudentService studentService;
	private CourseService courseService;
	
	public void insert() {
		Student student = new Student();
		
		student.setId(1);
		student.setFirst_name("Nakul");
		student.setLast_name("Bhoomkar");
		student.setUser(userService.getUser(4));
		student.setCourse(courseService.getCourse(1));
		studentService.addStudent(student);
		
		student.setId(2);
		student.setFirst_name("Sanjay");
		student.setLast_name("Kumar");
		student.setUser(userService.getUser(5));
		student.setCourse(courseService.getCourse(2));
		studentService.addStudent(student);
		
		student.setId(3);
		student.setFirst_name("Adam");
		student.setLast_name("Smith");
		student.setUser(userService.getUser(6));
		student.setCourse(courseService.getCourse(3));
		studentService.addStudent(student);
		
		student.setId(4);
		student.setFirst_name("Xia");
		student.setLast_name("Han");
		student.setUser(userService.getUser(7));
		student.setCourse(courseService.getCourse(4));
		studentService.addStudent(student);
		
		student.setId(5);
		student.setFirst_name("Sam");
		student.setLast_name("Jones");
		student.setUser(userService.getUser(8));
		student.setCourse(courseService.getCourse(2));
		studentService.addStudent(student);
		
	}
}
