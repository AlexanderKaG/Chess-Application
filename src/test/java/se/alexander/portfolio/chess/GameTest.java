package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {

    @Test
    @DisplayName("Two games are not the same")
    void twoGamesShouldNotBeTheSame() {
        Game game1 = new Game();
        Game game2 = new Game();
        assertNotSame(game1, game2);
    }

    @Test
    @DisplayName("Checks that 16 white pieces are created when game is created.")
    void createTheWhitePieces() {
        Game game = new Game();
        assertTrue(game.getWhitePieces().size() == 16);
    }

}
