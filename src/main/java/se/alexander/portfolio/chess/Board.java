package se.alexander.portfolio.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> board = new ArrayList<>();

    public Board() {
        for (SquareCoordinate coordinate : SquareCoordinate.values()) {
            Square square = new Square(coordinate);
            board.add(square);
        }
    }

    public Square getSquareInBoard(int i) {
        return board.get(i);
    }
}
