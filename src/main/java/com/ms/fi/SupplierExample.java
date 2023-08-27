package com.ms.fi;

import java.util.Random;
import java.util.function.Supplier;

import com.ms.Student;

public class SupplierExample {

	public static Student getStudent(Supplier<Student> supplier) {
		return supplier.get();
	}
	
	public static void main(String[] args) {
		
		Student student=getStudent(()->{
			int n=new Random().nextInt(100);
			Student s=new Student(n,"Student - "+n, 0, 0);
			return s;
		});
		System.out.println(student);
	}

}
