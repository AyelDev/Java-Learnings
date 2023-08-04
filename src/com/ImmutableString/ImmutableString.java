package com.ImmutableString;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// link for the description 
		// https://www.youtube.com/watch?v=Bj9Mx_Lx3q4
		
		//Nag refer ra sa word na john (Single object ra ang John)
		String str = "John";
		String anotherStr = "John";

		//Nag create ug bag o nga object nga john
		String thirdStr = new String("John");
		
		System.out.println("str == anotherStr : " + (str == anotherStr)); // true
		System.out.println("thirdStr == str : " + (thirdStr == str)); //false
	}

}
