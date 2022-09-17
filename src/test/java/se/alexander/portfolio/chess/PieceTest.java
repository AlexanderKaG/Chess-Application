package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    @DisplayName("Check that piece is not captured when created")
    void pieceShouldNotBeCapturedUponCreation() {
        Piece piece = new Piece(PieceType.KING, Color.WHITE, new Square(SquareCoordinate.E1));
        assertFalse(piece.isCaptured());
    }

    @Test
    @DisplayName("Checks that a piece has been captured")
    void pieceHasBeenCaptured() {
        Piece piece = new Piece(PieceType.KING, Color.WHITE, new Square(SquareCoordinate.E1));
        piece.setCaptured(true);
        assertTrue(piece.isCaptured());
    }

    @Test
    @DisplayName("Checks that a piece is on e1")
    void pieceShouldBeOnSquareE1() {
        SquareCoordinate squareCoordinate = SquareCoordinate.E1;
        Square square = new Square(SquareCoordinate.E1);
        Piece piece = new Piece(PieceType.KING, Color.WHITE, square);
        assertEquals(squareCoordinate, piece.getCurrentSquareCoordinate());
    }

    @Test
    @DisplayName("Piece can move to another square")
    void pieceShouldMoveFromE1ToE2() {
        SquareCoordinate squareCoordinate = SquareCoordinate.E2;
        Piece piece = new Piece(PieceType.KING, Color.WHITE, new Square(SquareCoordinate.E1));
        assertEquals(squareCoordinate, piece.move(new Square(SquareCoordinate.E2)));
    }

}
