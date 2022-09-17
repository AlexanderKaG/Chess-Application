package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    @DisplayName("A pawn is a pawn")
    void pawnIsPawn() {
        PieceType pieceType = PieceType.PAWN;
        Piece piece = new Piece(PieceType.PAWN, PieceColor.WHITE, false, Square.A1);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A knight is a knight")
    void knightIsKnight() {
        PieceType pieceType = PieceType.KNIGHT;
        Piece piece = new Piece(PieceType.KNIGHT, PieceColor.WHITE, false, Square.B1);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A bishop is a bishop")
    void bishopIsBishop() {
        PieceType pieceType = PieceType.BISHOP;
        Piece piece = new Piece(PieceType.BISHOP, PieceColor.WHITE, false, Square.C1);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A rook is a rook")
    void rookIsRook() {
        PieceType pieceType = PieceType.ROOK;
        Piece piece = new Piece(PieceType.ROOK, PieceColor.WHITE, false, Square.A1);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A queen is a queen")
    void queenIsQueen() {
        PieceType pieceType = PieceType.QUEEN;
        Piece piece = new Piece(PieceType.QUEEN, PieceColor.WHITE, false, Square.D1);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A king is a king")
    void kingIsKing() {
        PieceType pieceType = PieceType.KING;
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE, false, Square.E1);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("Piece is white")
    void pieceShouldBeWhite() {
        PieceColor pieceColor = PieceColor.WHITE;
        Piece piece = new Piece(PieceType.KING, PieceColor.BLACK, false, Square.E8);
        assertEquals(pieceColor, piece.getColor());
    }

    @Test
    @DisplayName("Piece is black")
    void pieceShouldBeBlack() {
        PieceColor pieceColor = PieceColor.BLACK;
        Piece piece = new Piece(PieceType.KING, PieceColor.BLACK, false, Square.E8);
        assertEquals(pieceColor, piece.getColor());
    }

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
