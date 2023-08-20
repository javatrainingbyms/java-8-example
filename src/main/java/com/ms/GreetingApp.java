package com.ms;

public class GreetingApp {
	
	static class HindiGreeting implements Greeting {
		public void greet() {
			System.out.println("Greeting in Hindi...!");
		}
	}
	
	
	public static void welcome(Greeting greeting) {
		greeting.greet();
	}
	public static void main(String args[]) {
		welcome(new EnglishGreeting()); //arg obj can be any implementation of Greeting
		welcome(new HindiGreeting());
		
		Greeting greeting=new Greeting() {
			@Override
			public void greet() {
				System.out.println("Welcome - Anonomous-1");
			}
		};
		welcome(greeting);
		
		welcome(new Greeting() {
			public void greet() {
				System.out.println("Welcome - Anonomous-2");
			}
		});
		
		Greeting greeting1=()->System.out.println("lambda-1...!");
		welcome(greeting1);
		
		welcome(()->System.out.println("lambda-2...!"));
		
		
		
	}
}
