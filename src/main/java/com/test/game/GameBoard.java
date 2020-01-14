package com.test.game;

import java.awt.EventQueue;

/**
 * 
 * This is the main game board class.
 * 
 * It start the game board.
 *
 */

public class GameBoard {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				TicTacToeFrame frame = new TicTacToeFrame();
				frame.addPanel();
			
			}
		});
	}

}
