package com.ms;


public class Student implements Comparable<Student> {
	private int rno;
	private String name;
	private int age;
	private int marks;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	public Student(int rno, String name, int age, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public int compareTo(Student other) {
		if(this.rno>other.rno) {
			return 1;
		}else if(this.rno<other.rno) {
			return -1;
		}else {
			return 0;
		}
	}
	
	//s1.compareTo(s2);  //calling +ve, args -ve, same 0
}
