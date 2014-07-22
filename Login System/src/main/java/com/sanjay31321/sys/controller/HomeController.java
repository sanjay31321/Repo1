package com.sanjay31321.sys.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sanjay31321.sys.model.Student;
import com.sanjay31321.sys.model.User;
import com.sanjay31321.sys.service.UserService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute("user") User user, Locale locale, Map<String, Object> map) {
		logger.info("Welcome to Sign Up page ! The client locale is {}.", locale);	
		map.put("courseList", userService.getCourseList());
		return "signup";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Login page ! The client locale is {}.", locale);		
		return "login";
	}
	
	@RequestMapping(value = "/forgetpassword", method = RequestMethod.GET)
	public String forgetpassword(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Forget Password page ! The client locale is {}.", locale);		
		return "forgetpassword";
	}
	
	@RequestMapping(value = "/verifysecurityquestion", method = RequestMethod.GET)
	public String verifysecurityquestion(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Verify Security Question page ! The client locale is {}.", locale);
		return "verifysecurityquestion";
	}
	
	
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String resetpassword(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Reset Password page ! The client locale is {}.", locale);
		return "reset";
	}
	@RequestMapping(value = "/resetsuccess", method = RequestMethod.GET)
	public String resetsuccess(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Reset Password Success page ! The client locale is {}.", locale);
		return "resetsuccess";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Admin's Dashboard page ! The client locale is {}.", locale);		
		return "admin";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Student's Dashboard Page ! The client locale is {}.", locale);		
		return "student";
	}
	
	@RequestMapping(value = "/teacher", method = RequestMethod.GET)
	public String teacher(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Teacher's Dashboard page ! The client locale is {}.", locale);		
		return "teacher";
	}
	
	@RequestMapping(value = "/notactive", method = RequestMethod.GET)
	public String notactive(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Not Active page ! The client locale is {}.", locale);		
		return "notactive";
	}
	
		
	@RequestMapping(value = "/teachermanager", method = RequestMethod.GET)
	public String teachermanager(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Teacher Manager page ! The client locale is {}.", locale);		
		return "teachermanager";
	}
	
	@RequestMapping(value = "/studentmanager", method = RequestMethod.GET)
	public String studentmanager(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Student Manager page ! The client locale is {}.", locale);		
		return "studentmanager";
	}
	@RequestMapping(value = "/subjectmanager", method = RequestMethod.GET)
	public String subjectmanager(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Subject Manager page ! The client locale is {}.", locale);		
		return "subjectmanager";
	}
	@RequestMapping(value = "/assignsubjectstocourse", method = RequestMethod.GET)
	public String assignsubjectstocourse(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Assign Subjects to Course page ! The client locale is {}.", locale);		
		return "assignsubjectstocourse";
	}
	@RequestMapping(value = "/assignsubjectstoteacher", method = RequestMethod.GET)
	public String assignsubjectstoteacher(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Assign Subjects to Teacher page ! The client locale is {}.", locale);		
		return "assignsubjectstoteacher";
	}
	@RequestMapping(value = "/assigncoursetostudent", method = RequestMethod.GET)
	public String assigncoursetostudent(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Assign Course to Student page ! The client locale is {}.", locale);		
		return "assigncoursetostudent";
	}
	@RequestMapping(value = "/usermanager", method = RequestMethod.GET)
	public String usermanager(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to User Manager page ! The client locale is {}.", locale);		
		return "usermanager";
	}
	@RequestMapping(value = "/feedbackmanager", method = RequestMethod.GET)
	public String feedbackmanager(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Feedback Manager page ! The client locale is {}.", locale);		
		return "feedbackmanager";
	}
	@RequestMapping(value = "/questionsetmanager", method = RequestMethod.GET)
	public String questionsetmanager(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Question Set Manager page ! The client locale is {}.", locale);		
		return "questionsetmanager";
	}
	@RequestMapping(value = "/createquestionset", method = RequestMethod.GET)
	public String createquestionset(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Create Question Set page ! The client locale is {}.", locale);		
		return "createquestionset";
	}
	@RequestMapping(value = "/createquestion", method = RequestMethod.GET)
	public String createquestion(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Create Question page ! The client locale is {}.", locale);		
		return "createquestion";
	}
	@RequestMapping(value = "/createfeedback", method = RequestMethod.GET)
	public String createfeedback(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Create Question Set page ! The client locale is {}.", locale);		
		return "createfeedback";
	}
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to User Profile page ! The client locale is {}.", locale);		
		return "profile";
	}
	@RequestMapping(value = "/studentprofile", method = RequestMethod.GET)
	public String studentprofile(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Welcome to Student Profile page ! The client locale is {}.", locale);		
		return "studentprofile";
	}
	@RequestMapping(value = "/signupsuccess", method = RequestMethod.GET)
	public String signupsuccess(@ModelAttribute("user") User user, Locale locale) {
		logger.info("Registered Successfully ! Waiting for Approval.  The client locale is {}.", locale);		
		return "signupsuccess";
	}
	@RequestMapping(value = "/studentsignup", method = RequestMethod.GET)
	public String studentsignup(@ModelAttribute("student") Student student, Locale locale) {
		logger.info("Welcome to Student Signup page ! The client locale is {}.", locale);		
		return "studentsignup";
	}
}
