package com.OOPlvl2Abstract;

public class RecipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractRecipe recipe2 = new Recipe1();
		Recipe1 recipe = new Recipe1();
		recipe2.execute();
		
		//recipe2.
		
		System.out.println();
		RecipeWithMicrowave recipe1 = new RecipeWithMicrowave();
		recipe1.execute();
	}

}
