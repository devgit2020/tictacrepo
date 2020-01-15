package tictactoe.game.test;

import static com.tictactoe.game.constants.GameConstant.BUTTON_ADD_MESSAGE;
import static com.tictactoe.game.constants.GameConstant.GAME_INITIAL_STATUS;
import static com.tictactoe.game.constants.GameConstant.PANEL_NAME;
import static com.tictactoe.game.constants.GameConstant.PLAYED;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.test.game.GameRules;
import com.test.game.TicTacToeFrame;
import com.tictactoe.game.enums.PlayerEnum;

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
	public void gamePattern() {
		
		GameRules rules = new GameRules();

		List<Integer> pattern1 = Arrays.asList(0, 1, 2);
		assertTrue(rules.winningRules.contains(pattern1));

		List<Integer> pattern2 = Arrays.asList(3, 4, 5);
		assertTrue(rules.winningRules.contains(pattern2));

		List<Integer> pattern3 = Arrays.asList(6, 7, 8);
		assertTrue(rules.winningRules.contains(pattern3));

		List<Integer> pattern4 = Arrays.asList(0, 3, 6);
		assertTrue(rules.winningRules.contains(pattern4));

		List<Integer> pattern5 = Arrays.asList(1, 4, 7);
		assertTrue(rules.winningRules.contains(pattern5));

		List<Integer> pattern6 = Arrays.asList(2, 5, 8);
		assertTrue(rules.winningRules.contains(pattern6));

		List<Integer> pattern7 = Arrays.asList(0, 4, 8);
		assertTrue(rules.winningRules.contains(pattern7));

		List<Integer> pattern8 = Arrays.asList(2, 4, 6);
		assertTrue(rules.winningRules.contains(pattern8));
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

}
