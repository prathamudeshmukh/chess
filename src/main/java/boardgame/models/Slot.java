package boardgame.models;

import boardgame.pieces.Piece;

public class Slot
{
    private Coordinate location;
    private Piece piece;

    public Slot(Coordinate location, Piece piece) {
        this.location = location;
        this.piece = piece;
    }

    public Coordinate getLocation()
    {
        return location;
    }

    public Piece getPiece()
    {
        return piece;
    }
}
