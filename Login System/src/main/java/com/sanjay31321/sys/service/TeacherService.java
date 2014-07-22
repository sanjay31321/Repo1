package com.sanjay31321.sys.service;

import java.util.List;

import com.sanjay31321.sys.model.Teacher;


public interface TeacherService {
	public List<Teacher> teacherList();
	public void addTeacher(Teacher teacher);
	public void deleteTeacher(int id);
	public void editTeacher(Teacher teacher);
	public Teacher getTeacher(int id);
}
