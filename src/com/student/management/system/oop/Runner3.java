package com.student.management.system.oop;

public class Runner3 {

	public static void main(String[] args) {
		Student s1 = new RegularStudent.RegularStudentBuilder("Mak", 20, "Pune", "7894561230")
				.withMarksObtainedInEnglish(89).withMarksObtainedInMaths(78).withMarksObtainedInScience(78)
				.withRollNumber(21).build();
		System.out.println(s1);
	}
Student s2= new SportsStudent.SportsStudentBuilder("Kohli", 18, "Delhi", "1234567890").withRollNumber(19).withMarksObtainedInEnglish(78).withMarksObtainedInMaths(78).withMarksObtainedInScience(89).with
	
}
