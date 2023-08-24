package com.ObjectOrientedProgramming2;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
		fan.switchOn();
		//fan.setSpeed((byte) 5);
		System.out.println(fan);
	}

}
