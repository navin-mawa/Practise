package com.qa.exercise;

public class Runner {
	
	public static void main(String[] args) {
		
// static way of calling methods - 
		
		
System.out.println(Results.totalMarks(100,60,40,100));
System.out.println(Results.percent() + "%");	
System.out.println("average = " + Results.average())  ;

	System.out.println(Conversion.conversion1(1)+"seconds");
	System.out.println(Conversion.conversion2(1)+"minutes");
	
}

}
