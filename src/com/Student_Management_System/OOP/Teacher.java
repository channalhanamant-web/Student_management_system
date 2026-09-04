package com.Student_Management_System.OOP;

public class Teacher {

	private String name;
	private int age;
	private String contactNumber;
	private String address;
	private String employeeId;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	private static final double BASE_SALARY = 30000;
	private static final double EXPERIENCE_BONUS = 2000;

	public Teacher(String name, int age, String contactNumber, String address, String employeeId, String subject,
			int yearsOfExperience) {

		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddres(address)
				&& validateEmployeeId(employeeId) && validateSubject(subject) && validateYOE(yearsOfExperience)) {
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			this.employeeId = employeeId;
			this.subject = subject;
			this.yearsOfExperience = yearsOfExperience;
			calculateSalary();
		}

	}

	public boolean validateAge(int age) {
		if (age >= 21 && age <= 60) {
			return true;
		} else {
			System.err.println("Invalid teacher age");
			return false;

		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid teacher contact number");
			return false;

		}
	}

	public boolean validateAddres(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid teacher address");
			return false;

		}
	}

	public boolean validateEmployeeId(String employeeId) {
		if (employeeId.matches("T\\d{3}")) {
			return true;
		} else {
			System.err.println("Invalid teacher Employee Id ");
			return false;

		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid subject");
			return false;
		}
	}

	public boolean validateYOE(int yearsOfExperience) {
		if (yearsOfExperience >= 0 && yearsOfExperience <= 35) {
			return true;
		} else {
			System.err.println("Invalid teacher experience");
			return false;

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}

	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddres(address)) {
			this.address = address;
		}
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		if (validateEmployeeId(employeeId)) {
			this.employeeId = employeeId;
		}

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject)) {
			this.subject = subject;
		}

	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYOE(yearsOfExperience)) {
			this.yearsOfExperience = yearsOfExperience;
		}

	}

	public double getSalary() {
		return salary;
	}

	private void calculateSalary() {

		salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);

	}
	
	public void displayTeacherDetails() {
		System.out.println("---------- Teacher Information ---------");
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Age: "+age);
		System.out.println("Contact number: "+contactNumber);
		System.out.println("Address: "+address);
		System.out.println("Teaching subject: "+subject);
		System.out.println("Year of experience: "+yearsOfExperience);
		System.out.println("Salary: "+"$"+salary);
		
		
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", employeeId=" + employeeId + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience
				+ ", salary=" + salary + "]";
	}
	
	

}
