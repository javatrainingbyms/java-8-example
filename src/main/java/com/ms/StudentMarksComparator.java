package com.ms;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getMarks()-s2.getMarks();
		/*
		if(s1.getMarks()>s2.getMarks()) {
			return 1;
		}else if(s1.getMarks()<s2.getMarks()) {
			return -1;
		}else {
			return 0;
		}
		*/
	}

	//compare(s1,s2);
}
