package com.ms.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		Stream<Integer> intStream=Stream.of(10,20,30,40,50,60,70);
		Stream<String> strStream=Stream.of("indore","bhopal","delhi","mumbai");
		
		List<String> cities=new ArrayList<>();
		cities.add("indore"); cities.add("bhopal"); cities.add("mumbai"); cities.add("mhow"); cities.add("mysore");cities.add("banglore");
		
		Stream<String> cityStream=cities.stream();

		//Consumer<String> consumer=(city)->System.out.println(city.toUpperCase());
		//cityStream.forEach(consumer);
		
		//cityStream.forEach((city)->System.out.println(city));
		cityStream.forEach(System.out::println);
		
	//	System.out.println(cities);
	
	}
	
	

}
