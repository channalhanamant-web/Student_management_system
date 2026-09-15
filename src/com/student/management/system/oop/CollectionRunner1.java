package com.student.management.system.oop;

public class CollectionRunner1 {

	public static void main(String[] args) {
		Student s1 = new RegularStudent.RegularStudentBuilder("Mak", 20, "Pune", "7894561230")
				.withMarksObtainedInEnglish(89).withMarksObtainedInMaths(78).withMarksObtainedInScience(78)
				.withRollNumber(23).build();

		Student s2 = new SportsStudent.SportsStudentBuilder("Raj", 15, "Bombay", "7412589630").withSportsScore(90)
				.withRollNumber(21).withMarksObtainedInEnglish(89).withMarksObtainedInMaths(89)
				.withMarksObtainedInScience(89).build();

	}

}    
