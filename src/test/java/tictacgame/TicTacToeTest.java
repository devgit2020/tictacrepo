package tictacgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.test.game.GameConstant.*;
import com.test.game.TicTacToeFrame;

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

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

}
