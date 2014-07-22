package com.sanjay31321.sys.service;

import java.util.List;

import com.sanjay31321.sys.model.Student;

public interface StudentService {
	public List<Student> studentList();
	public void addStudent(Student student);
	public void deleteStudent(int id);
	public void editStudent(Student student);
	public Student getStudent(int id);
}
