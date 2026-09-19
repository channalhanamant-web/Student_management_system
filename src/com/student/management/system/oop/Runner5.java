package com.student.management.system.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner5 {

	public static void main(String[] args) {

		System.out.println("********************** Student Management System **********************");

		File dataFile = new File("student.ser");
		if (dataFile.exists()) {
			System.out.println("File found!! Fetching data from existing student file");
			deserializeData();
		} else {

			System.out.println("No backup (student.ser) found...... ");
			Scanner scanner = new Scanner(System.in);

			ArrayList<Student> studentList = new ArrayList<Student>();

			
			while (true) {
				System.out.println("Enter Student Name");
				String studentName = scanner.nextLine();
				System.out.println("Enter Student Age");
				int studentAge = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Student Address");
				String studentAddress = scanner.nextLine();
				System.out.println("Enter Student Contact Number");
				String studentContactNumber = scanner.nextLine();
				System.out.println("Enter Student Roll number");
				int studentRollNumber = scanner.nextInt();
				System.out.println("Enter Student Obtained Marks in English ");
				Double marksObtainedInEnglish = scanner.nextDouble();
				System.out.println("Enter Student Obtained Marks in Maths ");
				Double MarksObtainedInMaths = scanner.nextDouble();
				System.out.println("Enter Student Obtained Marks in Science ");
				Double MarksObtainedInScience = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Is the Student a Sports Student? (Yes or No)");
				String isSportStudent = scanner.next();
				if (isSportStudent.equalsIgnoreCase("yes")) {
					System.out.println("Enter Student scores in Sports ");
					Double marksObtainedInSports = scanner.nextDouble();
					Student s2 = new SportsStudent.SportsStudentBuilder(studentName, studentAge, studentAddress,
							studentContactNumber).withSportsScore(marksObtainedInSports)
							.withRollNumber(studentRollNumber).withMarksObtainedInEnglish(marksObtainedInEnglish)
							.withMarksObtainedInMaths(MarksObtainedInMaths)
							.withMarksObtainedInScience(MarksObtainedInScience).build();
					
					studentList.add(s2);
					System.out.println(s2);

				} else if (isSportStudent.equalsIgnoreCase("no")) {

					Student s1 = new RegularStudent.RegularStudentBuilder(studentName, studentAge, studentAddress,
							studentContactNumber).withRollNumber(studentRollNumber)
							.withMarksObtainedInEnglish(marksObtainedInEnglish)
							.withMarksObtainedInMaths(MarksObtainedInMaths)
							.withMarksObtainedInScience(MarksObtainedInScience).build();
				
					studentList.add(s1);
					System.out.println(s1);

				} else {
					throw new IllegalArgumentException("Kindly enter the option Yes or No");
				}
				System.out.println("Student information added!!! Do you wish add more students");
				scanner.nextLine();
				String choice=scanner.nextLine();
				if (choice.equalsIgnoreCase("no")) {
					break;
				} 
			}
		
			serializeData(studentList);
		}

	}

	private static void deserializeData() {
		File deSerializedDataFile = new File("student.ser");
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;

		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			fileInputStream = new FileInputStream(deSerializedDataFile);
			objectInputStream = new ObjectInputStream(fileInputStream);
			studentList = (ArrayList<Student>) objectInputStream.readObject();
			System.out.println("Students data successfully fetched");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

	private static void serializeData(ArrayList<Student> studentList) {
		File serializedDataFile = new File("student.ser");
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		try {
			fileOutputStream = new FileOutputStream(serializedDataFile);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentList);
			System.out.println("Data stored successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
