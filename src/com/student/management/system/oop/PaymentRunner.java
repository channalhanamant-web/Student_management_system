package com.student.management.system.oop;

public class PaymentRunner {

	public static void main(String[] args) {
		Payable payable = new TuitionFee(50000, 10000, 5000);

		payable.calculatePayment();
		payable.generateReceipt();
		System.out.println(payable.getDiscount());
		
		Payable payable2 = new SportsActivityFee(5000, 3000, 2000, 1000);
		payable2.calculatePayment();
		payable2.generateReceipt();
		System.out.println(payable2.getDiscount());
		
		Payable payable3=new TransportFee(1000,3,500);
		payable3.calculatePayment();
		payable3.generateReceipt();
		System.out.println(payable3.getDiscount());
		
		Payable payable4=new LibraryFee(500, 200, 100);
		payable4.calculatePayment();
		payable4.generateReceipt();
		System.out.println(payable4.getDiscount());
		

	}

}
