package boardgame.board;

import boardgame.exceptions.OutOfBoardBoundsException;
import boardgame.models.Coordinate;
import boardgame.models.Slot;
import boardgame.pieces.Piece;

public interface Board
{
    int MAX_COLUMN = 8;
    int MAX_ROW = 8;

    Slot get(Coordinate coordinate) throws OutOfBoardBoundsException;

    void setPiece(Coordinate coordinate, Piece piece) throws OutOfBoardBoundsException;
}
