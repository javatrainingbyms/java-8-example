package com.ms.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.ms.Student;

public class StreamExampleFour {

	public static void main(String[] args) {
		
		Student s1 = new Student(5120, "Rajesh", 25, 40);
		Student s2 = new Student(3110, "Prince", 21, 70);
		Student s3 = new Student(2120, "Sumit", 24, 60);
		Student s4 = new Student(4001, "Ashish", 22, 56);
		Student s5 = new Student(2510, "John", 23, 30);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

		//students.stream().sorted((st1,st2)->st1.getAge()-st2.getAge()).forEach(System.out::println);
		//System.out.println(students);
		
		List<Student> sortedList=students.stream().sorted((st1,st2)->st1.getAge()-st2.getAge()).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		/*
		IntSummaryStatistics summary=students.stream().mapToInt((st)->st.getMarks()).summaryStatistics();
		System.out.println(summary.getSum());
		System.out.println(summary.getAverage());
		System.out.println(summary.getMax());
		System.out.println(summary.getMin());
		System.out.println(summary.getCount());
		*/
		
		
		
	}
	
	
	

}
