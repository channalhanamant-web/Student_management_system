package com.student.management.system.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner3 {

	public static void main(String[] args) {

		File dataFile = new File("student.ser");
		if (dataFile.exists()) {
			System.out.println("File found!! Fetching data from existing student file");
			deserializeData();
		} else {

			System.out.println("File not found in the system !!! Adding student data to the file");
			Student s1 = new RegularStudent.RegularStudentBuilder("Mak", 20, "Pune", "7894561230")
					.withMarksObtainedInEnglish(89).withMarksObtainedInMaths(78).withMarksObtainedInScience(78)
					.withRollNumber(23).build();

			Student s2 = new SportsStudent.SportsStudentBuilder("Raj", 15, "Bombay", "7412589630").withSportsScore(90)
					.withRollNumber(21).withMarksObtainedInEnglish(89).withMarksObtainedInMaths(89)
					.withMarksObtainedInScience(89).withMarksObtainedInScience(69).build();
			
			Student s3 = new RegularStudent.RegularStudentBuilder("Kiran", 20, "Pune", "7894561230")
					.withMarksObtainedInEnglish(89).withMarksObtainedInMaths(78).withMarksObtainedInScience(78)
					.withRollNumber(22).build();
			
			Student studentArray[] = new Student[3];
			studentArray[0] = s1;
			studentArray[1] = s2;
			studentArray[2] = s3;
			serializeData(studentArray);
		}

	}

	private static void deserializeData() {
		File deSerializedDataFile = new File("student.ser");
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		Student[] data = null;
		try {
			fileInputStream = new FileInputStream(deSerializedDataFile);
			objectInputStream = new ObjectInputStream(fileInputStream);
			data = (Student[]) objectInputStream.readObject();
			System.out.println("Students data successfully fetched");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Student s : data) {
			System.out.println(s);
		}
	}

	private static void serializeData(Student[] studentArray) {
		File serializedDataFile = new File("student.ser");
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		try {
			fileOutputStream = new FileOutputStream(serializedDataFile);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentArray);
			System.out.println("Data stored successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
