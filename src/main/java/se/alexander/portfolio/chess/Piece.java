package se.alexander.portfolio.chess;

public class Piece {
    private PieceType pieceType;
    private Color color;
    private boolean captured = false;
    private Square currentPosition;

    public Piece(PieceType pieceType, Color color, Square currentPosition) {
        this.pieceType = pieceType;
        this.color = color;
        this.currentPosition = currentPosition;
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

    public Square getCurrentPosition() {
        return currentPosition;
    }

    public Square move(Square newSquare) {
        currentPosition = newSquare;
        return getCurrentPosition();
    }
}
