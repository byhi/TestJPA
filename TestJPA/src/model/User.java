package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


public class User {
	
	private String name;
	private String mail;
	private String birthday;
	
	public User(String name, String mail, String birthday) {
		super();
		this.name = name;
		this.mail = mail;
		this.birthday = birthday;
	}
	
	public User(String name, String mail, Date  birthday) {
		super();
		this.name = name;
		this.mail = mail;
		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy.MM.dd");
		this.birthday =dateformat2.format(birthday);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
