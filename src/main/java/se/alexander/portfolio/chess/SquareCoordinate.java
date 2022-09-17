package se.alexander.portfolio.chess;

import static se.alexander.portfolio.chess.Color.BLACK;
import static se.alexander.portfolio.chess.Color.WHITE;

public enum SquareCoordinate {

    A1(BLACK), B1(WHITE), C1(BLACK), D1(WHITE), E1(BLACK), F1(WHITE), G1(BLACK), H1(WHITE),
    A2(WHITE), B2(BLACK), C2(WHITE), D2(BLACK), E2(WHITE), F2(BLACK), G2(WHITE), H2(BLACK),
    A3(BLACK), B3(WHITE), C3(BLACK), D3(WHITE), E3(BLACK), F3(WHITE), G3(BLACK), H3(WHITE),
    A4(WHITE), B4(BLACK), C4(WHITE), D4(BLACK), E4(WHITE), F4(BLACK), G4(WHITE), H4(BLACK),
    A5(BLACK), B5(WHITE), C5(BLACK), D5(WHITE), E5(BLACK), F5(WHITE), G5(BLACK), H5(WHITE),
    A6(WHITE), B6(BLACK), C6(WHITE), D6(BLACK), E6(WHITE), F6(BLACK), G6(WHITE), H6(BLACK),
    A7(BLACK), B7(WHITE), C7(BLACK), D7(WHITE), E7(BLACK), F7(WHITE), G7(BLACK), H7(WHITE),
    A8(WHITE), B8(BLACK), C8(WHITE), D8(BLACK), E8(WHITE), F8(BLACK), G8(WHITE), H8(BLACK);

    private final Color color;

    SquareCoordinate(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
