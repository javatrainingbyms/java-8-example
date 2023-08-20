package com.ms;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		new Thread(Printer::tableTwo).start();
		new Thread(new Printer()::tableThree).start();
		
		/*
		Runnable r1=Printer::tableTwo;	//run replaced by tableTwo
		Runnable r2=new Printer()::tableThree; //run replaced by tableThree
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		*/
	}

}
