package com.student.management.system.oop;
import static com.student.management.system.oop.Student.*;
public class Runner2 {

	public static void main(String[] args) {
		Student s1 = new Student.StudentBuilder("Haney", 20, "Bengaluru", "7894561230").withRollNumber(12)
				.withMarksObtainedInEnglish(98).withMarksObtainedInMaths(96).withMarksObtainedInScience(98).build();

		s1.displayStudentInformation();
		System.out.println("Total number of students added: "+getTotalStudentCount());
		System.out.println("Total number of persons added: "+getTotalPersonCount());

	}

}
