package com.ExcemptionHandling;

public class ExcemptionHandling {

	public static void main(String[] args) {

		String someString = null;
		try {
			String[] stringArray = someString.split(",");
			System.out.println(stringArray);
		} catch (NullPointerException e) {
			System.out.println("opps: " + e);
		}

	}

}
