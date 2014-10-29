package is.ru.verk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestBoard {

        public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.verk.TestBoard");
    }
	
	@Test
	public void testEmptyBoard(){
	Board testBoard = new Board();
	for(int i = 0; i < testBoard.board.length; i++)	{
		assertEquals(' ', testBoard.board[i]);
		}
	}
	
	
	@Test
	public void testIsBoardFull() {
	Board testBoard = new Board();
	for(int i = 0; i < testBoard.board.length; i++)      {
                //	testBoard.board[i][j] = 'X';
		assertFalse(testBoard.isBoardFull());
		testBoard.putSymbol(i, 'X');
		//testBoard.putSymbol(i, j, 'X');        
		}
	
	assertTrue(testBoard.isBoardFull());
                
	}
}

