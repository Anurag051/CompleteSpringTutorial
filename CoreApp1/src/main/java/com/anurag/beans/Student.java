package com.anurag.beans;
/**
 * Bean Class
 * Setter Injection Example
 * @author Anurag Kumar
 * @version 1.0
 *
 */
public class Student {

	private int studentId;
	private String studentName;

	public int getStudentId() {
		
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setStudentId Called");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setStudentName Called");
		this.studentName = studentName;
	}

}
