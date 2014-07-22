package com.sanjay31321.sys.service;

import java.util.List;

import com.sanjay31321.sys.model.Course;
import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.model.Teacher;
import com.sanjay31321.sys.model.User;

public interface UserService {
	public User findUserForLogin(String email, String password);
	public List<User> getAllUsers();
	public User userExists(String email);
	public void resetPassword(User user);
	public Teacher getTeacher(int id);
	public Student getStudent(int id);
	public Course getCourse(int id);
	public List<Course> getCourseList();
	public void Register(User user);
	public void registerTeacher(Teacher teacher);
	public void registerStudent(Student student);
	public User getUser(int id);
}
