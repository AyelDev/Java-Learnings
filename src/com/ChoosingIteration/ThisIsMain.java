package com.ChoosingIteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThisIsMain {

	public static void main(String[] args) {
		List<String> word = List.of("Apple", "Bat","Cat");
		List<String> wordAl = new ArrayList<>(word);
	
//		for(String words : wordAl) {
//			if(words.endsWith("at")) {
//				wordAl.remove(words);
//				
//			}
//		}System.out.println(wordAl);
		
		Iterator<String> iterator = wordAl.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
				
			}
		}System.out.println(wordAl);
		
		
	}

}
