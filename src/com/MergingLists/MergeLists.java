package com.MergingLists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {

	public static void main(String[] args) {
		List<String> lister1 = List.of("Dog, Cat");
		List<String> lister2 = List.of("Mouse, Rat");
		List<String> lister3 = List.of("Alligator, Giraffe");
		List<String> lister4 = List.of("Carabao, Monkey");
		
		
		ArrayList<String> list1 = new ArrayList<String>(lister1);
		ArrayList<String> list2 = new ArrayList<String>(lister2);
		ArrayList<String> list3 = new ArrayList<String>(lister3);
		ArrayList<String> list4 = new ArrayList<String>(lister4);
		ArrayList<String> merge = new ArrayList<String>();
		
		//from chat gpt
		merge.addAll(Stream.of(list1, list2, list3, list4).flatMap(List::stream).collect(Collectors.toList()));
		
		
		System.out.println(merge);
		
	
		
		
	}

}
