package com.student.management.system.oop;

public class LibraryFee implements Payable {
	private final double basicSubscription;
	private final double additionalBookCharges;
	private final double lateReturnPenalties;
	private double finalLibraryFee;

	public LibraryFee(double basicSubscription, double additionalBookCharges, double lateReturnPenalties) {
		super();
		this.basicSubscription = basicSubscription;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenalties = lateReturnPenalties;
	}

	@Override
	public double calculatePayment() {
		finalLibraryFee = basicSubscription + additionalBookCharges + lateReturnPenalties;
		return finalLibraryFee;
	}

	@Override
	public boolean processPayment(String paymentMode) {
		if (paymentMode.equalsIgnoreCase("CASH") || paymentMode.equalsIgnoreCase("UPI")
				|| paymentMode.equalsIgnoreCase("CARD")) {
			System.out.println("Processing payment......");
			System.out.println("Payment Successful");
			return true;
		} else {
			System.err.println("Something went wrong");
			return false;
		}

	}

	@Override
	public void generateReceipt() {
		System.out.println("***************** Generating Library Fees Receipt *****************");
		System.out.println("Basic Subscription : " + basicSubscription);
		System.out.println("Additional Book Charges: " + additionalBookCharges);
		System.out.println("Late Return Penalties : " + lateReturnPenalties);
		System.out.println("Final Library Fees To be paid: " + finalLibraryFee);

	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
