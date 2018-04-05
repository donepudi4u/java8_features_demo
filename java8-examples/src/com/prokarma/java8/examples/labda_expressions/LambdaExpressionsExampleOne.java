package com.prokarma.java8.examples.labda_expressions;

public class LambdaExpressionsExampleOne {
	
	
	public static void main(String[] args) {
		
		int width=10;
		
		Drawable d2 = ()->{
			System.out.println("Width value : "+width);
		};
		
		d2.draw();
		
	}

}
