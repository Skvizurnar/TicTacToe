package is.ru.verk;
import java.util.*;
import java.util.Random;

public class ComputerPlayer extends Player {


	ComputerPlayer(String name, char symbol){
		super(name, symbol);
	}

	// Generate a cell for medium difficulty
	void makeAmove(Board b){
		Random rand = new Random();
		int box = 0;
		if(b.isBoardFull() == false){
			while(!b.isOccupied(box)){
				box = rand.nextInt(9);
			}
			b.putSymbol(box,symbol);
		}
	}

}

