package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

	private List<Contact> contactList = new ArrayList<Contact>();

	public void addContact(Contact contactToAdd) {
		if (contactList.add(contactToAdd)) {
			System.out.println("Contact added successfully");
		} else {
			System.err.println("Something went wrong");
		}
	}
}
