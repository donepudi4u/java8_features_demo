package com.prokarma.java8.examples.labda_expressions;

public class Lambda_FunctionalInterface {
	
	
	
	public static void main(String[] args) {
		
		/**
		 * Without lambda expressions
		 */
		
		InterfaceOne interfaceOne = new InterfaceOne() {
			
			@Override
			public void printInterfaceOne() {
				System.out.println("With out lambda expression");
				
			}
		};
		
		interfaceOne.printInterfaceOne();
		
		
		/**
		 * With Lambda expressions | No Arguments 
		 */
		
		InterfaceOne interfaceTwo = () -> {
			
			System.out.println("Using labda Expressions");
			
		};
		
		interfaceTwo.printInterfaceOne();
		

		InterfaceOne iInterface = () -> 
			System.out.println("Usin	g labda Expressions");
			
			iInterface.printInterfaceOne();

		
		/**
		 * lambda : multiple arguments
		 * 
		 */
		
		InterfaceWithArguments iArguments = new InterfaceWithArguments() {
			
			@Override
			public void printInterfaceOne(int a, int b) {
				System.out.println("Sum : "+ (a + b));
				
			}
		}; 
		
		
		iArguments.printInterfaceOne(10, 20);
		
		
		InterfaceWithArguments Iarguments2 = (a,b) -> {
			
			System.out.println("Subtraction : " + (a-b));
			
		};
		
		Iarguments2.printInterfaceOne(50, 40);
		
		/**
		 * No Body parameters
		 */
		
		InterfaceWithArguments Iarguments3 = (a,b) -> System.out.println("Subtraction : " + (a-b));
		
		Iarguments3.printInterfaceOne(50, 40);
		
		/***
		 * Lambda expresions | return type 
		 */
		ReturnTypeInterface iRetrun = (name) -> {
			return "Hi .... "+name;
		};
		
		System.out.println(iRetrun.returnStringMethod("Dileep"));
		
		
		ReturnTypeInterface iRetrun2 = (name) ->	" Helloooo .."+name;
		
		System.out.println(iRetrun2.returnStringMethod("Dileep"));
		
	}
	
	
	interface InterfaceOne{
		
		public void printInterfaceOne();
		
	}
	
	interface InterfaceWithArguments{
		
		public void printInterfaceOne(int a, int b);
		
	}
	
	
	interface ReturnTypeInterface{
		
		String returnStringMethod(String name);
		
	}
	
	


}
