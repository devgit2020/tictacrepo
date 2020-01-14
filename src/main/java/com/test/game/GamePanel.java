package com.test.game;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	public GamePanel() {
		setLayout(new GridLayout(3, 3));
		setName(GameConstant.PANEL_NAME);
	}


}
