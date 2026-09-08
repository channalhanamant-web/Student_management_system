package com.student.management.system.oop;

public class TuitionFee implements Payable {

	private final double baseFees;
	private final double scholarshipDeduction;
	private final double earlyPaymentDiscount;
	private double finalFeesAmount;

	public TuitionFee(double baseFees, double scholarshipDeduction, double earlyPaymentDiscount) {
		super();
		this.baseFees = baseFees;
		this.scholarshipDeduction = scholarshipDeduction;
		this.earlyPaymentDiscount = earlyPaymentDiscount;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFees - scholarshipDeduction - earlyPaymentDiscount;
		return finalFeesAmount;
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
		System.out.println("***************** Generating Tuition Fees Receipt *****************");
		System.out.println("Base Fees : " + baseFees);
		System.out.println("Deduction Offered: -" + scholarshipDeduction);
		System.out.println("Early Discount : -" + earlyPaymentDiscount);
		System.out.println("Final Tuition Fee to be paid : " + finalFeesAmount);

	}

	@Override
	public double getDiscount() {

		return (scholarshipDeduction+earlyPaymentDiscount);
	}

}
