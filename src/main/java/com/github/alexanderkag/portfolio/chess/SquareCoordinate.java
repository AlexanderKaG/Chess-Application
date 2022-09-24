package com.github.alexanderkag.portfolio.chess;

public enum SquareCoordinate {

    A1(Color.BLACK), B1(Color.WHITE), C1(Color.BLACK), D1(Color.WHITE), E1(Color.BLACK), F1(Color.WHITE), G1(Color.BLACK), H1(Color.WHITE),
    A2(Color.WHITE), B2(Color.BLACK), C2(Color.WHITE), D2(Color.BLACK), E2(Color.WHITE), F2(Color.BLACK), G2(Color.WHITE), H2(Color.BLACK),
    A3(Color.BLACK), B3(Color.WHITE), C3(Color.BLACK), D3(Color.WHITE), E3(Color.BLACK), F3(Color.WHITE), G3(Color.BLACK), H3(Color.WHITE),
    A4(Color.WHITE), B4(Color.BLACK), C4(Color.WHITE), D4(Color.BLACK), E4(Color.WHITE), F4(Color.BLACK), G4(Color.WHITE), H4(Color.BLACK),
    A5(Color.BLACK), B5(Color.WHITE), C5(Color.BLACK), D5(Color.WHITE), E5(Color.BLACK), F5(Color.WHITE), G5(Color.BLACK), H5(Color.WHITE),
    A6(Color.WHITE), B6(Color.BLACK), C6(Color.WHITE), D6(Color.BLACK), E6(Color.WHITE), F6(Color.BLACK), G6(Color.WHITE), H6(Color.BLACK),
    A7(Color.BLACK), B7(Color.WHITE), C7(Color.BLACK), D7(Color.WHITE), E7(Color.BLACK), F7(Color.WHITE), G7(Color.BLACK), H7(Color.WHITE),
    A8(Color.WHITE), B8(Color.BLACK), C8(Color.WHITE), D8(Color.BLACK), E8(Color.WHITE), F8(Color.BLACK), G8(Color.WHITE), H8(Color.BLACK);

    private final Color color;

    SquareCoordinate(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
