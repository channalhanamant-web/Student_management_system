package com.Student_Management_System;

import java.util.Scanner;

public class StudentManagementSystem {

	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static int studentRollNumber[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static double marksObtainedInMaths[] = new double[100];
	public static String studentGrade[] = new String[100];

	public static int index = 0;

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int option;
		System.out.println("Student management system");

		while (true) {

			System.out.println("1. Add a Student");
			System.out.println("2. Print Student details");
			System.out.println("3. Print all Student details");
			System.out.println("4. Exit");
			System.out.println("Enter an option[1-4]");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				addStudent();
				break;
			case 2:
				printStudentInformation();
				break;
			case 3:
				printAllStudentsDetails();
				break;
			case 4:
				exit();
				break;

			default:
				break;
			}
		}
	}

	private static void exit() {
		System.out.println("Exiting from the app......");
		System.exit(0);

	}

	private static void printAllStudentsDetails() {
		System.out.println("Print All Students Details");
		for (int i = 0; i < index; i++) {
			System.out.println("Student name:" + studentName[i]);
			System.out.println("Student roll number:" + studentRollNumber[i]);
			System.out.println("Student age:" + studentAge[i]);
			System.out.println("Marks Obtained");
			System.out.println("MarksObtainedInEnglish:" + marksObtainedInEnglish[i]);
			System.out.println("MarksObtainedInScience:" + marksObtainedInScience[i]);
			System.out.println("MarksObtainedInMaths:" + marksObtainedInMaths[i]);
			System.out.println("Student grade:" + studentGrade[i]);

			System.out.println("=====================================================");
		}

	}

	private static void printStudentInformation() {

		System.out.println("Print Student Information");
		System.out.println("Enter the index");
		int userIndex = scanner.nextInt();

		System.out.println("Student name:" + studentName[userIndex]);
		System.out.println("Student roll number:" + studentRollNumber[userIndex]);
		System.out.println("Student age:" + studentAge[userIndex]);
		System.out.println("Marks Obtained");
		System.out.println("MarksObtainedInEnglish:" + marksObtainedInEnglish[userIndex]);
		System.out.println("MarksObtainedInScience:" + marksObtainedInScience[userIndex]);
		System.out.println("MarksObtainedInMaths:" + marksObtainedInMaths[userIndex]);
		System.out.println("Student grade:" + studentGrade[userIndex]);
	}

	public static void addStudent() {
		System.out.println("Enter student name");
		studentName[index] = scanner.next();

		System.out.println("Enter student age");
		studentAge[index] = scanner.nextInt();

		System.out.println("Enter student roll number");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter student marks in English");
		marksObtainedInEnglish[index] = scanner.nextDouble();

		System.out.println("Enter student marks in Science");
		marksObtainedInScience[index] = scanner.nextDouble();

		System.out.println("Enter student marks in Maths");
		marksObtainedInMaths[index] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarksObtained / 3;

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "D";
		} else {
			studentGrade[index] = "F";
		}
		index++;
		System.out.println("Student information stored successfully");
	}

}
