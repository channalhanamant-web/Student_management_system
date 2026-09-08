package com.student.management.system.oop;

public interface Payable {

	public abstract double calculatePayment();
	
	public abstract boolean processPayment(String paymentMode);
	
	public abstract void generateReceipt();
	
	public abstract double getDiscount();
}
