package com.sanjay31321.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanjay31321.sys.dao.StudentDao;
import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Transactional
	public List<Student> studentList() {
		return studentDao.studentList();
	}

	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Transactional
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}

	@Transactional
	public void editStudent(Student student) {
		studentDao.editStudent(student);
	}

	@Transactional
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}
}
