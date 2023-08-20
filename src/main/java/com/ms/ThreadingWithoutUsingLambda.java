package com.ms;

public class ThreadingWithoutUsingLambda {
	public static void main(String[] args) {
		Runnable task1=new Runnable() {
			public void run() {
				for(int i=1; i<=10;i++) {
					System.out.println("2 x "+i+" = "+(2*i));
				}
			}
		};
		Runnable task2=new Runnable() {
			public void run() {
				for(int i=1; i<=10;i++) {
					System.out.println("3 x "+i+" = "+(3*i));
				}
			}
		};
		
		Thread t1=new Thread(task1);
		Thread t2=new Thread(task2);
		
		t1.start();
		t2.start();
	}
}
