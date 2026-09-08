package com.student.management.system.oop;

public class TransportFee implements Payable {
	private final double baseFee;
	private final int paymentMonths;
	private final double siblingDiscount;
	private double finalTransportFee;

	public TransportFee(double baseFee, int paymentMonths, double siblingDiscount) {
		super();
		this.baseFee = baseFee;
		this.paymentMonths = paymentMonths;
		this.siblingDiscount = siblingDiscount;
	}

	@Override
	public double calculatePayment() {
		finalTransportFee = (baseFee * paymentMonths) - siblingDiscount;
		return finalTransportFee;
	}

	@Override
	public void generateReceipt() {
		System.out.println("***************** Generating Transport Fees Receipt *****************");
		System.out.println("Base Fees : " + baseFee);
		System.out.println("For Months payment to be paid: " + paymentMonths);
		System.out.println("Discount for Sibling : -" + siblingDiscount);
		System.out.println("Final Transport Fees To be paid: " + finalTransportFee);

	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return siblingDiscount;
	}

}
