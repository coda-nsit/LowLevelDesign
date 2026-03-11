package Questions.TicTacToe;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        Player player1 = new Player("Alice", Symbol.X);
        Player player2 = new Player("Bob", Symbol.O);

        Game game = new Game(3, player1, player2);

        game.playMove(0, 0);
        game.playMove(1, 1);
        game.playMove(0, 1);
        game.playMove(1, 2);
        game.playMove(0, 2);
    }
}