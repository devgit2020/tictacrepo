package tictactoe.game.test;

import static com.tictactoe.game.constants.GameConstant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

}