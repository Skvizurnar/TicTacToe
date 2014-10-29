package is.ru.verk;
import java.util.*;
import java.io.Console;
 
public class TicTacToe {

	public static void main(String[] args)
    	{
		Board board = new Board();
		Player P1 = new HumanPlayer('X');
		Player P2 = new ComputerPlayer();
		Bool win = false;
		Console console = System.console();

		board.setBoard();

		board.printBoard();

		currentPlayer = Player1;

		while(win == false)	{

		System.out.println("Make a move, " + currentPlayer.getName());
		currentPlayer.makeAMove();

		board.printBoard();

		if(board.hasWon(currentPlayer.getSymbol()))	{
			win = true;
		}
		else if(board.isBoardFull())	{
			
			System.out.println("The game ended in a draw...");
			break;
		}		
		
		}
		if(Player2 == currentPlayer)
		{
			currentPlayer = Player1;
		}
		else
		{
			currentPlayer = Player2;
		}		


	}

        public static int add(String text){

	if(text.equals("")){
		return 0;
          }
		return 1;
        }

}

