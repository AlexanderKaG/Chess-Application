package com.github.alexanderkag.portfolio.chess;

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

    public Square getSquareInBoard(SquareCoordinate coordinate) {
        for (Square square : squaresInBoard) {
            if (square.getCoordinate() == coordinate) {
                return square;
            }
        }
        return null;
    }

    public Color getColorOfSquare(Square square) {
        return getSquareInBoard(square.getCoordinate()).getColor();
    }

    @SuppressWarnings("java:S1488")
    public SquareCoordinate getCoordinateOfSquare(Square square) {
        SquareCoordinate coordinate = square.getCoordinate();
        return coordinate;
    }

    public int getAmountOfSquaresInBoard() {
        return squaresInBoard.size();
    }

}
