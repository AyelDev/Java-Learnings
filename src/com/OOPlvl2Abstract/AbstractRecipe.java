package com.OOPlvl2Abstract;

public abstract class AbstractRecipe{
//abstract can be private while interface cannot
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
