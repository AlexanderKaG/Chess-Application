package se.alexander.portfolio.chess;

public class Piece {
    private PieceType pieceType;
    private PieceColor color;


    private boolean captured;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public Piece(PieceType pieceType, PieceColor pieceColor) {
        this.pieceType = pieceType;
        this.color = pieceColor;
    }

    public Piece(PieceType pieceType, PieceColor color, boolean captured) {
        this.pieceType = pieceType;
        this.color = color;
        this.captured = captured;
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
}
