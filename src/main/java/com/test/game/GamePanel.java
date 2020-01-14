package com.test.game;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.test.game.component.GameDart;
import com.test.game.component.GameDartImpl;

/**
 * 
 * It's panel class which add buttons to the
 * frame.
 *
 */

public class GamePanel extends JPanel {

	// holds 9 play button reference of game board

	public List<GameDart> playDartList = null;

	public GamePanel() {
		setLayout(new GridLayout(3, 3));
		setName(GameConstant.PANEL_NAME);

	}

	/**
	 * This method adds 9 play button to the panel.
	 * 
	 *
	 * 
	 */
	public void addButtonToPanel() {
		playDartList = new ArrayList<GameDart>();

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				GameDart compButton = new GameDartImpl();

				// Set the different value initially so that it will not match each other for
				// first time.This value will change with "X"/ "O" when the user clicks the
				// button.
				compButton.setCustomProperty(GameConstant.PLAYED, Math.random());

				compButton.setBackground(Color.white);
				add(compButton);
				playDartList.add(compButton);
			}

	}
	
	
	

}
