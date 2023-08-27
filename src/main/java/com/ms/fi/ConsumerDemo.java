package com.ms.fi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.ms.Student;

public class ConsumerDemo {

	public static void operate(String s, int n, BiConsumer<String,Integer> bc) {
		bc.accept(s, n);
	}
	public static void operate(Student student, Consumer<Student> consumer) {
		consumer.accept(student);
	}
	public static void operate(String str, Consumer<String> consumer) {
		consumer.accept(str); //System.out.println(str);
	}
	public static void main(String[] args) {
		
		operate("indore",3,(s,n)->System.out.println(s.substring(n)));
		operate("hello",5,(s,n)->{
			for(int i=1;i<=n;i++) {
				System.out.println(s);
			}
		});
		//Student st=new Student(101,"abc",20,80);
		//operate(st,(s)->s.setMarks(s.getMarks()+5));
		//operate(st,System.out::println);
		/*
		operate("india", (str)->System.out.println(str.substring(0,3)));
		operate("india", (str)->System.out.println(str.length()));
		//operate("india", (str)->System.out.println(str));
		//Consumer<String> consumer=System.out::println;
		//operate("india", consumer);
		operate("india",System.out::println);
		*/
	}
}
