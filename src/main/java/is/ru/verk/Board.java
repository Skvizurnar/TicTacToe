package is.ru.verk;
import java.util.*;

public class Board {

	char[][] board = new char[3][3];
	
	public void printBoard() {
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("---+---+---");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("---+---+---");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	
	public void setBoard()	{
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				board[x][y] = ' ';
			}
		}
	}



        public boolean isBoardFull()	{
		int counter = 0;
		for(int i = 0; i < 3; i++)	{
			for(int j = 0; j < 3; i++)	{
				if(board[i][j] != ' ') //if not empty then the counter is increased
				counter++;
			}
		}
		if(counter == 9)	//if the counter is equals to 9 then the board is full
			return true;
		return false;
	}

}

