package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("Uday", 10, 15, 95, 96, 99, "7348971359", " #BHSP C 2");

		s1.calculateTotalmarks();
		s1.calculatePercentage();
		s1.calculateGrade();
		s1.displayStudentInformation();

		Teacher t1 = new Teacher("Harsha", 25, "7348971359", "#BHSP C 3", "T101", "English", 5);
		t1.displayTeacherDetails();

	}

}
