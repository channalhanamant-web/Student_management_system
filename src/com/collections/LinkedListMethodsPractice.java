package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethodsPractice {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();

		linkedList.add(null);
		linkedList.add("Hanii");
		linkedList.add("Jeeva");
		linkedList.add("Hanii");

		System.out.println(linkedList);

		linkedList.add(1, "ranbir");
		System.out.println(linkedList);

		linkedList.remove(2);
		System.out.println(linkedList);

		System.out.println(linkedList.get(3));

		System.out.println(linkedList.set(0, "Jatin"));

		linkedList.addAll(linkedList);
		System.out.println(linkedList);
		System.out.println(linkedList.contains("Jeeva"));

		System.out.println(linkedList.size());
		// linkedList.clear();
		System.out.println(linkedList);

		Iterator<String> dataIterator = linkedList.iterator();
		while (dataIterator.hasNext()) {
			System.out.println(dataIterator.next());
		}

		linkedList.forEach(x -> System.out.print(x));
		linkedList.forEach(System.out::println);
	}

}
