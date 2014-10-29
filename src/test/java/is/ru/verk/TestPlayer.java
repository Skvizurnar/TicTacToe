package is.ru.verk;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPlayer {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.verk.TestPlayer");
    }
	@Test
	public void testEmptyString() {
		assertEquals(0, Player.add(""));
	}
	
	@Test
	public void testEmptyString3() {
		assertEquals(0, HumanPlayer.add(""));
	}
	
	@Test
	public void testEmptyString4() {
		assertEquals(0, ComputerPlayer.add(""));
	}
}
