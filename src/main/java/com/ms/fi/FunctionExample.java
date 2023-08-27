package com.ms.fi;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.ms.Person;
import com.ms.Student;

public class FunctionExample {
	
	public static String replicate(String s, int n, BiFunction<String,Integer,String> bf) {
		return bf.apply(s, n);
	}

	public static Person transformStudentToPerson(Student student, Function<Student,Person> function) {
		return function.apply(student);
	}
	public static Integer count(String str, Function<String,Integer> function) {
		return function.apply(str);
	}
	public static void main(String[] args) {
		String r=replicate("indore",4,(s,n)->{
			String res="";
			for(int i=1;i<=4;i++) {
				res=res+s;
			}
			return res;
		});
		System.out.println(r);
		//Student st=new Student(101,"John",12,56);
		//Person p=transformStudentToPerson(st, (s)->new Person(s.getName(),s.getAge()));
		//System.out.println(p);
		/*
		int result=count("indore", (s)->{
			int n=0;
			for(int i=0; i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					n++;
				}
			}
			return n;
		});
		
		System.out.println(result);
		*/
	}
}
