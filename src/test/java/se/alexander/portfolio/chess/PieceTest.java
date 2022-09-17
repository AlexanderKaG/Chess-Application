package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    @DisplayName("Check that piece is not captured when created")
    void pieceShouldNotBeCapturedUponCreation() {
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE, false, Square.E1);
        assertFalse(piece.isCaptured());
    }

    @Test
    @DisplayName("Check that piece is captured")
    void pieceShouldBeCaptured() {
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE, true, Square.E1);
        assertTrue(piece.isCaptured());
    }

    @Test
    @DisplayName("Checks that a piece is on e1")
    void pieceShouldBeOnSquareE1() {
        Square square = Square.E1;
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE, false, Square.E1);
        assertEquals(square, piece.getCurrentPosition());
    }

    @Test
    @DisplayName("Piece can move to another square")
    void pieceShouldMoveFromE1ToE2() {
        Square square = Square.E2;
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE, false, Square.E1);
        assertEquals(square, piece.move(Square.E2));
    }

}
