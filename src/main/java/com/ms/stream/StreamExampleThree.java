package com.ms.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ms.Student;

public class StreamExampleThree {
	public static void main(String[] args) {
		Student s1 = new Student(5120, "Rajesh", 25, 40);
		Student s2 = new Student(3110, "Prince", 21, 70);
		Student s3 = new Student(2120, "Sumit", 24, 60);
		Student s4 = new Student(4001, "Ashish", 22, 56);
		Student s5 = new Student(2510, "John", 23, 30);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		students.stream().map((st)->st.getName()).filter((name)->name.length()>5).forEach((name)->System.out.println(name.toUpperCase()));
		
		
		/*
		List<String> cities=new ArrayList<>();
		cities.add("indore"); cities.add("goa"); cities.add("ahmedabad"); cities.add("mhow"); cities.add("mysore");cities.add("banglore");
		cities.stream().map((city)->city.length()).forEach(System.out::println);
		*/
	}
}
