package com.ms.stream;

import java.util.Arrays;
import java.util.List;

import com.ms.Student;

public class StreamExampleFive {

	public static void main(String[] args) {
		Student s1 = new Student(5120, "Rajesh", 25, 40);
		Student s2 = new Student(3110, "Prince", 19, 70);
		Student s3 = new Student(2120, "Sumit", 24, 90);
		Student s4 = new Student(4001, "Ashish", 22, 56);
		Student s5 = new Student(2510, "John", 23, 40);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

		//boolean result=students.stream().anyMatch((st)->st.getMarks()>=90);
		//boolean result=students.stream().allMatch((student)->student.getAge()>20);
		boolean result=students.stream().noneMatch((student)->student.getMarks()<40);
		System.out.println(result);
	}

}
