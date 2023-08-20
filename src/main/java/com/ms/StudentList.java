package com.ms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentList {
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

		Collections.sort(students);// natural sorting (rno)
		System.out.println("After Sorting----------------------->");
		for (Student student : students) {
			System.out.println(student);
		}
		// we wish to sort on marks
		Collections.sort(students, new StudentMarksComparator());
		System.out.println("After Sorting On Marks----------------------->");
		for (Student student : students) {
			System.out.println(student);
		}
		// we wish to sort on age (using lambda)

		Collections.sort(students, (st1, st2) -> st1.getAge() - st2.getAge());
		System.out.println("After Sorting On Age----------------------->");
		for (Student student : students) {
			System.out.println(student);
		}

		// we wish to sort on name (using lambda)
		Collections.sort(students, (st1, st2) -> st1.getName().compareTo(st2.getName()));
		System.out.println("After Sorting On name----------------------->");
		for (Student student : students) {
			System.out.println(student);
		}

	}
}
