package com.sanjay31321.sys.preset.data;

import com.sanjay31321.sys.model.Feedback;
import com.sanjay31321.sys.service.FeedbackService;
import com.sanjay31321.sys.service.QuestionSetService;
import com.sanjay31321.sys.service.SubjectService;
import com.sanjay31321.sys.service.TeacherService;

public class InsertFeedback {
	private FeedbackService feedbackService;
	private TeacherService teacherService;
	private QuestionSetService questionSetService;
	private SubjectService subjectService;
	
	public void insert() {
		Feedback feedback = new Feedback();
		
		feedback.setId(1);
		feedback.setName("Feedback for Data Structures & Algorithms");
		feedback.setQuestion_set(questionSetService.getQuestionSet(1));
		feedback.setSubject(subjectService.getSubject(1));
		feedback.setTeacher(teacherService.getTeacher(2));
		feedbackService.addFeedback(feedback);
		
		feedback.setId(2);
		feedback.setName("Feedback for Advanced Image Processing");
		feedback.setQuestion_set(questionSetService.getQuestionSet(1));
		feedback.setSubject(subjectService.getSubject(2));
		feedback.setTeacher(teacherService.getTeacher(1));
		feedbackService.addFeedback(feedback);
		
	}
}
