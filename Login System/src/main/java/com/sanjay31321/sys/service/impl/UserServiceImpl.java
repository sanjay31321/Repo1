package com.sanjay31321.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanjay31321.sys.dao.UserDao;
import com.sanjay31321.sys.model.Course;
import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.model.Teacher;
import com.sanjay31321.sys.model.User;
import com.sanjay31321.sys.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public User findUserForLogin(String email, String password) {
		return userDao.findUserForLogin(email, password);
	}

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Transactional
	public User userExists(String email) {
		return userDao.getUserByEmail(email);
	}

	@Transactional
	public Teacher getTeacher(int id) {
		return userDao.getTeacher(id);
	}

	@Transactional
	public Student getStudent(int id) {
		return userDao.getStudent(id);
	}

	@Transactional
	public Course getCourse(int id) {
		return userDao.getCourse(id);
	}

	@Transactional
	public List<Course> getCourseList() {
		return userDao.getCourseList();
	}

	@Transactional
	public void Register(User user) {
		userDao.Register(user);
	}

	@Transactional
	public void registerTeacher(Teacher teacher) {
		userDao.registerTeacher(teacher);	
	}

	@Transactional
	public void registerStudent(Student student) {
		userDao.registerStudent(student);
	}

	@Transactional
	public void resetPassword(User user) {
		userDao.resetPassword(user);	
	}

	@Transactional
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	
}
