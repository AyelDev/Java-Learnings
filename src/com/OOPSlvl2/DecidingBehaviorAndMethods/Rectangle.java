package com.OOPSlvl2.DecidingBehaviorAndMethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle {

	// state
	private float length;
	private float width;
	

	// constructor
	public Rectangle(float length, float width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}

	// behavior
	
	
	public String toString() {
	float perimeter = getPerimeter();
	BigDecimal area = getAreaOfRectable();
	return String.format("Length : %.2f%nWidth : %.2f%nPerimeter : %.2f%nArea %.2f%n", length, width, perimeter, area);	
	}

	public BigDecimal getAreaOfRectable() {
		// TODO Auto-generated method stub
		return new BigDecimal(length).multiply(new BigDecimal(width)).setScale(2, RoundingMode.HALF_UP);
	}

	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}

}
