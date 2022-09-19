package se.alexander.portfolio.chess;

public class Piece {
    private final PieceType pieceType;
    private final Color color;
    private boolean captured = false;

    public Piece(PieceType pieceType, Color color) {
        this.pieceType = pieceType;
        this.color = color;
    }

    public boolean isCaptured() {
        return captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

}
