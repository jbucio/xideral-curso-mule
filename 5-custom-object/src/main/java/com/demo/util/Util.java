package com.demo.util;

import com.demo.pojo.Student;

public class Util {
	
	public Student changeValues(Student student){
		
		if(student.getGender() == "Female"){
			student.setGender("F");
			}else {
				student.setGender("M");
			}
		return student;
		
	}

}
