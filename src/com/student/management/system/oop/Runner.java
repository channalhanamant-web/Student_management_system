package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {
		Person s1 = new Student("Uday", 10, 15, 95, 96, 99, "7348971359", " #BHSP C 2");// upcasting
		Person s2 = new Student("Hani", 10, 15, 95, 96, 99, "7348971359", " #BHSP C 2");
		Person s3= new Student("Bunny", 10, 15, 95, 96, 99, "7348971359", " #BHSP C 2");

		((Student) s1).calculateTotalmarks(); // downcasting
		((Student) s1).calculatePercentage();
		((Student) s1).calculateGrade();
		((Student) s1).displayStudentInformation();
		s1.updateInformation("7348971360", "Mumbai");
		s1.updateInformation("7348971380");
		((Student) s1).displayStudentInformation();
		System.out.println("Total Number of Students joined: " + Student.getTotalStudentCount());
		
		System.out.println("==================================================================================");
		
		Person t1 = new Teacher("Harsha", 25, "7348971359", "#BHSP C 3", "T101", "English", 5);
		((Teacher) t1).displayTeacherDetails();
		t1.updateInformation("9876543210", "Bengaluru");
		t1.updateInformation("7348971380");
		((Teacher) t1).displayTeacherDetails();
		System.out.println("Total Number of Teacher's added: " + Teacher.getTotalTeacherCount());
		System.out.println("Total Number of Person's added: " + Person.getTotalPersonCount());

	}

}
