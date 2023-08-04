package com.StringClassExercise;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String someString = "This is a lot of text again";
        
        for(int i = 0; i< someString.length(); i++) {
            System.out.println(someString.charAt(i));
        }
        
        //more methods
        System.out.println("\n" + someString.indexOf("T")); //0
        System.out.println(someString.lastIndexOf("lot")); //10
        System.out.println(someString.contains("again")); //true
        String str = "Value";
        System.out.println(str.equalsIgnoreCase("VAlue")); //true

	}

}
