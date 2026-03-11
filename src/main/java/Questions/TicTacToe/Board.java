package Questions.TicTacToe;

public class Board {
    private int[][] grid;
    private int size;

    public Board(int size) {
        grid = new int[size][size];
    }

    public boolean makeMove(int row, int col, Symbol player) {

        if(row < 0 || row >= size || col < 0 || col >= size)
            return false;

        if(grid[row][col] != 0)
            return false;

        if(player == Symbol.O) grid[row][col] = 1;
        else if(player == Symbol.X) grid[row][col] = 2;
        return true;
    }

}
