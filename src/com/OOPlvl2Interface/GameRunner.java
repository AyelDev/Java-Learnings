package com.OOPlvl2Interface;



public class GameRunner {

	public static void main(String[] args) {
		
		//GamingConsole game = new ChessGame(); // or
		//ChessGame game = new ChessGame();
		
		GamingConsole[] games = {new ChessGame(), new MarioGame()};
		
		
		for(GamingConsole game: games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		
		
	}

}
