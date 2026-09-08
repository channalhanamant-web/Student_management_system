package com.student.management.system.oop;

public class SportsActivityFee implements Payable {

	private final double equipmentCharges;
	private final double tournamentFees;
	private final double teamUniformCosts;
	private final double discountforStatePlayers;
	private double finalSportsActivityFee;

	public SportsActivityFee(double equipmentCharges, double tournamentFees, double teamUniformCosts,
			double discountforStatePlayers) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.teamUniformCosts = teamUniformCosts;
		this.discountforStatePlayers = discountforStatePlayers;
	}

	@Override
	public double calculatePayment() {
		finalSportsActivityFee = equipmentCharges + tournamentFees + teamUniformCosts - discountforStatePlayers;
		return finalSportsActivityFee;
	}

	@Override
	public void generateReceipt() {
		System.out.println("***************** Generating Sports Activity Fees Receipt *****************");
		System.out.println("Equipment Charges : " + equipmentCharges);
		System.out.println("Tournament Fees : " + tournamentFees);
		System.out.println("Team Uniform Costs : " + teamUniformCosts);
		System.out.println("Discount for State Players : -" + discountforStatePlayers);
		System.out.println("Final Sports Activity Fee To be paid: " + finalSportsActivityFee);

	}

	@Override
	public double getDiscount() {

		return discountforStatePlayers;
	}

}
