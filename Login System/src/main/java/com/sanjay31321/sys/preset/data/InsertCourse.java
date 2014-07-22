package com.sanjay31321.sys.preset.data;

import com.sanjay31321.sys.model.Course;
import com.sanjay31321.sys.service.CourseService;

public class InsertCourse {
	private CourseService courseService;
	public void insert() {
		Course course = new Course();
		
		course.setId(1);
		course.setName("MS Information Technology");
		courseService.addCourse(course);
		
		course.setId(2);
		course.setName("MS Medical Software");
		courseService.addCourse(course);
		
		course.setId(3);
		course.setName("MS Embedded System");
		courseService.addCourse(course);
		
		course.setId(4);
		course.setName("MS VLSI Design");
		courseService.addCourse(course);
	}
}
