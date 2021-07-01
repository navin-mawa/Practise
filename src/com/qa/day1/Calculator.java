package com.qa.day1;

public class Calculator {

	// Declare variables:
	// Data-type variable-name = value;
	String str = "hi";
	static int num = 43;
	boolean bool = true;
	long val = 2344222;
	static double dec = 4.5;
	float decSmall = 2.4f;
	char letter = 'a';

	public static int add() {
		System.out.println(1 + 2);
		System.out.println(num + dec);
		return num + 3;

	}

	public static void sub() {
		System.out.println(3 - 2);
	}

	public static int multiply() {
		int x = 3;
		int y = 4;

		return x * y;
	}

//public static int divide(int a, int b) {
	// int c = (a / b);
//}

	public static int add(int a, int b) {
		int c = a + b;
		return c;
		
		
	}

	public static int subtract(int a, int b) {
		int c = a - b;
		return c;
	}	
	

	public static double divide(double e, double f) {
		double d = e / f;
		return d;
		
		
public class Results {
	
	static int total;
	static int percentage;
	public static void displayResults(String name, int physics, int chemistry, int biology) {
		
		System.out.println(name);
		System.out.println("Physics");
		System.out.println("physics");
		System.out.println("Chemistry");
		System.out.println("chemistry");
		System.out.println("Biology");
		System.out.println("biology");
		
		total = physics + chemistry + biology;
		System.out.println("Total Point");
		
		System.out.println(total);
		
		public static void displaypercentage() {
			
			percentage = (total * 100)/450;
			System.out.println("Overall Percentage");
			System.out.println(percentage);
			
			
			
		}
		
	}

		}
		
		
		
		
		
		
	}
}

		
	
	}

};
