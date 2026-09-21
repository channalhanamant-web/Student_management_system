package com.student.management.system.oop.helpdesk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class HelpDeskRequest {
	private String ticketId;
	private String studentName;
	private int rollNumber;
	private IssueType issueType;
	private String description;
	private LocalDateTime raisedTime;
	private Status status;

	public HelpDeskRequest(String studentName, int rollNumber, IssueType issueType, String description) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.issueType = issueType;
		this.description = description;
		raisedTime = LocalDateTime.now();
		status = Status.OPEN;
		UUID uuid = UUID.randomUUID();
		ticketId = uuid.toString();

	}
	
	

	
	public String getTicketId() {
		return ticketId;
	}




	public String getStudentName() {
		return studentName;
	}




	public int getRollNumber() {
		return rollNumber;
	}




	public IssueType getIssueType() {
		return issueType;
	}




	public String getDescription() {
		return description;
	}




	public String getRaisedTime() {
		return formatTime(raisedTime);
	}




	public Status getStatus() {
		return status;
	}




	@Override
	public String toString() {
		return "HelpDeskRequest [ticketId=" + ticketId + ", studentName=" + studentName + ", rollNumber=" + rollNumber
				+ ", issueType=" + issueType + ", description=" + description + ", raisedTime=" + formatTime(raisedTime)
				+ ", status=" + status + "]";
	}

	private String formatTime(LocalDateTime time) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		String formattedTime = time.format(formatter);
		return formattedTime;

	}

}
