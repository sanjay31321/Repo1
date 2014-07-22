package com.sanjay31321.sys.dao;

import java.util.List;

import com.sanjay31321.sys.model.Course;
import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.model.Teacher;
import com.sanjay31321.sys.model.User;

public interface UserDao {
	public User findUserForLogin(String email, String password);
	public List<User> getAllUsers();
	public User getUserByEmail(String email);
	public void resetPassword(User user);
	public Teacher getTeacher(int id);
	public Student getStudent(int id);
	public Course getCourse(int id);
	public void Register(User user);
	public void registerTeacher(Teacher teacher);
	public void registerStudent(Student student);
	public List<Course> getCourseList();
	public User getUser(int id);
}
