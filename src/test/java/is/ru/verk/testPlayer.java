package is.ru.verk;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testPlayer {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.verk.testPlayer");
    }
	@Test
	public void testEmptyString() {
		assertEquals(0, Player.add(""));
	}
	
	@Test
	public void testEmptyString2() {
		assertEquals(0, Board.add(""));
	}
	
	@Test
	public void testEmptyString3() {
		assertEquals(0, humanPlayer.add(""));
	}
	
	@Test
	public void testEmptyString4() {
		assertEquals(0, computerPlayer.add(""));
	}
}
