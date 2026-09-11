package com.student.management.system.oop;

public interface Payable {

	public abstract double calculatePayment();

	public default boolean processPayment(PaymentMode paymentMode) {
		if (paymentMode == PaymentMode.BITCOIN || paymentMode==PaymentMode.CARD || paymentMode==PaymentMode.CASH || paymentMode==PaymentMode.UPI) {
			
			System.out.println("Processing payment ....................................................");
			System.out.println("Payment Successful with "+ paymentMode);
			return true;
		} else {
			System.err.println("Something went wrong");
			return false;
		}
	}

	public abstract void generateReceipt();

	public abstract double getDiscount();
}
