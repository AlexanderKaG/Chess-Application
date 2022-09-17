package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    @DisplayName("First index of board array of squares should be square A1")
    void firstIndexShouldBeSquareA1() {
        Square expectedSquare = Square.A1;
        List<Square> squares = new ArrayList<>();
        for (Square square : Square.values()) {
            squares.add(square);
        }
        Board board = new Board(squares);
        assertEquals(expectedSquare, board.getSquares(0));
    }

}
