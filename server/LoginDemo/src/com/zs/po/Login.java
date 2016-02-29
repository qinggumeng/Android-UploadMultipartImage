package com.zs.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
@Table(name = "login")
public class Login implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String logInUserId;
	private String logInUserName;
	private String logInPassWord;
	private String logInRole;
	private Date logInLogTime;
	private String logInEmail;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "LogIn_UserID", unique = true, nullable = false)
	public String getLogInUserId() {
		return logInUserId;
	}
	public void setLogInUserId(String logInUserId) {
		this.logInUserId = logInUserId;
	}
	@Column(name="LogIn_UserName")
	public String getLogInUserName() {
		return logInUserName;
	}
	public void setLogInUserName(String logInUserName) {
		this.logInUserName = logInUserName;
	}
	@Column(name="LogIn_PassWord")
	public String getLogInPassWord() {
		return logInPassWord;
	}
	public void setLogInPassWord(String logInPassWord) {
		this.logInPassWord = logInPassWord;
	}
	@Column(name="LogIn_Role")
	public String getLogInRole() {
		return logInRole;
	}
	public void setLogInRole(String logInRole) {
		this.logInRole = logInRole;
	}
	@Column(name="LogIn_LogTime")
	public Date getLogInLogTime() {
		return logInLogTime;
	}
	public void setLogInLogTime(Date logInLogTime) {
		this.logInLogTime = logInLogTime;
	}
	@Column(name="LogIn_Email")
	public String getLogInEmail() {
		return logInEmail;
	}
	public void setLogInEmail(String logInEmail) {
		this.logInEmail = logInEmail;
	}

}