package is.ru.verk;
import java.util.*;
import java.io.*;
import java.util.Scanner;

 
public class TicTacToe {

	public static void main(String[] args)
    	{
		Board board = new Board();
		Player P1 = new HumanPlayer("Player1", 'X');	//initiliaze two players, one human, one computer
		Player P2 = new ComputerPlayer("Computer", 'O');
		Boolean win = false;
		Console console = System.console();

		board.setBoard();

		board.printBoard();

		Player currentPlayer = P1;	//Player 1 will always start,maybe generate a random function to fix?

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
			if(P1 == currentPlayer)		{	//switch players
				currentPlayer = P2;
			}
			else	{
				currentPlayer = P1;
			}
		}		
	}

}

