package com.sanjay31321.sys.service;

import java.util.List;

import com.sanjay31321.sys.model.Question;

public interface QuestionService {
	public List<Question> questionList();
	public void addQuestion(Question question);
	public void deleteQuestion(int id);
	public void editQuestion(Question question);
	public Question getQuestion(int id);
}
