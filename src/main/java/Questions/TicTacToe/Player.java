package Questions.TicTacToe;

public class Player {
    private String name;
    private Symbol  Symbol;

    public Player(String name, Symbol  symbol) {
        this.name = name;
        Symbol = symbol;
    }
    // getter and setters

    public String getName() {
        return name;
    }

    public Symbol  getSymbol() {
        return Symbol;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSymbol(Symbol  symbol) {
        Symbol = symbol;
    }
}
