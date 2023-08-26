package com.ExerciseAbstractAndInterface;

public class FlyableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}
}
