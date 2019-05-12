package com.vkstech.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {

		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Vipul", "Kumar", "vipul@yopmail.com"));
		students.add(new Student("Xender", "Strauss", "xender@yopmail.com"));
		students.add(new Student("Matt", "Murdock", "matt@yopmail.com"));
		
		return students;
	}
}
