package com.JavaArrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class CompareSortAndFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//filling in elements of an array which is created with no specific value
		int[] marks = new int[10];
		Arrays.fill(marks, 100);
		System.out.println(Arrays.toString(marks));
		
		//comparing array
		int[] array1 = {1,2,3};
		int[] array2 = {3,2,1,4,5};
		
		boolean compare = Arrays.equals(array1, array2);
		System.out.println(compare);
		
		//sorting an array
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		
		float a = 19.11f;
		float b = 2;
		System.out.println(new BigDecimal(a).divide(new BigDecimal(b), 2, RoundingMode.HALF_UP));
		
	}

}
