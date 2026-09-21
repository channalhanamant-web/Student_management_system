package com.student.management.system.oop.helpdesk;

import java.util.LinkedList;
import java.util.Scanner;

public class HelpdeskManager {

	private static LinkedList<HelpDeskRequest> requestQueue = new LinkedList<HelpDeskRequest>();
	private static LinkedList<HelpDeskRequest> processedQueue = new LinkedList<HelpDeskRequest>();
	private static LinkedList<HelpDeskRequest> cancelledQueue = new LinkedList<HelpDeskRequest>();

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

	public static void processRequest() {
		HelpDeskRequest headRequest = requestQueue.poll();
		headRequest.setStatus(Status.CLOSE);
		System.out.println("Ticket closed successfully.. " + headRequest.getTicketId());
		System.out.println(headRequest);
		processedQueue.add(headRequest);
	}

	public static void cancelRequestByTicket(String ticketId) {
		int requestIndexFoundAt = -1;

		for (int index = 0; index < requestQueue.size(); index++) {
			HelpDeskRequest request = requestQueue.get(index);
			if (request.getTicketId().equalsIgnoreCase(ticketId)) {
				System.out.println("Request found....!");
				requestIndexFoundAt = index;
				break;
			}
		}
		if (requestIndexFoundAt != -1) {
			HelpDeskRequest cancelledRequest = requestQueue.remove(requestIndexFoundAt);
			cancelledRequest.setStatus(Status.CANCEL);
			cancelledQueue.add(cancelledRequest);

			System.out.println("Request cancelled successfully");
			System.out.println("Ticket number - : " + cancelledRequest.getTicketId());
			System.out.println("Student Name - : " + cancelledRequest.getStudentName());
			System.out.println("Roll Number - : " + cancelledRequest.getRollNumber());
			System.out.println("Status - : " + cancelledRequest.getStatus());
			System.out.println("Issue description - : " + cancelledRequest.getDescription());
			System.out.println("Created at : " + cancelledRequest.getRaisedTime());
		} else {
			System.err.println("Ticket Id not found");
		}

	}

	public static void searchRequestByTicket(String ticketId) {
		int requestIndexFoundAt = -1;

		for (int index = 0; index < requestQueue.size(); index++) {
			HelpDeskRequest request = requestQueue.get(index);
			if (request.getTicketId().equalsIgnoreCase(ticketId)) {
				System.out.println("Request found....!");
				requestIndexFoundAt = index;
				break;
			}
		}
		if (requestIndexFoundAt != -1) {
			HelpDeskRequest searchRequest = requestQueue.get(requestIndexFoundAt);
			System.out.println("Fetched searched request successfully");
			System.out.println("Ticket number - : " + searchRequest.getTicketId());
			System.out.println("Student Name - : " + searchRequest.getStudentName());
			System.out.println("Roll Number - : " + searchRequest.getRollNumber());
			System.out.println("Status - : " + searchRequest.getStatus());
			System.out.println("Issue description - : " + searchRequest.getDescription());
			System.out.println("Created at : " + searchRequest.getRaisedTime());
		} else {
			System.err.println("Ticket Id not found");
		}
	}

	public static void showAllActiveRequest() {
		System.out.println("================== All Active Request ==================");
		for (HelpDeskRequest request : requestQueue) {
			System.out.println("Fetched searched request successfully");
			System.out.println("Ticket number - : " + request.getTicketId());
			System.out.println("Student Name - : " + request.getStudentName());
			System.out.println("Roll Number - : " + request.getRollNumber());
			System.out.println("Status - : " + request.getStatus());
			System.out.println("Issue description - : " + request.getDescription());
			System.out.println("Created at : " + request.getRaisedTime());

			System.out.println("================================================================================");
		}
	}

	public static void showAllProcessedRequest() {
		System.out.println("================== All Processed Request ==================");
		for (HelpDeskRequest request : processedQueue) {
			System.out.println("Fetched searched request successfully");
			System.out.println("Ticket number - : " + request.getTicketId());
			System.out.println("Student Name - : " + request.getStudentName());
			System.out.println("Roll Number - : " + request.getRollNumber());
			System.out.println("Status - : " + request.getStatus());
			System.out.println("Issue description - : " + request.getDescription());
			System.out.println("Created at : " + request.getRaisedTime());

			System.out.println("================================================================================");
		}
	}

	public static void showAllCancelledRequest() {
		System.out.println("================== All Cancelled Request ==================");
		for (HelpDeskRequest request : cancelledQueue) {
			System.out.println("Fetched searched request successfully");
			System.out.println("Ticket number - : " + request.getTicketId());
			System.out.println("Student Name - : " + request.getStudentName());
			System.out.println("Roll Number - : " + request.getRollNumber());
			System.out.println("Status - : " + request.getStatus());
			System.out.println("Issue description - : " + request.getDescription());
			System.out.println("Created at : " + request.getRaisedTime());

			System.out.println("================================================================================");
		}
	}
}
