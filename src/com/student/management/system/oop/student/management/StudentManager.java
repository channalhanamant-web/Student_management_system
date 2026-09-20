package com.student.management.system.oop.student.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.student.management.system.oop.RegularStudent;
import com.student.management.system.oop.SportsStudent;
import com.student.management.system.oop.Student;

public class StudentManager {

	public static void enrollStudent(Scanner scanner) {
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
						studentContactNumber).withSportsScore(marksObtainedInSports).withRollNumber(studentRollNumber)
						.withMarksObtainedInEnglish(marksObtainedInEnglish)
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
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("no")) {
				break;
			}
		}

		serializeStudentData(studentList);
	}

	public static void deserializeStudentData() {
		File serializeStudentDataFile = new File("student.ser");
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;

		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			fileInputStream = new FileInputStream(serializeStudentDataFile);
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

	public static void serializeStudentData(ArrayList<Student> studentList) {
		File serializeStudentDataFile = new File("student.ser");

		// deserialize it
		ArrayList<Student> oldStudentsList = new ArrayList<Student>();
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream(serializeStudentDataFile);
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			if (obj instanceof ArrayList<?>) {
				for (Object o : (ArrayList<?>) obj) {
					if (o instanceof Student) {
						oldStudentsList.add((Student) o);
					}
				}

			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		oldStudentsList.addAll(studentList); // appending the new list the old list
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		try {
			fileOutputStream = new FileOutputStream(serializeStudentDataFile);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(oldStudentsList);
			System.out.println("Data stored successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
