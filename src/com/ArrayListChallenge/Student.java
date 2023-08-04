package com.ArrayListChallenge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) { // variable arguments
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.size(); // array is size and ArrayList is size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
//		int minimum = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}

		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		// total
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.HALF_UP);
		//same as
		// return new BigDecimal(sum).divide(new BigDecimal(number)).setScale(2, RoundingMode.HALF_UP);
	}

	public void addNewMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);
		System.out.println(marks.size());
	}

	public void removeMarkAtIndex(int mark) {
		// TODO Auto-generated method stub
		marks.remove(mark);
		System.out.println(marks.size());
	}

	public String getNameOfStudent() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String toString() { // Able to read the Student.out.println(student);
		return name + marks;
	}

}
