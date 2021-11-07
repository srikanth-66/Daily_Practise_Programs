package com.inheritance;

public class ParentClass {
	String name;
	int age;
	public void car() {
		System.out.println("parent said okay to give car to his son yahh!");
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
	@Override
	public String toString() {
		return "ParentClass [name=" + name + ", age=" + age + "]";
	}
}
