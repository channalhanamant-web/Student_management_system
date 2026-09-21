package com.student.management.system.oop;

import java.io.File;
import java.util.Scanner;

import com.student.management.system.oop.student.management.StudentManager;

public class Runner5 {

	public static void main(String[] args) {

		System.out.println("********************** Student Management System **********************");
		Scanner scanner = new Scanner(System.in);
		File dataFile = new File("student.ser");
		if (dataFile.exists()) {
			System.out.println("File found!! Fetching data from existing student file");
			StudentManager.deserializeStudentData();
		} else {

			System.out.println("No backup (student.ser) found...... ");
		}

		while (true) {
			System.out.println("------------------------------ Main Menu ------------------------------");
			System.out.println("1. Enroll a new Student");
			System.out.println("2. Help Desk");
			System.out.println("3. Exit");
			System.out.println("Select an option");
			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1:
				StudentManager.enrollStudent(scanner);
				break;
			case 2:
				// Helpdesk Runner
				break;
			case 3:
				System.out.println("Good Bye");
				System.exit(0);
			default:
				System.out.println("Enter valid option between 1-3");
			}

		}
	}

}
