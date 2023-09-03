package com.RemovingAndSortingListAndArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class classOfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List values = List.of("A", 'A', 5, 0.2);
		System.out.println(values.get(0) instanceof String);
		
		List<Integer> numberValues = List.of(102, 105, 163, 105, 109, 101);
		List<Integer> numberAl = new ArrayList<>(numberValues);
		
		numberAl.remove(Integer.valueOf(101));
		Collections.sort(numberAl);
		
		System.out.println(numberAl);
		
	}

}
