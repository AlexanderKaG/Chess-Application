package se.alexander.portfolio.chess;

public class Square {
    private final SquareCoordinate coordinate;
    private final Color color;

    public Square(SquareCoordinate coordinate, Color color) {
        this.coordinate = coordinate;
        this.color = color;
    }

    public SquareCoordinate getCoordinate() {
        return coordinate;
    }

    public Color getColor() {
        return color;
    }
}
