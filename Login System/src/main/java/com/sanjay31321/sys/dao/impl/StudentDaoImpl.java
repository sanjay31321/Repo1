package com.sanjay31321.sys.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanjay31321.sys.dao.StudentDao;
import com.sanjay31321.sys.model.Student;


@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> studentList() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public void addStudent(Student student) {
		session.getCurrentSession().save(student);
	}

	@Override
	public void deleteStudent(int id) {
		session.getCurrentSession().delete(getStudent(id));
	}

	@Override
	public void editStudent(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public Student getStudent(int id) {
		return (Student)session.getCurrentSession().get(Student.class, id);
	}
}
