package com.student.management.system.oop;

public class SportsStudent extends Student {
	private double sportsScore;

	protected SportsStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.sportsScore = ((SportsStudentBuilder) studentBuilder).sportsScore;

	}

	@Override
	public double calculatePercentage() {
		double academicPercentage = getTotalMarks() / 3;
		double finalPercentage = academicPercentage * 0.8 + sportsScore * 0.2;
		return finalPercentage;
	}

	public static class SportsStudentBuilder extends StudentBuilder {
		private double sportsScore;

		public SportsStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);

		}

		public SportsStudentBuilder withSportsScore(double sportsScore) {
			if (sportsScore >= 0 && sportsScore <= 100) {
				this.sportsScore = sportsScore;
			}
			return this;
		}

		@Override
		public Student build() {
			Student s1 = new SportsStudent(this);
			return s1;
		}

	}

}
