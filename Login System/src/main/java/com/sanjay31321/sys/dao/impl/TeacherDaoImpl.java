package com.sanjay31321.sys.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanjay31321.sys.dao.TeacherDao;
import com.sanjay31321.sys.model.Teacher;


@Repository
public class TeacherDaoImpl implements TeacherDao{

	@Autowired
	private SessionFactory session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> teacherList() {
		return session.getCurrentSession().createQuery("from Teacher").list();
	}

	@Override
	public void addTeacher(Teacher teacher) {
		session.getCurrentSession().save(teacher);
	}

	@Override
	public void deleteTeacher(int id) {
		session.getCurrentSession().delete(getTeacher(id));
	}

	@Override
	public void editTeacher(Teacher teacher) {
		session.getCurrentSession().update(teacher);
	}

	@Override
	public Teacher getTeacher(int id) {
		return (Teacher)session.getCurrentSession().get(Teacher.class, id);
	}
}
