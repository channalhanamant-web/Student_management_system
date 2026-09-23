package com.collections.List;

public class Contact {

	private String name;
	private String contactNumber;

	public Contact(String name, String contactNumber) {
		super();
		if (validateName(name) && validateContactNumber(contactNumber)) {
			this.name = name;
			this.contactNumber = contactNumber;
		}

	}

	private boolean validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name should not be empty or null");
		} else {
			return true;
		}
	}

	private boolean validateContactNumber(String contactNumber) {
		if (!contactNumber.matches("\\d{10}") || contactNumber == null || contactNumber.isEmpty()) {
			throw new IllegalArgumentException("Contact number should not be empty and must be 10 digits");
		} else {
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (validateName(name)) {
			this.name = name;
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

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
