package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    @DisplayName("Check that piece is not captured when created")
    void pieceShouldNotBeCapturedUponCreation() {
        Piece piece = new Piece(PieceType.KING, Color.WHITE, Square.E1);
        assertFalse(piece.isCaptured());
    }

    @Test
    @DisplayName("Checks that a piece has been captured")
    void pieceHasBeenCaptured() {
        Piece piece = new Piece(PieceType.KING, Color.WHITE, Square.E1);
        piece.setCaptured(true);
        assertTrue(piece.isCaptured());
    }

    @Test
    @DisplayName("Checks that a piece is on e1")
    void pieceShouldBeOnSquareE1() {
        Square square = Square.E1;
        Piece piece = new Piece(PieceType.KING, Color.WHITE, Square.E1);
        assertEquals(square, piece.getCurrentSquare());
    }

    @Test
    @DisplayName("Piece can move to another square")
    void pieceShouldMoveFromE1ToE2() {
        Square square = Square.E2;
        Piece piece = new Piece(PieceType.KING, Color.WHITE, Square.E1);
        assertEquals(square, piece.move(Square.E2));
    }

}
