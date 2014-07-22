package com.sanjay31321.sys.controller;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanjay31321.sys.model.Course;
import com.sanjay31321.sys.service.CourseService;

@Controller
public class CourseController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping(value = "/coursemanager", method = RequestMethod.GET)
	public String getcoursemanager(@ModelAttribute("course") Course course, Locale locale, Map<String, Object> map) {
		logger.info("Welcome to Course Manager page ! The client locale is {}.", locale);		
		map.put("courseList", courseService.courseList());
		return "coursemanager";
	}
	
	@RequestMapping(value="/coursemanager", method=RequestMethod.POST)
	public String postcoursemanager(@Valid  Course course, BindingResult result, HttpServletRequest req, Map<String, Object> map){
			
		if(!course.getName().isEmpty()) {
			Course newcourse = courseService.courseExists(course.getName());			
			if(newcourse==null) {
				courseService.addCourse(course);
				logger.info("Course registered successfully");
			} else {
				logger.error("Course already exists ");
			}
		} else {
			logger.error("Course Name must not empty ");
		}
		map.put("courseList", courseService.courseList());
		return "coursemanager";
	}
	
	@RequestMapping(value = "/editcourse", method = RequestMethod.GET)
	public String geteditcourse(@ModelAttribute("course") @RequestParam("id")int id, Course course, Locale locale, Map<String, Object> map) {
		logger.info("Welcome to Edit Course page ! The client locale is {}.", locale);		
		map.put("course", courseService.getCourse(id));
		return "editcourse";
	}


	@RequestMapping(value = "/editcourse", method = RequestMethod.POST)
	public String posteditcourse(@Valid @ModelAttribute("course") Course course, BindingResult result, Locale locale, HttpServletRequest req, Map<String, Object> map) {
		logger.info("Welcome to Edit Course page ! The client locale is {}.", locale);
		if(!course.getName().isEmpty()) {
			if(courseService.courseExists(course.getName())==null) {
				courseService.editCourse(course);
				logger.debug("course edit success");
				return "redirect:coursemanager.html";
			} else {
				logger.error("course already exists");
				return "redirect:editcourse.html?id="+course.getId();
			}
		} else {
			return "redirect:editcourse.html?id="+course.getId();
		}
	}

}