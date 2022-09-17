package se.alexander.portfolio.chess;

public class Piece {
    private PieceType pieceType;
    private final Color color;
    private boolean captured = false;
    private Square currentSquare;

    public Piece(PieceType pieceType, Color color, Square currentSquare) {
        this.pieceType = pieceType;
        this.color = color;
        this.currentSquare = currentSquare;
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

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public Square move(Square newSquare) {
        currentSquare = newSquare;
        return getCurrentSquare();
    }

}
