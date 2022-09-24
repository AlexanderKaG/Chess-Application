package com.github.alexanderkag.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    @DisplayName("Check that piece is not captured when created")
    void pieceShouldNotBeCapturedUponCreation() {
        Piece piece = new Piece(PieceType.KING, Color.WHITE);
        assertFalse(piece.isCaptured());
    }

    @Test
    @DisplayName("Checks that a piece has been captured")
    void pieceHasBeenCaptured() {
        Piece piece = new Piece(PieceType.KING, Color.WHITE);
        piece.setCaptured(true);
        assertTrue(piece.isCaptured());
    }

}
