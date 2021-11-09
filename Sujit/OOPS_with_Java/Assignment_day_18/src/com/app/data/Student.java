package com.app.data;

import java.time.LocalDate;

public class Student {
	private String rollno;
	private String name;
	private LocalDate dob;
	private Subject subject;
	private double gpa;
	
	public Student(String rollno, String name, LocalDate dob, Subject subject, double gpa) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}

	public Student() {
		super();
		this.rollno = null;
		this.name = null;
		this.dob = null;
		this.subject = null;
		this.gpa = 0.0;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", dob=" + dob + ", subject=" + subject + ", gpa=" + gpa
				+ "]";
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	

}
