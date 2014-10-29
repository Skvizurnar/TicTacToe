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
                assertFalse(testBoard.isBoardFull());
		testBoard.putSymbol(i, 'X');        
		}
	
	assertTrue(testBoard.isBoardFull());
                
	}

	@Test
	public void testIfBoxIsOccupied(){
	Board testBoard = new Board();

        testBoard.putSymbol(1, 'X');
	assertTrue(testBoard.isOccupied(1));
        }

	@Test
	public void testIfSymbolHasWon() {
	Board testBoard = new Board();
	testBoard.putSymbol(0, 'X');
	testBoard.putSymbol(1, 'X');
	testBoard.putSymbol(2, 'X');	
	assertTrue(testBoard.symbolWon('X'));
	}



	
}

