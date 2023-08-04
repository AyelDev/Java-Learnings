package com.JavaArrayExercise;

public class DaysOfWeek {
	
	private String[] DaysOfWeek;

	public DaysOfWeek(String... string) {
		// TODO Auto-generated constructor stub
		this.DaysOfWeek = string;
	}

	public String getLongestString() {
		// TODO Auto-generated method stub
		String longString = "" ;
		for(String day : DaysOfWeek) {
			if(longString.length() < day.length()) {
				longString = day;
			}
			
		}
		return longString;
		
		
	}

	public void getPrintBackwards() {
		// TODO Auto-generated method stub
		for(int i = DaysOfWeek.length -1; i >= 0; i-- ) {
			System.out.println(DaysOfWeek[i]);
		}
		
	}

 
	
}
