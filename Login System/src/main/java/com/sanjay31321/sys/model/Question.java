package com.sanjay31321.sys.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="question")
public class Question {
	
	@Id @Column @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="question")
	private String question;
	
	@ManyToOne
    @JoinColumn(name="question_id")
	private Question_Set question_set;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Question_Set getQuestion_set() {
		return question_set;
	}
	public void setQuestion_set(Question_Set question_set) {
		this.question_set = question_set;
	}
}
