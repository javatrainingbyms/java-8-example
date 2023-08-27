package com.ms.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleTwo {

public static void main(String[] args) {
	
		List<String> cities=new ArrayList<>();
		cities.add("indore"); cities.add("bhopal"); cities.add("mumbai"); cities.add("mhow"); cities.add("mysore");cities.add("banglore");
		
		cities.stream().filter((city)->city.startsWith("m")).forEach(System.out::println);
		
		/*
		Stream<String> cityStream=cities.stream();
		Stream<String> mCityStream=cityStream.filter((city)->city.startsWith("m"));
		//long number=mCityStream.count();
		//System.out.println(number);
		mCityStream.forEach(System.out::println);
		*/
	}
}
