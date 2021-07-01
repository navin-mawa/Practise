package com.qa.exercise;

public class Results {

	static int total;

	// A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam
	// has a maximum of 150 marks.

	// When all the exam marks have been added together, we can find the overall
	// percentage that the person
	// has got by multiplying their score by 100 and then dividing by 450.

	// Create the results class, this class has 5 variables, Physics, Chemistry, and
	// Biology,
	// total and percentage. This class should also have 2 methods:

	// Method 1 - displays the results that the person got for each exam and then
	// the total mark.
	// Try to make the output neat and bespoke for each exam.
	// Method 2 - which finds and displays the percentage that the person received
	// for the exams overall.

	// public, private, protected, default - access modifiers
	// static - method can have the static keyword or not
	// return-type - void (returns nothing), int(return an integer), String(return a
	// string), Long, Double
	// give method a name - camelCase - 2nd word is capitalised
	// () - brackets which can have parameters, values to pass into the method
	// scope represented by: { - start of your method, } - where the method ends
	// before the last } bracket you write your return statement ( dont't have this
	// for void methods)

	public static int totalMarks(int physics, int chem, int bio, int maths) {
		total = physics + chem + bio + maths;
		return total;
	}

	public static int percent() {
		int per = total*100 / 600;

		return per ;}
		
	public static int average() {
		int ave = total/4;
		
		return ave;
		
		
		
	}
	

}
