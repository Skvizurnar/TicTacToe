package is.ru.verk;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTicTacToe {

        public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.verk.TestTicTacToe");
    }
       
	@Test
        public void testNewGame() {
		
                HumanPlayer sonja = new HumanPlayer("Sonja",'O');
                assertEquals("Sonja", sonja.getName());
                assertEquals('O', sonja.getSymbol());
        }


        
}

