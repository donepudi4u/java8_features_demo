package com.prokarma.java8.examples.labda_expressions;

public class LambdaThreadDemo {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
					System.out.println("Thread One started");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		Runnable runnable2 = () -> {
			System.out.println("Thread Two started");
		};
		
//		runnable2.run();
		
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
		
	}

}
