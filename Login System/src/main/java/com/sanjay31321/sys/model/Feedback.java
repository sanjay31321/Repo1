package com.sanjay31321.sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name="feedback")
public class Feedback {
	
	@Id @Column @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="feedback_name")
	private String name;
	
	@ManyToOne
    @JoinColumn(name="subject_id")
	private Subject subject;
	
	@ManyToOne
    @JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	@ManyToOne
    @JoinColumn(name="question_set_id")
	private Question_Set question_set;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Question_Set getQuestion_set() {
		return question_set;
	}
	public void setQuestion_set(Question_Set question_set) {
		this.question_set = question_set;
	}
}
