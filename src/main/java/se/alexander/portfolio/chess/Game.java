package se.alexander.portfolio.chess;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private final Map<String, Piece> whitePieces;
    private final Map<String, Piece> blackPieces;

    public Game() {
        this.whitePieces = createWhitePieces();
        this.blackPieces = createBlackPieces();
    }

    private Map<String, Piece> createBlackPieces() {
        Map<String, Piece> darkPieces = new HashMap<>();
        Piece aPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("aPawn", aPawn);
        Piece bPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("bPawn", bPawn);
        Piece cPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("cPawn", cPawn);
        Piece dPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("dPawn", dPawn);
        Piece ePawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("ePawn", ePawn);
        Piece fPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("fPawn", fPawn);
        Piece gPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("gPawn", gPawn);
        Piece hPawn = new Piece(PieceType.PAWN, Color.BLACK);
        darkPieces.put("hPawn", hPawn);

        Piece aRook = new Piece(PieceType.ROOK, Color.BLACK);
        darkPieces.put("aRook", aRook);
        Piece hRook = new Piece(PieceType.ROOK, Color.BLACK);
        darkPieces.put("hRook", hRook);

        Piece bKnight = new Piece(PieceType.KNIGHT, Color.BLACK);
        darkPieces.put("bKnight", bKnight);
        Piece gKnight = new Piece(PieceType.KNIGHT, Color.BLACK);
        darkPieces.put("gKnight", gKnight);

        Piece darkSquaredBishop = new Piece(PieceType.BISHOP, Color.BLACK);
        darkPieces.put("darkSquaredBishop", darkSquaredBishop);
        Piece lightSquaredBishop = new Piece(PieceType.BISHOP, Color.BLACK);
        darkPieces.put("lightSquaredBishop", lightSquaredBishop);

        Piece queen = new Piece(PieceType.QUEEN, Color.BLACK);
        darkPieces.put("queen", queen);

        Piece king = new Piece(PieceType.KING, Color.BLACK);
        darkPieces.put("king", king);

        return darkPieces;
    }

    private Map<String, Piece> createWhitePieces() {
        Map<String, Piece> lightPieces = new HashMap<>();
        Piece aPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("aPawn", aPawn);
        Piece bPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("bPawn", bPawn);
        Piece cPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("cPawn", cPawn);
        Piece dPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("dPawn", dPawn);
        Piece ePawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("ePawn", ePawn);
        Piece fPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("fPawn", fPawn);
        Piece gPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("gPawn", gPawn);
        Piece hPawn = new Piece(PieceType.PAWN, Color.WHITE);
        lightPieces.put("hPawn", hPawn);

        Piece aRook = new Piece(PieceType.ROOK, Color.WHITE);
        lightPieces.put("aRook", aRook);
        Piece hRook = new Piece(PieceType.ROOK, Color.WHITE);
        lightPieces.put("hRook", hRook);

        Piece bKnight = new Piece(PieceType.KNIGHT, Color.WHITE);
        lightPieces.put("bKnight", bKnight);
        Piece gKnight = new Piece(PieceType.KNIGHT, Color.WHITE);
        lightPieces.put("gKnight", gKnight);

        Piece darkSquaredBishop = new Piece(PieceType.BISHOP, Color.WHITE);
        lightPieces.put("darkSquaredBishop", darkSquaredBishop);
        Piece lightSquaredBishop = new Piece(PieceType.BISHOP, Color.WHITE);
        lightPieces.put("lightSquaredBishop", lightSquaredBishop);

        Piece queen = new Piece(PieceType.QUEEN, Color.WHITE);
        lightPieces.put("queen", queen);

        Piece king = new Piece(PieceType.KING, Color.WHITE);
        lightPieces.put("king", king);

        return lightPieces;
    }

    public Map<String, Piece> getWhitePieces() {
        return this.whitePieces;
    }

    public Map<String, Piece> getBlackPieces() {
        return this.blackPieces;
    }
}
