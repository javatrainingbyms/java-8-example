package com.ms.fi;

import java.util.function.Predicate;

import com.ms.Student;

public class PredicateExample {
	
	public static boolean isPassed(Student student, Predicate<Student> predicate) {
		return predicate.test(student);
	}
	public static boolean testNumber(int n, Predicate<Integer> predicate) {
		return predicate.test(n);
	}
	public static void main(String args[]) {
		Student student=new Student(101,"abc",15,55);
		System.out.println(isPassed(student, (st)->st.getMarks()>=60));
				
		//System.out.println(testNumber(90, (n)->n%5==0));
		//System.out.println(testNumber(25, (n)->n%2==0));
		///System.out.println(testNumber(21, (n)->n%2!=0));
		
	}
}
