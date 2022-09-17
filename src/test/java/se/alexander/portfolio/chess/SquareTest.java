package se.alexander.portfolio.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void coordinateOfSquareEqualsE1() {
        SquareCoordinate coordinate = SquareCoordinate.E1;
        Square square = new Square(SquareCoordinate.E1, Color.WHITE);
        assertEquals(coordinate, square.getCoordinate());
    }

    @Test
    void colorOfE2EqualsBlack() {
        Color color = Color.BLACK;
        Square square = new Square(SquareCoordinate.E2, Color.BLACK);
        assertEquals(color, square.getColor());
    }

}
