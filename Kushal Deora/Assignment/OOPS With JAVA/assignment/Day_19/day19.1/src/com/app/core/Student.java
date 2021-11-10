package com.app.core;
/*
 *1.1 Create Student class -- rollNo(string),name,dob(LocalDate),subject(enum),gpa(double)
Create Subject enum --JAVA,DBT,ANGULAR,REACT,SE
Add constr & to string & getters.
 */

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
private String rollNo;
private String name;
private LocalDate dob;
private Subject subject;
private double gpa;
public Student(String rollNo, String name, LocalDate dob, Subject subject, double gpa) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.dob = dob;
	this.subject = subject;
	this.gpa = gpa;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
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
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", subject=" + subject + ", gpa=" + gpa
			+ "]";
}
public Student(String rollNo) {
	super();
	this.rollNo = rollNo;
}



}
