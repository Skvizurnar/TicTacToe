package is.ru.verk;
import java.util.*;


public abstract class Player{

	String playerName;
	char symbol;

	Player(String name, char symb)
	{
		playerName = name;
		symbol = symb;
	}

	// Returns symbol of player
	char getSymbol()
	{
		return symbol;
	}

	abstract void makeAmove(Board b);

	// Returns the name of of this player
	String getName()
	{
		return playerName;
	}
}
