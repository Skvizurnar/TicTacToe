package is.ru.verk;
import java.util.*;
import java.util.Random;

public class ComputerPlayer extends Player {


	ComputerPlayer(String name, char symbol){
		super(name, symbol);
	}
	//We generate a random number from 0-8 for the computer player
	void makeAMove(Board b){
		Random rand = new Random();
		int box = 0;
		if(!b.isBoardFull()){
			while(b.isOccupied(box)){
				box = rand.nextInt(9);
			}
			b.putSymbol(box, symbol);
		}
	}

}

