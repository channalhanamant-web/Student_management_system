package com.student.management.system.oop;

public class SportsStudent extends Student {
	private double sportsScore;

	private SportsStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.sportsScore = ((SportsStudentBuilder) studentBuilder).sportsScore;
		percentage = calculatePercentage();
		studentGrade = calculateGrade();

	}

	
	@Override
	public String toString() {
		return "SportsStudent [SportsScore=" + sportsScore + ", totalMarks=" + totalMarks + ", percentage=" + percentage
				+ ", studentGrade=" + studentGrade + ", name=" + name + ", age=" + age + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
	}


	@Override
	public double calculatePercentage() {
		
		System.out.println("Total marks: "+ getTotalMarks());
		System.out.println("Sports marks: "+sportsScore);
		double academicPercentage = getTotalMarks() / 3;
		double finalPercentage = (academicPercentage * 0.8) + (sportsScore * 0.2);
		return finalPercentage;
	}

	public static class SportsStudentBuilder extends StudentBuilder {
		private double sportsScore;

		@Override
		public Student build() {
			Student s1 = new SportsStudent(this);
			return s1;
		}

		public SportsStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);

		}

		public SportsStudentBuilder withSportsScore(double sportsScore) {
			if (sportsScore >= 0 && sportsScore <= 100) {
				this.sportsScore = sportsScore;
			}
			return this;
		}

	}

}
