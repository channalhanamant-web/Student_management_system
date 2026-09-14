package com.student.management.system.oop;

import java.io.Serializable;

import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidContactNumberException;

public abstract class Person implements Serializable{


	private static final long serialVersionUID = 1L;
	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	private static int personCounter = 0;

	public Person(String name, int age, String address, String contactNumber) {
		super();
		if (validateAddress(address) && validateContactNumber(contactNumber)) {

			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			personCounter++;

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
		this.age = age;
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
		if (validateAddress(address)) {
			this.address = address;
		}

	}

	private boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			try {
				throw new InvalidContactNumberException("Contact number need to be 10 digit numbers");
			} catch (InvalidContactNumberException e) {
				System.err.println(e.getMessage());
				System.err.println(e.getStackTrace());
			}

			return false;

		}

	}

	private boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			try {
				throw new InvalidAddressException("Address can't be Empty or Null");
			} catch (InvalidAddressException e) {
				System.err.println(e.getMessage());
				System.err.println(e.getStackTrace());
			}
			return false;

		} else {

			return true;
		}
	}

	protected boolean updateInformation(String newContactNumber, String newAddress) {
		if (validateContactNumber(newContactNumber) && validateAddress(newAddress)) {

			this.contactNumber = newContactNumber;
			this.address = newAddress;
			System.out.println("Updating contact number and address information");
			return true;
		} else {
			System.err.println("Trying to add invalid information");
			return false;
		}

	}

	protected boolean updateInformation(String newContactNumber) {
		if (validateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("New number added");
			return true;
		} else {
			System.err.println("Invalid contact number");
			return false;
		}
	}

	protected boolean updateInformation(String newAddress, boolean update) {
		if (validateAddress(newAddress)) {
			this.address = newAddress;
			System.out.println("New address added");
			return true;
		} else {
			System.err.println("Invalid address");
			return false;
		}
	}

	public static int getTotalPersonCount() {

		return personCounter;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}

}
