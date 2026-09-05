package com.student.management.system.oop;

import java.util.Objects;

public class Student extends Person {

	private int studentRoll;
	private double marksObtainedInEnglish;
	private double marksObtainedInScience;
	private double marksObtainedInMaths;
	private double totalMarks;
	private double percentage;
	private String studentGrade;

	public Student(String name, int age, int studentRoll, double marksObtainedInEnglish, double marksObtainedInScience,
			double marksObtainedInMaths, String contactNumber, String address) {
		super(name, age, contactNumber, address);

		if (validateAge(age) && validateRollNumber(studentRoll) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)
				&& validatePhoneNumber(contactNumber) && validateAddress(address)) {

			this.studentRoll = studentRoll;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInScience = marksObtainedInScience;
			this.marksObtainedInMaths = marksObtainedInMaths;

		}

	}

	public String getStudentName() {
		return name;
	}

	public void setStudentName(String name) {
		this.name = name;
	}

	public int getStudentAge() {
		return age;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge < 21 && studentAge >= 10) {
			this.age = studentAge;
		} else {
			System.out.println("Invalid age");
		}

	}

	public boolean validateAge(int age) {
		if (age < 21 && age >= 10) {
			return true;
		} else {
			System.err.println("Invalid age");
			return false;
		}
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		if (studentRoll >= 1) {
			this.studentRoll = studentRoll;
		} else {
			System.out.println("Invalid Roll number");
		}
	}

	public boolean validateRollNumber(int studentRoll) {

		if (studentRoll >= 1 && studentRoll <= 100) {
			return true;

		} else {
			System.err.println("Invalid roll number");
			return false;
		}

	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish <= 100 && marksObtainedInEnglish >= 0) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.out.println("Invalid marks for English");
		}

	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {

		if (marksObtainedInScience <= 100 && marksObtainedInScience >= 0) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.out.println("Invalid marks for Science");
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {

		if (marksObtainedInMaths <= 100 && marksObtainedInMaths >= 0) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.out.println("Invalid marks for Maths");
		}
	}

	public boolean validateMarks(Double marksForTheSubject) {
		if (marksForTheSubject >= 100 || marksForTheSubject < 0) {
			System.err.println(marksForTheSubject + " is invalid marks!");
			return false;
		} else {

			return true;

		}
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getPhoneNumber() {
		return contactNumber;
	}

	public void setPhoneNumber(String contactNumber) {
		this.contactNumber = contactNumber;

	}

	public boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber != null && phoneNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid phone number");
			return false;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean validateAddress(String address) {
		if (address.isBlank()) {
			System.err.println("Invalid address");
			return false;
		} else {
			return true;
		}

	}

	public void calculateTotalmarks() {

		totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;

	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {
		if (percentage == 0) {
			studentGrade = "Grade cannot be calculated";
		} else {

			if (percentage >= 95) {
				studentGrade = "A+";
			} else if (percentage >= 90) {
				studentGrade = "A";
			} else if (percentage >= 85) {
				studentGrade = "B+";
			} else if (percentage >= 80) {
				studentGrade = "B";
			} else if (percentage >= 75) {
				studentGrade = "C+";
			} else if (percentage >= 70) {
				studentGrade = "C";
			} else if (percentage >= 65) {
				studentGrade = "D";
			} else {
				studentGrade = "F";
			}
		}

	}

	@Override
	public String toString() {
		return "Student [studentName=" + name + ", studentAge=" + age + ", studentRoll=" + studentRoll
				+ ", phoneNumber=" + contactNumber + ", address=" + address + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInScience=" + marksObtainedInScience
				+ ", marksObtainedInMaths=" + marksObtainedInMaths + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + ", studentGrade=" + studentGrade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, percentage,
				contactNumber, age, studentGrade, name, studentRoll, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(contactNumber, other.contactNumber) && age == other.age
				&& Objects.equals(studentGrade, other.studentGrade) && Objects.equals(name, other.name)
				&& studentRoll == other.studentRoll
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

	public void displayStudentInformation() {

		System.out.println("------- Student Information -------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll Number: " + studentRoll);
		System.out.println("Contact number: " + contactNumber);
		System.out.println("Address: " + address);
		System.out.println("Marks in English: " + marksObtainedInEnglish);
		System.out.println("Marks in Maths: " + marksObtainedInMaths);
		System.out.println("Marks in Science: " + marksObtainedInScience);
		System.out.println("Total marks obtained: " + totalMarks);
		System.out.println("Percentage obtained: " + percentage + "%");
		System.out.println("Grade: " + studentGrade);

		System.out.println("--------------------------------------------------");

	}

	public boolean updateInformation(String newContactNumber, String newAddress) {
		System.out.println("Requesting for parents approval");
		boolean parentApprovalStatus = parentApproval();
		if (parentApprovalStatus) {
			if (super.updateInformation(newContactNumber, newAddress)) {

				System.out.println("Notifying the parents");
				return true;
			}else {
				System.err.println("Details invalid");
				return false;
			}
		}
		else {
			System.err.println("No approval from parents");
			return false;
		}
	}

	public boolean parentApproval() {
		return true;
	}

}
