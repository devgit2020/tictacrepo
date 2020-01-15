package com.tictactoe.game.enums;

/**
 * This enum class will be used to indicate which player is playing the game.
 *
 * 
 */

public enum PlayerEnum {

	PLAYER_1("X"), PLAYER_2("O");

	private String playerSymbol;

	PlayerEnum(String playerSymbol) {
		this.playerSymbol = playerSymbol;
	}

	public String getPlayerSymbol() {
		return playerSymbol;
	}

}
