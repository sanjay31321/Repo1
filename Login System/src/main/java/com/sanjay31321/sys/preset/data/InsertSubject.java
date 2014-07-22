package com.sanjay31321.sys.preset.data;

import com.sanjay31321.sys.model.Subject;
import com.sanjay31321.sys.service.CourseService;
import com.sanjay31321.sys.service.SubjectService;

public class InsertSubject {
	private SubjectService subjectService;
	private CourseService courseService;
	public void insert() {
		
		Subject subject = new Subject();
		
		subject.setId(1);
		subject.setName("Data Structures & Algorithms");
		subject.setCourse(courseService.getCourse(2));
		subjectService.addSubject(subject);
		
		subject.setId(2);
		subject.setName("Advanced Image Processing");
		subject.setCourse(courseService.getCourse(2));
		subjectService.addSubject(subject);
		
		subject.setId(3);
		subject.setName("Software Engineering");
		subject.setCourse(courseService.getCourse(2));
		subjectService.addSubject(subject);
	
		subject.setId(4);
		subject.setName("Linux Administration");
		subject.setCourse(courseService.getCourse(1));
		subjectService.addSubject(subject);
		
		subject.setId(5);
		subject.setName("Marketing Management");
		subject.setCourse(courseService.getCourse(1));
		subjectService.addSubject(subject);
		
		subject.setId(6);
		subject.setName("Programming Teachniques in Java");
		subject.setCourse(courseService.getCourse(1));
		subjectService.addSubject(subject);
		
		subject.setId(7);
		subject.setName("Embedded Systems Design");
		subject.setCourse(courseService.getCourse(3));
		subjectService.addSubject(subject);
		
		subject.setId(8);
		subject.setName("Digital Signal Processing");
		subject.setCourse(courseService.getCourse(3));
		subjectService.addSubject(subject);
		
		subject.setId(9);
		subject.setName("Designing with Microcontrollers");
		subject.setCourse(courseService.getCourse(4));
		subjectService.addSubject(subject);
		
		subject.setId(10);
		subject.setName("Real Time Operating Systems");
		subject.setCourse(courseService.getCourse(4));
		subjectService.addSubject(subject);
	}
}
