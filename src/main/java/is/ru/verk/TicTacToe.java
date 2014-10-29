package is.ru.verk;
import java.util.*;

 
public class TicTacToe {

	public static void main(String[] args)
    	{
		Board board = new Board();
		board.setBoard();
		
	}

        public static int add(String text){

	if(text.equals("")){
		return 0;
          }
		return 1;
        }

}

