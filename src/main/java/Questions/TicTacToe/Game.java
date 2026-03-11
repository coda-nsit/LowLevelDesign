package Questions.TicTacToe;

import java.util.List;

public class Game {

    private Board board;
    private Player[] players;
    private int currentPlayer;

    public Game(int size, Player p1, Player p2) {
        board = new Board(size);
        players = new Player[]{p1, p2};
        currentPlayer = 0;
    }

    public void playMove(int row, int col) {

        Player player = players[currentPlayer];

        boolean success = board.makeMove(row, col, player.getSymbol());

        if(!success) {
            System.out.println("Invalid move");
            return;
        }

        System.out.println(player.getName() + " placed at (" + row + "," + col + ")");

        currentPlayer = (currentPlayer + 1) % players.length;
    }
}