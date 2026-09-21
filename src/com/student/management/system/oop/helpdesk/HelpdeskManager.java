package com.student.management.system.oop.helpdesk;

import java.util.LinkedList;
import java.util.Scanner;

public class HelpdeskManager {

	private static LinkedList<HelpDeskRequest> requestQueue = new LinkedList<HelpDeskRequest>();

	public static void createNewRequest(Scanner scanner) {
		System.out.println("Enter Student Name");
		String studentName = scanner.nextLine();

		System.out.println("Enter Student Roll Number");
		int studentRollNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Select the issue type");
		System.out.println("1: ID CARD REISSUE");
		System.out.println("2: BONAFIDE CERTIFICATE");
		System.out.println("3: SCHOLARSHIP REQUEST");
		System.out.println("4: HOSTEL LEAVE APPLICATION");
		System.out.println("5: LIBRARY FINE QUERY");

		int issueOption = scanner.nextInt();
		scanner.nextLine();
		IssueType issueType = null;
		switch (issueOption) {
		case 1:
			issueType = IssueType.ID_CARD_REISSUE;
			break;
		case 2:
			issueType = IssueType.BONAFIDE_CERTIFICATE;
			break;

		case 3:
			issueType = IssueType.SCHOLARSHIP_REQUEST;
			break;

		case 4:
			issueType = IssueType.HOSTEL_LEAVE_APPLICATION;
			break;

		case 5:
			issueType = IssueType.LIBRARY_FINE_QUERY;
			break;

		default:
			System.out.println("Invalid option selected........");
		}

		System.out.println("Enter the Issue Description");
		String description = scanner.nextLine();


		HelpDeskRequest helpDeskRequest = new HelpDeskRequest(studentName, studentRollNumber, issueType, description);
		requestQueue.addLast(helpDeskRequest);

		System.out.println("Request created successfully");
		System.out.println("Ticket number - : " + helpDeskRequest.getTicketId());
		System.out.println("Student Name - : " + helpDeskRequest.getStudentName());
		System.out.println("Roll Number - : " + helpDeskRequest.getRollNumber());
		System.out.println("Status - : " + helpDeskRequest.getStatus());
		System.out.println("Issue description - : " + helpDeskRequest.getDescription());
		System.out.println("Created at : " + helpDeskRequest.getRaisedTime());

	}

	public static void raisePriorityRequest(Scanner scanner) {
		
		System.out.println("Creating Priority Request");
		System.out.println("Enter Student Name");
		String studentName = scanner.nextLine();

		System.out.println("Enter Student Roll Number");
		int studentRollNumber = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Select the issue type");
		System.out.println("1: ID CARD REISSUE");
		System.out.println("2: BONAFIDE CERTIFICATE");
		System.out.println("3: SCHOLARSHIP REQUEST");
		System.out.println("4: HOSTEL LEAVE APPLICATION");
		System.out.println("5: LIBRARY FINE QUERY");

		int issueOption = scanner.nextInt();
		scanner.nextLine();
		IssueType issueType = null;
		switch (issueOption) {
		case 1:
			issueType = IssueType.ID_CARD_REISSUE;
			break;
		case 2:
			issueType = IssueType.BONAFIDE_CERTIFICATE;
			break;

		case 3:
			issueType = IssueType.SCHOLARSHIP_REQUEST;
			break;

		case 4:
			issueType = IssueType.HOSTEL_LEAVE_APPLICATION;
			break;

		case 5:
			issueType = IssueType.LIBRARY_FINE_QUERY;
			break;

		default:
			System.out.println("Invalid option selected........");
		}

		System.out.println("Enter the Issue Description");
		String description = scanner.nextLine();


		HelpDeskRequest helpDeskRequest = new HelpDeskRequest(studentName, studentRollNumber, issueType, description);
		requestQueue.addFirst(helpDeskRequest);

		System.out.println("Priority Request created successfully");
		System.out.println("Ticket number - : " + helpDeskRequest.getTicketId());
		System.out.println("Student Name - : " + helpDeskRequest.getStudentName());
		System.out.println("Roll Number - : " + helpDeskRequest.getRollNumber());
		System.out.println("Status - : " + helpDeskRequest.getStatus());
		System.out.println("Issue description - : " + helpDeskRequest.getDescription());
		System.out.println("Created at : " + helpDeskRequest.getRaisedTime());

	}
		
	}

