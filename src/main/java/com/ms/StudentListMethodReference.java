package com.ms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentListMethodReference {
	public static void main(String[] args) {
		Student s1 = new Student(5120, "Rajesh", 25, 40);
		Student s2 = new Student(3110, "Prince", 21, 70);
		Student s3 = new Student(2120, "Sumit", 24, 60);
		Student s4 = new Student(4001, "Ashish", 22, 56);
		Student s5 = new Student(2510, "John", 23, 30);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

		for (Student student : students) {
			System.out.println(student);
		}
		
		//need to sort it on marks
	
		
				
		//Collections.sort(students, (st1,st2)->st1.getMarks()-st2.getMarks());
		//Comparator<Student> comparator=StudentMatcher::matchMarks;
		//Collections.sort(students, comparator);
		Collections.sort(students, StudentMatcher::matchMarks);
		System.out.println("list after sort");
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		
	}
}
