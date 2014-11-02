package is.ru.verk;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication {
        public static void main(String[] args) {
                staticFileLocation("/public");
		SparkApplication TicTacToe  = new TicTacToeWeb ();
                String port = System.getenv("PORT");
                if (port != null) {
                        setPort(Integer.valueOf(port));
                }
                TicTacToe.init();
        }

    public void init() {

        final Board board = new Board();
        final Player P1 = new HumanPlayer("Player 1", 'X');
        final Player P2 = new ComputerPlayer("Player 2",'O');
	//final TicTacToe game = new TicTacToe();
		

        post(new Route("/board") {
            @Override
            public Object handle(Request request, Response response) {
                board.setBoard();
                board.printBoard();
                return true;
            }
        });

        post(new Route("/makeAMove") {
                @Override
                public Object handle(Request request, Response response) {
                        Integer input = Integer.valueOf(request.queryParams("makeAMove")); //minus one because we are using an int array
                        Player currentPlayer = P1;
                        Boolean win = false;
                        while(win == false)     {
                        System.out.println("Make a move, " + currentPlayer.getName());
                        currentPlayer.makeAMove(board);
                        board.printBoard();

                        if(board.symbolWon(currentPlayer.getSymbol()))  {
                                win = true;
                                System.out.println(currentPlayer.getName() + " has won the game.");
                                break;
                        }
                        else if(board.isBoardFull())    {
                                System.out.println("The game ended in a draw...");
                                break;
                        }
                        if(P1 == currentPlayer)         {
                                currentPlayer = P2;
                        }
                        else    {
                                currentPlayer = P1;
                        }

                        }

                        return true;
                        }
                });
        }
}
