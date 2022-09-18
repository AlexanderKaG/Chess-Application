package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCoordinateTest {

    @Test
    @DisplayName("Checks that A1 is black")
    void coordinateA1EqualsColorBlack() {
        Color color = Color.BLACK;
        assertEquals(color, SquareCoordinate.A1.getColor());
    }

}
