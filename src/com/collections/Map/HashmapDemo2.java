package com.collections.Map;

import java.util.HashMap;

public class HashmapDemo2 {

	public static void main(String[] args) {
		HashMap<Employee, String> employeeHashMap = new HashMap<Employee, String>();
		Employee e1 = new Employee(101, "Jatin");
		Employee e2 = new Employee(101, "Jatin");
		
		employeeHashMap.put(e1, "Pune");
		
		System.out.println(employeeHashMap);
		System.out.println(employeeHashMap.get(e2));

	}

}
