package com.github.alexanderkag.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @DisplayName("Two games are not the same")
    void twoGamesShouldNotBeTheSame() {
        Game game1 = new Game();
        Game game2 = new Game();
        assertNotSame(game1, game2);
    }

    @Test
    @DisplayName("Checks that there are 16 white pieces in a game.")
    void amountOfWhitePiecesShouldBe16() {
        int amountOfPieces = 16;
        Game game = new Game();
        assertEquals(amountOfPieces, game.getWhitePieces().size());
    }

    @Test
    @DisplayName("Checks that there are 16 black pieces in a game.")
    void amountOfBlackPiecesShouldBe16() {
        int amountOfPieces = 16;
        Game game = new Game();
        assertEquals(amountOfPieces, game.getBlackPieces().size());
    }

}
