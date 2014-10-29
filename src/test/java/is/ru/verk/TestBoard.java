package is.ru.verk;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBoard {

        public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.verk.TestBoard");
    }
	
	@Test
	public void testEmptyBoard(){
	
	Board testBoard = new Board();
	
		for(int i = 0; i < 3; i++)	{
			for(int j = 0; j < 3; j++)	{
				assertEquals(' ', testBoard.board[i][j]);
		}
	}
        
}
}

