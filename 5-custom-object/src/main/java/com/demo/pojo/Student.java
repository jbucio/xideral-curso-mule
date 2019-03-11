package com.demo.pojo;

public class Student {

	private String name;
	
	private int age;
	
	private int level;

	private String gender;
	
	private String status;
	
	public Student(){}

	public Student(String name, int age, int level, String gender, String status) {
		super();
		this.name = name;
		this.age = age;
		this.level = level;
		this.gender = gender;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", level=" + level + ", gender=" + gender + ", status="
				+ status + "]";
	}

}
