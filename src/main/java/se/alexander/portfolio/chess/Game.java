package se.alexander.portfolio.chess;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private Map<String, Piece> whitePieces;

    public Game() {
        this.whitePieces = createWhitePieces();
    }

    private Map<String, Piece> createWhitePieces() {
        Map<String, Piece> whitePieces = new HashMap<>();
        Piece aPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("aPawn", aPawn);
        Piece bPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("bPawn", bPawn);
        Piece cPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("cPawn", cPawn);
        Piece dPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("dPawn", dPawn);
        Piece ePawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("ePawn", ePawn);
        Piece fPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("fPawn", fPawn);
        Piece gPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("gPawn", gPawn);
        Piece hPawn = new Piece(PieceType.PAWN, Color.WHITE);
        whitePieces.put("hPawn", hPawn);

        Piece aRook = new Piece(PieceType.ROOK, Color.WHITE);
        whitePieces.put("aRook", aRook);
        Piece hRook = new Piece(PieceType.ROOK, Color.WHITE);
        whitePieces.put("hRook", hRook);

        Piece bKnight = new Piece(PieceType.KNIGHT, Color.WHITE);
        whitePieces.put("bKnight", bKnight);
        Piece gKnight = new Piece(PieceType.KNIGHT, Color.WHITE);
        whitePieces.put("gKnight", gKnight);

        Piece darkSquaredBishop = new Piece(PieceType.BISHOP, Color.WHITE);
        whitePieces.put("darkSquaredBishop", darkSquaredBishop);
        Piece lightSquaredBishop = new Piece(PieceType.BISHOP, Color.WHITE);
        whitePieces.put("lightSquaredBishop", lightSquaredBishop);

        Piece queen = new Piece(PieceType.QUEEN, Color.WHITE);
        whitePieces.put("queen", queen);

        Piece king = new Piece(PieceType.KING, Color.WHITE);
        whitePieces.put("king", king);

        return whitePieces;
    }

    public Map<String, Piece> getWhitePieces() {
        return this.whitePieces;
    }
}
