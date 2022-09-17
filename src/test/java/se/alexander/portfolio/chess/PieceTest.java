package se.alexander.portfolio.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static se.alexander.portfolio.chess.PieceType.*;

public class PieceTest {

    @Test
    @DisplayName("A pawn is a pawn")
    void pawnIsPawn() {
        PieceType pieceType = PAWN;
        Piece piece = new Piece(PAWN);
        assertEquals(pieceType, piece.getPieceType());
    }
    
    @Test
    @DisplayName("A knight is a knight")
    void knightIsKnight() {
        PieceType pieceType = KNIGHT;
        Piece piece = new Piece(KNIGHT);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A bishop is a bishop")
    void bishopIsBishop() {
        PieceType pieceType = BISHOP;
        Piece piece = new Piece(BISHOP);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A rook is a rook")
    void rookIsRook() {
        PieceType pieceType = ROOK;
        Piece piece = new Piece(ROOK);
        assertEquals(pieceType, piece.getPieceType());
    }

    @Test
    @DisplayName("A queen is a queen")
    void queenIsQueen() {
        PieceType pieceType = QUEEN;
        Piece piece = new Piece(QUEEN);
        assertEquals(pieceType, piece.getPieceType());
    }

}
