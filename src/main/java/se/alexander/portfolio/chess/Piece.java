package se.alexander.portfolio.chess;

public class Piece {
    private PieceType pieceType;
    private PieceColor color;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public Piece(PieceType pieceType, PieceColor pieceColor) {
        this.pieceType = pieceType;
        this.color = pieceColor;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public PieceColor getColor() {
        return color;
    }
}
