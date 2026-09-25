package com.collections.Map;

import java.util.Objects;

public class Employee {
 private int id;
 private String empName;
	
 public Employee(int id, String empName) {
	 super();
	 this.id=id;
	 this.empName=empName;
	  
 }

 @Override
 public String toString() {
	return "Employee [id=" + id + ", empName=" + empName + "]";
 }

 @Override
 public int hashCode() {
	return Objects.hash(empName, id);
 }

 @Override
 public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(empName, other.empName) && id == other.id;
 }
 
 
}
