package se.alexander.portfolio.chess;

public class Piece {
    private PieceType pieceType;
    private PieceColor color;
    private boolean captured;
    private Square currentPosition;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public Piece(PieceType pieceType, PieceColor color) {
        this.pieceType = pieceType;
        this.color = color;
    }

    public Piece(PieceType pieceType, PieceColor color, boolean captured) {
        this.pieceType = pieceType;
        this.color = color;
        this.captured = captured;
    }

    public Piece(PieceType pieceType, PieceColor color, boolean captured, Square currentPosition) {
        this.pieceType = pieceType;
        this.color = color;
        this.captured = captured;
        this.currentPosition = currentPosition;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public PieceColor getColor() {
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
