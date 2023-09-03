package com.ExerciseCollectionsIterationAroundElement;

import java.util.Iterator;
import java.util.List;

public class MainSample {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(5,6,2,5,54,23,6,23);
		
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		
		System.out.println();
	
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> numberIterator = numbers.iterator();
		
		while(numberIterator.hasNext()) {
		System.out.print(numberIterator.next() + " ");
			}
			
		
		

	}

}
