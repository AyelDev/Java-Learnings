package com.OOPlvl2Interface;

public class GameRunner {

	public static void main(String[] args) {
		
		GamingConsole game = new ChessGame(); // or
		//ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
