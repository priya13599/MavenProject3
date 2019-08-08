package com.nucleus;

public class Student {
private int studentId;
private String stdName;
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public int getStudentId() {
	return studentId;
}

public Student() {
	System.out.println("student constructor");
}

public Student(int studentId, String stdName) {	
	this.studentId = studentId;
	this.stdName = stdName;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}

}
