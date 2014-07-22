package com.sanjay31321.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanjay31321.sys.dao.TeacherDao;
import com.sanjay31321.sys.model.Teacher;
import com.sanjay31321.sys.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private TeacherDao teacherDao;

	@Transactional
	public List<Teacher> teacherList() {
		return teacherDao.teacherList();
	}

	@Transactional
	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);
	}

	@Transactional
	public void deleteTeacher(int id) {
		teacherDao.deleteTeacher(id);
	}

	@Transactional
	public void editTeacher(Teacher teacher) {
		teacherDao.editTeacher(teacher);
	}

	@Transactional
	public Teacher getTeacher(int id) {
		return teacherDao.getTeacher(id);
	}
}
