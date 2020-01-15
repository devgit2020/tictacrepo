package com.tictactoe.game.eventhandle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.test.game.GamePanel;
import com.test.game.GameRules;
import com.test.game.component.GameDart;
import com.tictactoe.game.constants.GameConstant;
import com.tictactoe.game.enums.GameStatusEnum;
import com.tictactoe.game.enums.PlayerEnum;

/**
 * This class handles the players actions.
 * 
 * It change the button label as per the player turn
 * 
 *
 */

public class PlayButtonListener implements ActionListener {

	// player2 initial value
	public PlayerEnum previousTurn = PlayerEnum.PLAYER_2;
	// player1 initial value
	public PlayerEnum nextTurn = PlayerEnum.PLAYER_1;
	public GameStatusEnum currentStatus = null;
	
	// this defines the game rules
	public GameRules rules = new GameRules();
	
	List<GameDart> dartList = GamePanel.playDartList;

	/**
	 * This methods handles the action performed by the players
	 */

	public void actionPerformed(ActionEvent buttonEvent) {

		GameDart clickedButton = (GameDart) buttonEvent.getSource();

		// status of the game , if player still have the chance to continue
		this.currentStatus = GameStatusEnum.CONTINUE;

		// if this is the first click then it will be Player 1 else Player 2 vice versa.
		nextTurn = previousTurn.equals(PlayerEnum.PLAYER_1) ? PlayerEnum.PLAYER_2 : PlayerEnum.PLAYER_1;

		clickedButton.setText(nextTurn.getPlayerSymbol());

		// Set the player info in the custom property of component
		clickedButton.setCustomProperty(GameConstant.PLAYED, nextTurn);

		clickedButton.setEnabled(false);

		// Swap the value for next click
		previousTurn = nextTurn;
		
		

	}
}
