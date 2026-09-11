package com.student.management.system.oop;

public enum PaymentMode {
	CASH("Payment via Cash"), CARD("Payment via CARD"), UPI("Payment via UPI"), BITCOIN("Payment via BITCOIN");

	private String description;

	private PaymentMode(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
