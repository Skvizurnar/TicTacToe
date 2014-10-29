package is.ru.verk;
import java.util.*;

public class HumanPlayer extends Player {

        public static int add(String text){

                if(text.equals("")){
                        return 0;
                }

                return 1;
        }

	HumanPlayer(String name, char symb)
	{
		super(name, symb);
	}

	// Player make a move
	void makeAMove(Board b){
		Scanner reader = new Scanner(System.in);
		boolean error = false;
		do{
			System.out.println("Number what boc do you want to choose");
			int box = reader.nextInt();
			error = false;
			if(box < 0 || box > 8){
				System.out.println("Box number has to be in the range of 0-8");
				error = true;
			}
			else if(b.isOccupied(box)){
				System.out.println("This box is already full try another");
				error = true;
			
			}
			else
				b.putSymbol(box, symbol);
		}while(error == true);    //ask again 
	}

}
