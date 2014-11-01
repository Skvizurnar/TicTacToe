package is.ru.verk;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import is.ru.verk.TicTacToe;

public class TicTacToeWeb implements SparkApplication {
	public static void main(String[] args) {
		staticFileLocation("/resources");
		SparkApplication TicTacToe  = new TicTacToeWeb();
		String port = System.getenv("PORT");
		if (port != null) {
            setPort(Integer.valueOf(port));
        } 
        TicTacToe.init();
	}

    TicTacToe board;

    public void init() {
        
        if (board == null) {
            board = new TicTacToe();
        }

        post(new Route("/board") {
            @Override
            public Object handle(Request request, Response response) {
                board = new TicTacToe();
                return true;
            }
        });

    }
}
