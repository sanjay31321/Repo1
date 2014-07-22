package com.sanjay31321.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sanjay31321.sys.model.Course;
import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.model.Teacher;
import com.sanjay31321.sys.model.User;
import com.sanjay31321.sys.service.UserService;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid User user, BindingResult result, HttpServletRequest req){
		
		logger.info("User is trying to log in with: Email: " + user.getEmail()
				+ " with password: " + user.getPassword());
		User loggedInUser = userService.findUserForLogin(user.getEmail(),user.getPassword());
		
		if(loggedInUser != null) {
			req.getSession().setAttribute("loggedInUserEMAIL", loggedInUser.getEmail());
			if(loggedInUser.isActive()) {
				switch(loggedInUser.getUser_role().getId()){
					case 1:
						req.getSession().setAttribute("loggedInUserROLE", "ROLE_ADMIN");
						req.getSession().setAttribute("loggedInUserNAME", "ADMIN");
						return "redirect:admin.html";
					case 2: 
						req.getSession().setAttribute("loggedInUserROLE", "ROLE_TEACHER");
						Teacher teacher = userService.getTeacher(loggedInUser.getId());
						req.getSession().setAttribute("loggedInUserNAME", teacher.getFirst_name() + " " + teacher.getLast_name());						
						return "redirect:teacher.html";
					case 3:
						req.getSession().setAttribute("loggedInUserROLE", "ROLE_STUDENT");
						Student student = userService.getStudent(loggedInUser.getId());
						req.getSession().setAttribute("loggedInUserNAME", student.getFirst_name() + " " + student.getLast_name());
						Course course = userService.getCourse(student.getCourse().getId());
						req.getSession().setAttribute("loggedInUserCOURSE", course.getName());
						return "redirect:student.html";
				}
			} else {
				logger.error("User is not active" + loggedInUser.getEmail());
				return "notactive";
			}
			return "admin";
		} else {
			logger.error("Login failed ! User Does not Exists !");
			return "login";
		}		
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(@Valid User user, BindingResult result, HttpServletRequest req){
		
		User newuser = userService.userExists(user.getEmail());
		if(newuser == null) {
			logger.info(" " + user.getPassword() +" / "+ user.getConfirm_password()+" "+user.getUser_role().getId());
			if(user.getPassword().equals(user.getConfirm_password())) {
				if(user.getUser_role().getId()==2) {
					
					userService.Register(user);
					
					Teacher teacher = new Teacher();
					teacher.setFirst_name(user.getFirst_name());
					teacher.setLast_name(user.getLast_name());
					teacher.setUser(user);
					userService.registerTeacher(teacher);
					logger.info("Registration Successful.");
					return "signupsuccess";
				} else if(user.getUser_role().getId()==3) {
					userService.Register(user);
					Student student = new Student();
					student.setFirst_name(user.getFirst_name());
					student.setLast_name(user.getLast_name());
					student.setUser(user);
					student.setCourse(userService.getCourse(user.getCourse_id()));
					userService.registerStudent(student);
					logger.info("Registration Successful.");
					return "signupsuccess";
				} else {
					logger.error("role does not exists");
				}
			} else {
				logger.error("Password must match.");
			}
			
		} else {
			logger.error("User already exists with this email : " +user.getEmail());
		}
		return "signup";
	}
}
