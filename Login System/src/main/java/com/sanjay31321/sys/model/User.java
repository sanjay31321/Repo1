package com.sanjay31321.sys.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;





import org.hibernate.validator.constraints.Email;

@Entity @Table (name="user")
public class User {
	
	@Id @Column @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="email")  @Email
	private String email;
	
	@Column(name="password") 
	private String password;
	
	@Transient 
	private String confirm_password;
	
	@Transient 
	private String first_name;
	
	@Transient 
	private String last_name;
	
	@Transient 
	private int course_id;
	
	@Column(name="security_question")
	private String security_question;
	
	@Column(name="security_answer") 
	private String security_answer;
	
	@Column(name="active")
	private boolean active=false;
	
	@ManyToOne
    @JoinColumn(name="user_role") 
	private User_Role user_role;
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getSecurity_question() {
		return security_question;
	}
	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}
	public String getSecurity_answer() {
		return security_answer;
	}
	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public User_Role getUser_role() {
		return user_role;
	}
	public void setUser_role(User_Role user_role) {
		this.user_role = user_role;
	}
}
