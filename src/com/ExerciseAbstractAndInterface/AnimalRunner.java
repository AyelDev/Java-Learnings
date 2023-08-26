package com.ExerciseAbstractAndInterface;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animal = {new Cat(),new Dog()};

		for(Animal animals : animal) {
			animals.bark();
		}
		
	}

}
		