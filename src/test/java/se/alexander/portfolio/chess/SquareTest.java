package se.alexander.portfolio.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    @DisplayName("Checks that the coordinate of a square is E1")
    void coordinateOfSquareEqualsE1() {
        SquareCoordinate coordinate = SquareCoordinate.E1;
        Square square = new Square(SquareCoordinate.E1);
        assertEquals(coordinate, square.getCoordinate());
    }

    @Test
    @DisplayName("Checks that E2 is black")
    void colorOfE2EqualsBlack() {
        Color color = Color.WHITE;
        Square square = new Square(SquareCoordinate.E2);
        assertEquals(color, square.getCoordinate().getColor());
    }

}
