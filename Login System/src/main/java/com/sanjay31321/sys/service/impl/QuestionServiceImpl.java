package com.sanjay31321.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanjay31321.sys.dao.QuestionDao;
import com.sanjay31321.sys.model.Question;
import com.sanjay31321.sys.service.QuestionService;



@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionDao questionDao;

	@Transactional
	public List<Question> questionList() {
		return questionDao.questionList();
	}

	@Transactional
	public void addQuestion(Question question) {
		questionDao.addQuestion(question);
	}

	@Transactional
	public void deleteQuestion(int id) {
		questionDao.deleteQuestion(id);
	}

	@Transactional
	public void editQuestion(Question question) {
		questionDao.editQuestion(question);
	}

	@Transactional
	public Question getQuestion(int id) {
		return questionDao.getQuestion(id);
	}
}
