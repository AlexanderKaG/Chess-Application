package se.alexander.portfolio.chess;

public class Piece {
    private PieceType pieceType;
    private final Color color;
    private boolean captured = false;
    private SquareCoordinate currentSquareCoordinate;

    public Piece(PieceType pieceType, Color color, SquareCoordinate currentSquareCoordinate) {
        this.pieceType = pieceType;
        this.color = color;
        this.currentSquareCoordinate = currentSquareCoordinate;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public Color getColor() {
        return color;
    }

    public boolean isCaptured() {
        return captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public SquareCoordinate getCurrentSquare() {
        return currentSquareCoordinate;
    }

    public SquareCoordinate move(SquareCoordinate newSquareCoordinate) {
        currentSquareCoordinate = newSquareCoordinate;
        return getCurrentSquare();
    }

}
