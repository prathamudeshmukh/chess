package boardgame;

import boardgame.board.ChessBoard;
import boardgame.exceptions.OutOfBoardBoundsException;
import boardgame.models.Coordinate;
import boardgame.models.Moves;
import boardgame.models.Slot;

public class Game
{
    private ChessBoard board;

    public Game() {
        board = new ChessBoard();
    }

    public Moves getAllowedMoves(Coordinate coordinate) throws OutOfBoardBoundsException
    {
        Slot slot = board.get(coordinate);
        return null;
    }
}
