package com.student.management.system.oop;

public class GradePolicy {
	private static int aPlus;
	private static int aGrade;
	private static int bPlus;
	private static int bGrade;
	private static int cPlus;
	private static int cGrade;
	private static int dGrade;
	private static int passingMarks;

	static {
		System.out.println("Grade policy loaded in the system");
		aPlus = 95;
		aGrade = 90;
		bPlus = 85;
		bGrade = 80;
		cPlus = 75;
		cGrade = 70;
		dGrade = 60;
		passingMarks = 33;
	}

	public static String calculateGrade(double percentage) {
		if (percentage >= aPlus) {
			return "A+";
		} else if (percentage >= aGrade) {
			return "A";
		} else if (percentage >= bPlus) {
			return "B+";
		} else if (percentage >= bGrade) {
			return "B";
		} else if (percentage >= cPlus) {
			return "C+";
		} else if (percentage >= cGrade) {
			return "C";
		} else if (percentage >= dGrade) {
			return "D";
		}
		return "F";
	}

}
