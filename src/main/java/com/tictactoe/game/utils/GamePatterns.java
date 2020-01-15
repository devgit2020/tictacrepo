package com.tictactoe.game.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * This class defines the constants
 * 
 * 
 *
 */

public class GamePatterns {

	public static List<List<Integer>> winningRules = new ArrayList<>();

	public static List<List<Integer>> gamePattern() {
		winningRules.add(Arrays.asList(0, 1, 2));
		winningRules.add(Arrays.asList(3, 4, 5));
		winningRules.add(Arrays.asList(6, 7, 8));
		winningRules.add(Arrays.asList(0, 3, 6));
		winningRules.add(Arrays.asList(1, 4, 7));
		winningRules.add(Arrays.asList(2, 5, 8));
		winningRules.add(Arrays.asList(0, 4, 8));
		winningRules.add(Arrays.asList(2, 4, 6));
		
		return winningRules;

	}
}
