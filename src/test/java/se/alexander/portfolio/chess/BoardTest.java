package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    @Test
    @DisplayName("Checks that the first square of board is A1")
    void firstSquareInBoardShouldBeA1() {
        SquareCoordinate squareCoordinate = SquareCoordinate.A1;
        Board board = new Board();
        assertEquals(squareCoordinate, board.getSquareInBoard(0).getCoordinate());
    }

    @Test
    @DisplayName("Checks that A1 square is black")
    void squareA1ShouldBeBlack() {
        Color color = Color.BLACK;
        Board board = new Board();
        assertEquals(color, board.getSquareInBoard(0).getColor());
    }

}
