package boardgame.board;

import boardgame.exceptions.OutOfBoardBoundsException;
import boardgame.models.*;
import boardgame.pieces.Piece;

public class ChessBoard implements Board
{
    private Slot[][] board;

    public ChessBoard() {
        board = new Slot[MAX_ROW][MAX_COLUMN];
    }

    public Slot get(Coordinate coordinate) throws OutOfBoardBoundsException
    {
        validateCoordinate(coordinate);
        return board[coordinate.getRow()][coordinate.getColumn()];
    }

    public void setPiece(Coordinate coordinate, Piece piece) throws OutOfBoardBoundsException
    {
        validateCoordinate(coordinate);
        Slot slot = new Slot(coordinate, piece);
        board[coordinate.getRow()][coordinate.getColumn()] = slot;
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
