package com.student.management.system.oop.helpdesk;

import java.util.Scanner;

public class HelpDeskRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("Help Desk Menu ");
			System.out.println("1. Raise a new request");
			System.out.println("2. Raise a priority request");
			System.out.println("3. Process a reqiest");
			System.out.println("4. Cancel a request by ticket id");
			System.out.println("5. Search a request by ticket id");
			System.out.println("Select an option [1-5]");
			int selectOption = scanner.nextInt();
			scanner.nextLine();
			switch (selectOption) {
			case 1:
				HelpdeskManager.createNewRequest(scanner);
				break;

			case 2:
				HelpdeskManager.raisePriorityRequest(scanner);
				break;
			case 3:
				HelpdeskManager.createNewRequest(scanner);
				break;
			case 4:
				HelpdeskManager.createNewRequest(scanner);
				break;
			case 5:
				HelpdeskManager.createNewRequest(scanner);
				break;
			default:
				System.out.println("Select valid option");
				break;
			}

			System.out.println("Do you wish to create another request? [Yes/No]");
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("No")) {
				break;
			}
		}
	}

}
