package com.anurag.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.anurag.beans.Student;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		String cfgFileLocation = "C://Users//23028//Documents//workspace-sts-3.9.1.RELEASE"
				+ "//CoreApp1//src//main//java//com//anurag//cfg//MyBeans.xml";
		FileSystemResource resource = new FileSystemResource(cfgFileLocation);
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		Student student = (Student) beanFactory.getBean("std");
		System.out.println("Student ID : " + student.getStudentId() + 
				"\nStudent Name : " + student.getStudentName());

	}

}
