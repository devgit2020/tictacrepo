package com.test.game;

import java.awt.BorderLayout;

import javax.swing.JFrame;
/**
 * 
 * This is the frame board where the game
 * darts will be add for the player
 * 
 *
 */

public class TicTacToeFrame extends JFrame{
	
	
	public TicTacToeFrame() {
		setLayout(new BorderLayout());
		setTitle("TicTacToe Game");
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 300, 300);
		setSize(500, 300);

		
	}

	
	
	

}
