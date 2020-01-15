package com.test.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.game.component.GameDart;
import com.tictactoe.game.enums.GameStatusEnum;
import com.tictactoe.game.enums.PlayerEnum;
import com.tictactoe.game.utils.GamePatterns;

/**
 * 
 * It defines the rules for win / continue / draw
 * 
 * It also check status of the game , if any of user
 * 
 * is match with the winning criteria.
 *
 * 
 *
 */

public class GameRules {

	GameStatusEnum gameStatus = null;

	/**
	 * Initialize the winning condition at first time
	 * 
	 * 
	 */
	public GameRules() {
		GamePatterns.gamePattern();
	}

	/**
	 * check the game status
	 * 
	 */

	public GameStatusEnum statusCheck(List<GameDart> dartList, String clientProperty) {

		gameStatus = GameStatusEnum.CONTINUE;

		long clickedCount = dartList.stream()
				.filter(button -> button.getCustomProperty(clientProperty).equals(PlayerEnum.PLAYER_1)
						|| button.getCustomProperty(clientProperty).equals(PlayerEnum.PLAYER_2))
				.count();

		return clickedCount == 9 ? GameStatusEnum.DRAW : GameStatusEnum.CONTINUE;

	}

}
