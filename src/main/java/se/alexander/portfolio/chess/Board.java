package se.alexander.portfolio.chess;

import java.util.List;

public class Board {

    private List<Square> squares;

    public Board(List<Square> squares) {
        this.squares = squares;
    }

    public Square getSquares(int squareIndex) {
        return squares.get(0);
    }
}
