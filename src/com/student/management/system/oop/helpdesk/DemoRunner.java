package com.student.management.system.oop.helpdesk;

import java.util.LinkedList;

public class DemoRunner {

	public static void main(String[] args) {
		HelpDeskRequest h = new HelpDeskRequest("Hani", 1, IssueType.ID_CARD_REISSUE, "Need new card");

		HelpDeskRequest h1 = new HelpDeskRequest("jatin", 2, IssueType.BONAFIDE_CERTIFICATE,
				"Need BONAFIDE_CERTIFICATE");

		HelpDeskRequest h2 = new HelpDeskRequest("Kiran", 3, IssueType.SCHOLARSHIP_REQUEST, "Need SCHOLARSHIP");

		HelpDeskRequest hImp = new HelpDeskRequest("Varsha", 4, IssueType.LIBRARY_FINE_QUERY,
				"Kindly waiva off my fine");

		LinkedList<HelpDeskRequest> requestQueue = new LinkedList<HelpDeskRequest>();
		requestQueue.add(h);
		requestQueue.add(h1);
		requestQueue.add(h2);
		requestQueue.addFirst(hImp);

		System.out.println(requestQueue);

	}

}
