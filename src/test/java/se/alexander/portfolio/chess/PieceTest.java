package se.alexander.portfolio.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static se.alexander.portfolio.chess.PieceType.KNIGHT;
import static se.alexander.portfolio.chess.PieceType.PAWN;

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

}
