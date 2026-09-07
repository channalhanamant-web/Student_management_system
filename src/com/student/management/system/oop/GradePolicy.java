package com.student.management.system.oop;

public final class GradePolicy {
	private static final int A_PLUS;
	private static final int A_GRADE;
	private static final int B_PLUS;
	private static final int B_GRADE;
	private static final int C_PLUS;
	private static final int C_GRADE;
	private static final int D_GRADE;
	private static final int PASSING_MARKS;

	private GradePolicy() {

	}

	static {
		System.out.println("Grade policy loaded in the system");
		A_PLUS = 95;
		A_GRADE = 90;
		B_PLUS = 85;
		B_GRADE = 80;
		C_PLUS = 75;
		C_GRADE = 70;
		D_GRADE = 60;
		PASSING_MARKS = 33;
	}

	public static String calculateGrade(double percentage) {
		if (percentage >= A_PLUS) {
			return "A+";
		} else if (percentage >= A_GRADE) {
			return "A";
		} else if (percentage >= B_PLUS) {
			return "B+";
		} else if (percentage >= B_GRADE) {
			return "B";
		} else if (percentage >= C_PLUS) {
			return "C+";
		} else if (percentage >= C_GRADE) {
			return "C";
		} else if (percentage >= D_GRADE) {
			return "D";
		}
		return "F";
	}

}
