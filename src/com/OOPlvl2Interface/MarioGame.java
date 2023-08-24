package com.OOPlvl2Interface;

public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Go Jump");
		
	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");
		
	}

	@Override
	public void left() {
		System.out.println("Go Forward");
		
	}

	@Override
	public void right() {
		System.out.println("Go Backward");
		
	}



}
