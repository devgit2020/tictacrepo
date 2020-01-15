package tictactoe.game.test;

import static com.tictactoe.game.constants.GameConstant.BUTTON_ADD_MESSAGE;
import static com.tictactoe.game.constants.GameConstant.GAME_INITIAL_STATUS;
import static com.tictactoe.game.constants.GameConstant.PANEL_NAME;
import static com.tictactoe.game.constants.GameConstant.PLAYED;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.test.game.GameRules;
import com.test.game.TicTacToeFrame;
import com.test.game.component.GameDart;
import com.test.game.component.GameDartImpl;
import com.tictactoe.game.constants.GameConstant;
import com.tictactoe.game.enums.GameStatusEnum;
import com.tictactoe.game.enums.PlayerEnum;
import com.tictactoe.game.utils.GamePatterns;

public class TicTacToeTest {

	static TicTacToeFrame frame = null;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		frame = new TicTacToeFrame();
	}

	@Test
	public void check_AddPanel() {
		frame.addPanel();
		assertEquals(frame.getContentPane().getName(), PANEL_NAME);
	}

	@Test
	public void checkGridSize() {

		frame.addPanel();

		assertEquals(frame.gamePanel.playDartList.size(), 9, BUTTON_ADD_MESSAGE);

	}

	@Test
	public void checkPlayerActionPerformed() {

		frame.addPanel();
		long count = frame.gamePanel.playDartList.stream()
				.filter(button -> button.getClientProperty(PLAYED).equals(PlayerEnum.PLAYER_1)
						|| button.getClientProperty(PLAYED).equals(PlayerEnum.PLAYER_2))
				.count();

		assertEquals(count, 0, GAME_INITIAL_STATUS);

	}

	@Test
	public void validateGamePattern() {

		GameRules rules = new GameRules();

		List<Integer> pattern1 = Arrays.asList(0, 1, 2);
		assertPatterns(rules, pattern1);

		List<Integer> pattern2 = Arrays.asList(3, 4, 5);
		assertPatterns(rules, pattern2);

		List<Integer> pattern3 = Arrays.asList(6, 7, 8);
		assertPatterns(rules, pattern3);

		List<Integer> pattern4 = Arrays.asList(0, 3, 6);
		assertPatterns(rules, pattern4);

		List<Integer> pattern5 = Arrays.asList(1, 4, 7);
		assertPatterns(rules, pattern5);

		List<Integer> pattern6 = Arrays.asList(2, 5, 8);
		assertPatterns(rules, pattern6);

		List<Integer> pattern7 = Arrays.asList(0, 4, 8);
		assertPatterns(rules, pattern7);

		List<Integer> pattern8 = Arrays.asList(2, 4, 6);
		assertPatterns(rules, pattern8);
	}

	private void assertPatterns(GameRules rules, List<Integer> pattern) {
		assertTrue(GamePatterns.gamePattern().contains(pattern));
	}

	@Test
	public void validateContinueStatus() {

		GameRules rules = new GameRules();
		List<GameDart> dartList = new ArrayList<>();

		for (int count = 0; count <= 8; count++) {
			GameDart compButton = new GameDartImpl();
			compButton.setCustomProperty(GameConstant.PLAYED, Math.random());
			dartList.add(compButton);
		}

		// random clicks to see player is in continue
		int[] clickPosition = { 7, 8, 4, 2 };
		for (Integer i : clickPosition) {
			dartList.get(i).doClick();
		}

		// after random clicks, assert the status
		assertEquals(rules.statusCheck(dartList, GameConstant.PLAYED), GameStatusEnum.CONTINUE,
				GameConstant.GAME_CONTINUE);

	}

	@Test
	public void drawGame_Where_No_WinningRules_Match() {

		GameRules rules = new GameRules();

		List<GameDart> dartList = new ArrayList<>();
		for (int count = 0; count <= 8; count++) {

			GameDart compButton = new GameDartImpl();
			compButton.setCustomProperty(GameConstant.PLAYED, Math.random());
			dartList.add(compButton);
		}

		// random clicks to see player is in draw situation
		int[] clickPosition = { 0, 2, 1, 3, 6, 4, 5, 7, 8 };
		for (int i = 0; i < clickPosition.length; i++) {
			if (i % 2 == 0)
				dartList.get(clickPosition[i]).setCustomProperty(GameConstant.PLAYED, PlayerEnum.PLAYER_1);
			else
				dartList.get(clickPosition[i]).setCustomProperty(GameConstant.PLAYED, PlayerEnum.PLAYER_2);
		}

		assertEquals(rules.statusCheck(dartList, GameConstant.PLAYED), GameStatusEnum.DRAW, GameConstant.GAME_DRAW);

	}



	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

}
