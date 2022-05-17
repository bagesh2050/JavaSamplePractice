package com.self.practice.model;

public class Student implements Comparable<Student> {

	private String name;
	private int marks;

	private String city;

	public Student(String name, int marks, String city) {
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.compareTo(o);
	}
}
