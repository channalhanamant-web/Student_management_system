package com.student.management.system.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Runner4 {

	public static void main(String[] args) {

		System.out.println("********************** Student Management System **********************");

		File dataFile = new File("student.ser");
		if (dataFile.exists()) {
			System.out.println("File found!! Fetching data from existing student file");
			deserializeData();
		} else {

			System.out.println("No backup (student.ser) found...... ");
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("How many students information you would like to store ...");
			int sizeOfStudentsArray = scanner.nextInt();
			Student studentArray[] = new Student[sizeOfStudentsArray];
			scanner.nextLine();
			for (int index = 0; index <= sizeOfStudentsArray; index++) {
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
				System.out.println("Is the Student a Sports Student? (Yes or No");
				String isSportStudent = scanner.next();
				if (isSportStudent.equalsIgnoreCase("yes")) {
					System.out.println("Enter Student scores in Sports ");
					Double marksObtainedInSports = scanner.nextDouble();
					Student s2 = new SportsStudent.SportsStudentBuilder(studentName, studentAge, studentAddress,
							studentContactNumber).withSportsScore(marksObtainedInSports)
							.withRollNumber(studentRollNumber).withMarksObtainedInEnglish(marksObtainedInEnglish)
							.withMarksObtainedInMaths(MarksObtainedInMaths)
							.withMarksObtainedInScience(MarksObtainedInScience).build();
					studentArray[index] = s2;
					System.out.println(s2);

				} else if (isSportStudent.equalsIgnoreCase("no")) {

					Student s1 = new RegularStudent.RegularStudentBuilder(studentName, studentAge, studentAddress,
							studentContactNumber).withRollNumber(studentRollNumber)
							.withMarksObtainedInEnglish(marksObtainedInEnglish)
							.withMarksObtainedInMaths(MarksObtainedInMaths)
							.withMarksObtainedInScience(MarksObtainedInScience).build();
					studentArray[index] = s1;
					System.out.println(s1);

				} else {
					throw new IllegalArgumentException("Kindly enter the option Yes or No");
				}
			}
			for (Student data : studentArray) {
				System.out.println(data);
			}

			serializeData(studentArray);
		}

	}

	private static void deserializeData() {
		File deSerializedDataFile = new File("student.ser");
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		Student[] data = null;
		try {
			fileInputStream = new FileInputStream(deSerializedDataFile);
			objectInputStream = new ObjectInputStream(fileInputStream);
			data = (Student[]) objectInputStream.readObject();
			System.out.println("Students data successfully fetched");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Student s : data) {
			System.out.println(s);
		}
	}

	private static void serializeData(Student[] studentArray) {
		File serializedDataFile = new File("student.ser");
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		try {
			fileOutputStream = new FileOutputStream(serializedDataFile);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentArray);
			System.out.println("Data stored successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
