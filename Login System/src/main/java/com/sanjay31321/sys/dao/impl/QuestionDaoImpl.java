package com.sanjay31321.sys.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanjay31321.sys.dao.QuestionDao;
import com.sanjay31321.sys.model.Question;


@Repository
public class QuestionDaoImpl implements QuestionDao{

	@Autowired
	private SessionFactory session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Question> questionList() {
		return session.getCurrentSession().createQuery("from Question").list();
	}

	@Override
	public void addQuestion(Question question) {
		session.getCurrentSession().save(question);
	}

	@Override
	public void deleteQuestion(int id) {
		session.getCurrentSession().delete(getQuestion(id));
	}

	@Override
	public void editQuestion(Question question) {
		session.getCurrentSession().update(question);
	}

	@Override
	public Question getQuestion(int id) {
		return (Question)session.getCurrentSession().get(Question.class, id);
	}
}
