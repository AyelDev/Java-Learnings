package com.ArrayListChallenge;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentMarkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student student = new Student("Ariel", new int[] { 85, 86, 87, 88, 88, 89,
		// 80, 90 }); //refactoring inline
		Student student = new Student("Cindy", 78, 85, 88, 87, 90);

		// typical way of declaring array
		int[] marks3 = new int[5];
		System.out.println("Reading arrays" + Arrays.toString(marks3));

		// int[] marks3 = {1,2,3,4,5,6.4} // incompatible possible lossy convertion
		// marks3.length; //length is a property of an array and not a method

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minumumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();

		String getName = student.getNameOfStudent();
		System.out.println("Name of Student : " + getName + "\n" + "No. of Marks : " + number + "\n"
				+ "Total No. of Marks : " + sum);
		System.out.println("Maximum Mark : " + maximumMark + "\n" + "Minimum Mark : " + minumumMark);
		System.out.println("Average Mark : " + average);
		student.addNewMark(68); // 5 + 1 = 6
		student.addNewMark(62); // 6 + 1 = 7
		student.addNewMark(65); // 7 + 1 = 8
		student.removeMarkAtIndex(3); // 8 - 1 = 7

		System.out.println(student);

	}

}
