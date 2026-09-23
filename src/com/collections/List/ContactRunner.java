package com.collections.List;

import java.util.ArrayList;

public class ContactRunner {

	public static void main(String[] args) {
		Contact contactOne = new Contact("Jatin", "7894561235");
		Contact contactOTwo = new Contact("Prabhu", "7894561238");
		Contact contactThree = new Contact("Deepak", "7894561234");

		ArrayList<Contact> al = new ArrayList<Contact>();

		al.add(contactOne);
		al.add(contactOTwo);
		al.add(contactThree);
		al.add(new Contact("Ajinkya", "3201456987"));

		al.forEach(System.out::println);
		
		

		// Update contact!!

		int contactIndex = -1;

		for (int index = 0; index < al.size() - 1; index++) {
			Contact result = al.get(index);
			if (result.getName().equalsIgnoreCase("Jatin")) {
				contactIndex = index;
				break;
			}
		}
		if (contactIndex != -1) {
			al.set(contactIndex, new Contact("Jatin Sharma", "7894561235"));
		}

		al.forEach(System.out::println);
		
		

		// Delete contact!!

		int contactIndexRemove = -1;

		for (int index = 0; index < al.size() - 1; index++) {
			Contact result = al.get(index);
			if (result.getName().equalsIgnoreCase("Jatin Sharma")) {
				contactIndexRemove = index;
				break;
			}
		}
		if (contactIndexRemove != -1) {
			al.remove(contactIndexRemove);
		}

		al.forEach(System.out::println);

	}

}
