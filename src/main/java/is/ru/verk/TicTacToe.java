package is.ru.verk;
import java.util.*;
import java.io.Console;
 
public class TicTacToe {

	public static void main(String[] args)
    	{
		Board board = new Board();
		Player P1 = new HumanPlayer("Player1", 'X');
		Player P2 = new ComputerPlayer("Player2", 'O');
		Boolean win = false;
		Console console = System.console();

		board.setBoard();

		board.printBoard();

		Player currentPlayer = P1;

		while(win == false)	{
			System.out.println("Make a move, " + currentPlayer.getName());
			currentPlayer.makeAMove(board);
			board.printBoard();

			if(board.symbolWon(currentPlayer.getSymbol()))	{
				win = true;
				System.out.println(currentPlayer.getName() + " has won the game.");
				break; 
			}
			else if(board.isBoardFull())	{
				System.out.println("The game ended in a draw...");
				break;
			}			
		}
		if(P2 == currentPlayer)		{
			currentPlayer = P1;
		}
		else	{
			currentPlayer = P2;
		}		
	}

}

