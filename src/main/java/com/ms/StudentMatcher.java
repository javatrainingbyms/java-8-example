package com.ms;

public class StudentMatcher {
	public static int matchMarks(Student st1, Student st2) {
		return st1.getMarks()-st2.getMarks();
	}
}
