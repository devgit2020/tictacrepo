package com.test.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

public class GameRules  {

	// defines the winning dimension rules
	public List<List<Integer>> winningRules = new ArrayList<>(); 
	
	/**
	 * Initialize the winning condition at first time
	 * 
	 * 
	 */
	public GameRules() {
		rulesInitializeForTheWin();
	}

	/**
	 * Initialize the 8 different criteria / rule to win the match
	 * 
	 */

	private void rulesInitializeForTheWin() {

		winningRules.add(Arrays.asList(0, 1, 2));
		winningRules.add(Arrays.asList(3, 4, 5));
		winningRules.add(Arrays.asList(6, 7, 8));
		winningRules.add(Arrays.asList(0, 3, 6));
		winningRules.add(Arrays.asList(1, 4, 7));
		winningRules.add(Arrays.asList(2, 5, 8));
		winningRules.add(Arrays.asList(0, 4, 8));
		winningRules.add(Arrays.asList(2, 4, 6));

	}

	

	
		

}
