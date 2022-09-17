package se.alexander.portfolio.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static se.alexander.portfolio.chess.PieceType.PAWN;

public class PieceTest {



    @Test
    @DisplayName("A pawn is a pawn")
    void pawnIsPawn() {
        Piece piece = new Piece(PAWN);
        PieceType pieceType = PAWN;
        assertEquals(pieceType, piece.getPieceType());
    }

}
