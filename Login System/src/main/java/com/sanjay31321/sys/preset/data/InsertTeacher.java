package com.sanjay31321.sys.preset.data;

import com.sanjay31321.sys.model.Teacher;
import com.sanjay31321.sys.service.TeacherService;
import com.sanjay31321.sys.service.UserService;

public class InsertTeacher {
	private TeacherService teacherService;
	private UserService userService;
	
	public void insert() {
		Teacher teacher = new Teacher();
		
		teacher.setId(1);
		teacher.setFirst_name("Samuel");
		teacher.setLast_name("Kidane");
		teacher.setUser(userService.getUser(2));
		teacherService.addTeacher(teacher);
		
		teacher.setId(2);
		teacher.setFirst_name("Adam");
		teacher.setLast_name("Smith");
		teacher.setUser(userService.getUser(3));
		teacherService.addTeacher(teacher);
	}

}
