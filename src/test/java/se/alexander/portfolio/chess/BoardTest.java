package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static se.alexander.portfolio.chess.SquareCoordinate.*;

class BoardTest {

    @Test
    @DisplayName("Checks that the first square of board is A1")
    void firstSquareInBoardShouldBeA1() {
        SquareCoordinate squareCoordinate = A1;
        Board board = new Board();
        assertEquals(squareCoordinate, board.getCoordinateOfSquare(squareBasedOnBoardAndCoordinate(board, A1)));
    }

    @Test
    @DisplayName("Checks that A3 square is black")
    void squareA1ShouldBeBlack() {
        Color color = Color.BLACK;
        Board board = new Board();
        assertEquals(color, board.getColorOfSquare(squareBasedOnBoardAndCoordinate(board, A3)));
    }

    @Test
    @DisplayName("Checks that board consists of 64 squares")
    void squaresInBoardShouldEquals64() {
        int amountOfSquaresInBoard = 64;
        Board board = new Board();
        assertEquals(amountOfSquaresInBoard, board.getAmountOfSquaresInBoard());
    }

    private static Square squareBasedOnBoardAndCoordinate(Board board, SquareCoordinate coordinate) {
        return board.getSquareInBoard(coordinate);
    }

}
