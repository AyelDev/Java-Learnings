package com.OOPlvl2Abstract;

public abstract class AbstractRecipe{

public void execute() {
	getReady();
	doTheDish();
	cleanup();
}

//prepare
abstract void getReady();

//recipe
abstract void doTheDish();

//cleanup
abstract void cleanup();


}
