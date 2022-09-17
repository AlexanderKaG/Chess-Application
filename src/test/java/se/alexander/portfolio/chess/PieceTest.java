package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PieceTest {

    @Test
    @DisplayName("A pawn is a pawn")
    void pawnIsPawn() {
        PieceType pieceType = PieceType.PAWN;
        Piece piece = new Piece(PieceType.PAWN);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A knight is a knight")
    void knightIsKnight() {
        PieceType pieceType = PieceType.KNIGHT;
        Piece piece = new Piece(PieceType.KNIGHT);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A bishop is a bishop")
    void bishopIsBishop() {
        PieceType pieceType = PieceType.BISHOP;
        Piece piece = new Piece(PieceType.BISHOP);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A rook is a rook")
    void rookIsRook() {
        PieceType pieceType = PieceType.ROOK;
        Piece piece = new Piece(PieceType.ROOK);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A queen is a queen")
    void queenIsQueen() {
        PieceType pieceType = PieceType.QUEEN;
        Piece piece = new Piece(PieceType.QUEEN);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A king is a king")
    void kingIsKing() {
        PieceType pieceType = PieceType.KING;
        Piece piece = new Piece(PieceType.KING);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("Piece is white")
    void pieceShouldBeWhite() {
        PieceColor pieceColor = PieceColor.WHITE;
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE);
        assertEquals(pieceColor, piece.getColor());
    }

    @Test
    @DisplayName("Piece is black")
    void pieceShouldBeBlack() {
        PieceColor pieceColor = PieceColor.BLACK;
        Piece piece = new Piece(PieceType.KING, PieceColor.BLACK);
        assertEquals(pieceColor, piece.getColor());
    }

    @Test
    @DisplayName("Check that piece hasn't been captured")
    void pieceShouldNotBeCaptured() {
        Piece piece = new Piece(PieceType.KING, PieceColor.WHITE, false);
        assertTrue(piece.isCaptured() == false);
    }

}
