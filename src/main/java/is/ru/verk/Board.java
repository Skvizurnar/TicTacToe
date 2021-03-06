package is.ru.verk;
import java.util.*;

public class Board {

	char[] board = new char[9]; //an array to keep track of the symbols
	
	
	Board()	{
		setBoard();
	}

	void printBoard() {
		System.out.println("     |     |     ");
		System.out.println("  " + board[0] + "  | " + board[1] + "   | " + board[2]);
		System.out.println("     |     |     ");
		System.out.println("-----+-----+-----");
		System.out.println("     |     |     ");
		System.out.println("  " + board[3] + "  | " + board[4] + "   | " + board[5]);
		System.out.println("     |     |     ");
		System.out.println("-----+-----+-----");
		System.out.println("     |     |     ");
		System.out.println("  " + board[6] + "  | " + board[7] + "   | " + board[8]);
		System.out.println("     |     |     ");
	}
	
	void setBoard()	{ //set up the board with empty squares (beginning of the game)
		for (int x = 0; x < board.length; x++) {
			board[x] = ' ';
		}
	}



        boolean isBoardFull()	{
		int counter = 0;
		for(int i = 0; i < board.length; i++)
		{
			if(board[i] != ' ') // We simply count all the cells that are occupied
				counter++;
		}
		if(counter == board.length)
			return true;
		return false;
	}
	
	//put the symbol in [c], the place in the array corresponding to c
	void putSymbol(int c, char symbol){
		board[c] = symbol;
	}

	boolean isOccupied(int x) {
		if(board[x] != ' ')
			return true;
		return false;
	}

	boolean symbolWon(char x) {
			//check all possible winning conditions		
		if(board[0] == board[1] && board[1] == board[2] && board[0] == x){
			return true;}
		if(board[3] == board[4] && board[4] == board[5] && board[3] == x){
                               return true;}
		if(board[6] == board[7] && board[7] == board[8] && board[6] == x){
			return true;}
		if(board[0] == board[3] && board[3] == board[6] && board[0] == x){
			return true;}
		if(board[1] == board[4] && board[4] == board[7] && board[1] == x){
                	return true;}
		if(board[2] == board[5] && board[5] == board[8] && board[2] == x){
                	return true;}
                if(board[0] == board[4] && board[4] == board[8] && board[0] == x){
                	return true;}
		if(board[2] == board[4] && board[4] == board[6] && board[2] == x){
                	return true;}
		return false;
	}
}

