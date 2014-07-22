package com.sanjay31321.sys.preset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sanjay31321.sys.preset.data.InsertCourse;
import com.sanjay31321.sys.preset.data.InsertFeedback;
import com.sanjay31321.sys.preset.data.InsertQuestion;
import com.sanjay31321.sys.preset.data.InsertQuestionSet;
import com.sanjay31321.sys.preset.data.InsertStudent;
import com.sanjay31321.sys.preset.data.InsertSubject;
import com.sanjay31321.sys.preset.data.InsertTeacher;
import com.sanjay31321.sys.preset.data.InsertUser;
import com.sanjay31321.sys.preset.data.InsertUserRole;

public class DefaultDataInstall {
	
	private static final Logger logger = LoggerFactory.getLogger(DefaultDataInstall.class);
	
	public void install() {
		
		InsertUserRole role = new InsertUserRole();
		role.insert();
		logger.info("User Role data is installed");
		
		InsertCourse course = new InsertCourse();
		course.insert();
		logger.info("Course data is installed");
		
		InsertQuestionSet question_set = new InsertQuestionSet();
		question_set.insert();
		logger.info("Question Set data is installed");
		
		InsertUser user = new InsertUser();
		user.insert();
		logger.info("User data is installed");
		
		InsertTeacher teacher = new InsertTeacher();
		teacher.insert();
		logger.info("Teacher data is installed");
		
		InsertStudent student = new InsertStudent();
		student.insert();
		logger.info("Student data is installed");
		
		InsertSubject subject = new InsertSubject();
		subject.insert();
		logger.info("Subject data is installed");
				
		InsertQuestion question = new InsertQuestion();
		question.insert();
		logger.info("Question data is installed");
		
		InsertFeedback feedback = new InsertFeedback();
		feedback.insert();
		logger.info("Feedback data is installed");
	}
}
