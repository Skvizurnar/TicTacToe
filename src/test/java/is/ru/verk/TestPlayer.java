package is.ru.verk;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPlayer {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.verk.TestPlayer");
    }



	@Test
	public void testHumanPlayer() {
		HumanPlayer sonja = new HumanPlayer("Sonja",'O');
		assertEquals("Sonja",sonja.getName());
		assertEquals('O', sonja.getSymbol());
	}
	
	 @Test
        public void testComputerPlayer() {
                ComputerPlayer Lexa = new ComputerPlayer("Lexa",'X');
                assertEquals("Lexa",Lexa.getName());
                assertEquals('X', Lexa.getSymbol());
        }
}
