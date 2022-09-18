package se.alexander.portfolio.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Square> squaresInBoard = new ArrayList<>();

    public Board() {
        for (SquareCoordinate coordinate : SquareCoordinate.values()) {
            Square square = new Square(coordinate);
            squaresInBoard.add(square);
        }
    }

    public Square getSquareInBoard(int i) {
        return squaresInBoard.get(i);
    }

    public int getAmountOfSquaresInBoard() {
        return squaresInBoard.size();
    }
}
