package com.collections.List;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector101 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.addElement(20);
		vector.addElement(30);
		vector.addElement(40);
		vector.addElement(50);
		System.out.println(vector.firstElement());
		System.out.println(vector.elementAt(1));

		System.out.println(vector.get(1));
		vector.remove(0);
		vector.removeElementAt(2);

		vector.addElement(20);
		vector.addElement(30);
		vector.addElement(40);
		vector.addElement(50);

		Iterator<Integer> iterator1 = vector.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		Enumeration<Integer> vEnum = vector.elements();
		while (vEnum.hasMoreElements()) {
			System.out.print(vEnum.nextElement() + " ");
		}
		System.out.println();
		System.out.println(vector.size());

		System.out.println(vector);
        
		//converting vector to Array- collection
		Integer[] data = vector.toArray(new Integer[0]);

		// converting vector to Array- vector legacy method
		Integer[] myDataIntegers = new Integer[vector.size()];
		vector.copyInto(myDataIntegers);

		System.out.println(Arrays.toString(myDataIntegers));

	}

}
