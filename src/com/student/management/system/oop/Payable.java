package com.student.management.system.oop;

public interface Payable {

	public abstract double calculatePayment();

	public default boolean processPayment(String paymentMode) {
		if (paymentMode.equalsIgnoreCase("CASH") || paymentMode.equalsIgnoreCase("UPI")
				|| paymentMode.equalsIgnoreCase("CARD") || paymentMode.equalsIgnoreCase("BITCOIN")) {
			System.out.println("Processing payment......");
			System.out.println("Payment Successful");
			return true;
		} else {
			System.err.println("Something went wrong");
			return false;
		}
	}

	public abstract void generateReceipt();

	public abstract double getDiscount();
}
