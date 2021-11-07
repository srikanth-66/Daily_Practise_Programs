package com.inheritance;

public class ChildClass extends ParentClass {
	String name;
	int age;
	String qualification;
	public void bike(){
		System.out.println("Child driving bike Saying iam on repair");
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
