package boardgame.board;

import boardgame.exceptions.OutOfBoardBoundsException;
import boardgame.models.Coordinate;
import boardgame.models.Slot;
import boardgame.pieces.Piece;

import java.util.HashMap;

public class ChessBoard2 implements Board
{
    HashMap<Coordinate, Slot> allPieces = new HashMap<>();
    @Override
    public Slot get(Coordinate coordinate) throws OutOfBoardBoundsException
    {
        validateCoordinate(coordinate);
        return allPieces.get(coordinate);
    }

    @Override
    public void setPiece(Coordinate coordinate, Piece piece) throws OutOfBoardBoundsException
    {
        validateCoordinate(coordinate);
        Slot slot = new Slot(coordinate, piece);
        allPieces.put(coordinate, slot);
    }

    private void validateCoordinate(Coordinate coordinate) throws OutOfBoardBoundsException
    {
        if (coordinate.getRow() >= MAX_ROW || coordinate.getColumn() >= MAX_COLUMN) {
            String message = OutOfBoardBoundsException.INVALID_COORDINATES_COLUMN_INDEX_MESSAGE;
            if (coordinate.getRow() >= MAX_ROW) {
                message = OutOfBoardBoundsException.INVALID_COORDINATES_ROW_INDEX_MESSAGE;
            }
            throw new OutOfBoardBoundsException(message);
        }
    }
}
