package com.collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMethodsDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("Jatin");
		hashSet.add("Uday");
		hashSet.add("Ritu");
		hashSet.add("Ajinkya");
		hashSet.add("Jatin");
		System.out.println(hashSet);
		
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("Jatin");
		linkedHashSet.add("Uday");
		linkedHashSet.add("Ritu");
		linkedHashSet.add("Ajinkya");
		linkedHashSet.add("Jatin");
		System.out.println(linkedHashSet);
		
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("Jatin");
		treeSet.add("Uday");
		treeSet.add("Ritu");
		treeSet.add("Ajinkya");
		treeSet.add("Jatin");
		System.out.println(treeSet);
		
		Iterator<String> data=treeSet.iterator();
		while (data.hasNext()) {
			System.out.println(data.next());
		}
		TreeSet<String> treeSet1=new TreeSet<String>();
		System.out.println(treeSet1.isEmpty());
		
		System.out.println(treeSet.size());
		
		System.out.println(treeSet.contains("Jatin"));
		
		System.out.println(treeSet.remove("Jatin"));
		System.out.println(treeSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
