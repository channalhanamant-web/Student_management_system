package com.student.management.system.oop.helpdesk;

import java.util.Scanner;

public class HelpDeskRunner {

	public static void showHelpDeskMenu() {

		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("Help Desk Menu ");
			System.out.println("1. Raise a new request");
			System.out.println("2. Raise a priority request");
			System.out.println("3. Process a request");
			System.out.println("4. Cancel a request by ticket id");
			System.out.println("5. Search a request by ticket id");
			System.out.println("6. Show all Active Requests");
			System.out.println("7. Show all Processed Requests");
			System.out.println("8. Show all Cancelled Requests");
			System.out.println("9. Exit");

			System.out.println("Select an option [1-9]");

			int selectOption = scanner.nextInt();
			scanner.nextLine();
			String ticketId;
			switch (selectOption) {
			case 1:
				HelpdeskManager.createNewRequest(scanner);
				break;

			case 2:
				HelpdeskManager.raisePriorityRequest(scanner);
				break;
			case 3:
				HelpdeskManager.processRequest();
				break;
			case 4:
				System.out.println("Kindly provide the Ticket you wish to cancel");
				ticketId = scanner.nextLine();
				HelpdeskManager.cancelRequestByTicket(ticketId);
				break;
			case 5:
				System.out.println("Kindly provide the Ticket you wish to Search");
				ticketId = scanner.nextLine();
				HelpdeskManager.searchRequestByTicket(ticketId);
				break;
			case 6:
				HelpdeskManager.showAllActiveRequest();
				break;
			case 7:
				HelpdeskManager.showAllProcessedRequest();
				break;
			case 8:
				HelpdeskManager.showAllCancelledRequest();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Select valid option");
				break;
			}

			System.out.println("Do you wish to create another request? [Yes/No]");
			String choice = scanner.nextLine();
			scanner.nextLine();
			if (choice.equalsIgnoreCase("No")) {
				break;
			}
		}
	}

}
