package se.alexander.portfolio.chess;

public class Square {
    private final SquareCoordinate coordinate;

    public Square(SquareCoordinate coordinate) {
        this.coordinate = coordinate;
    }

    public SquareCoordinate getCoordinate() {
        return coordinate;
    }

    public Color getColor() {
        return getCoordinate().getColor();
    }
}
