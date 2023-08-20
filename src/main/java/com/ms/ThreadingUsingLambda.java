package com.ms;

public class ThreadingUsingLambda {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println("2 x " + i + " = " + (2 * i));
			}
		});
		Thread t2=new Thread(()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println("3 x " + i + " = " + (3 * i));
			}
		});
		
		t1.start();t2.start();
		/*
		Runnable task1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("2 x " + i + " = " + (2 * i));
			}
		};

		Runnable task2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("3 x " + i + " = " + (3 * i));
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();
		*/
	}

}
