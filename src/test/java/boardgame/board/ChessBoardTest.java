package boardgame.board;

import boardgame.exceptions.OutOfBoardBoundsException;
import boardgame.models.Coordinate;
import boardgame.models.Player;
import boardgame.pieces.Rook;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertNull;


class ChessBoardTest
{
    @DisplayName("Test if getSlot returns slot for coordinate")
    @Test
    void testIfGetSlotReturnsSlotForCoordinate() {
        ChessBoard board = new ChessBoard();
        Coordinate coordinate = new Coordinate(1, 2);
        try
        {
            assertNull(board.get(coordinate));
        } catch (OutOfBoardBoundsException e)
        {
            e.printStackTrace();
        }
    }

    @DisplayName("Test if setPiece() slot for specific coordinate")
    @Test
    void testIfSetSlotForCoordinate() {
        ChessBoard board = new ChessBoard();
        Coordinate coordinate = new Coordinate(1, 2);
        Rook rook = new Rook(Player.WHITE);
        try
        {
            board.setPiece(coordinate, rook);
            Assert.assertEquals(board.get(coordinate).getPiece(), rook);
        } catch (OutOfBoardBoundsException e)
        {
            e.printStackTrace();
        }
    }

    @DisplayName("Test if setPiece() throws exception for invalid column in coordinate")
    @Test
    void testIfSetPieceThrowsExceptionForInvalidColumnInCoordinate() {
        ChessBoard board = new ChessBoard();
        Coordinate coordinate = new Coordinate(10, 2);
        Rook rook = new Rook(Player.WHITE);
        Throwable exception = Assertions.assertThrows(OutOfBoardBoundsException.class, () -> {
            board.setPiece(coordinate, rook);
        });
        Assertions.assertEquals(OutOfBoardBoundsException.INVALID_COORDINATES_COLUMN_INDEX_MESSAGE, exception.getMessage());
    }

    @DisplayName("Test if setPiece() throws exception for invalid row in coordinate")
    @Test
    void testIfSetPieceThrowsExceptionForInvalidRowInCoordinate() {
        ChessBoard board = new ChessBoard();
        Coordinate coordinate = new Coordinate(6, 8);
        Rook rook = new Rook(Player.WHITE);
        Throwable exception = Assertions.assertThrows(OutOfBoardBoundsException.class, () -> {
            board.setPiece(coordinate, rook);
        });
        Assertions.assertEquals(OutOfBoardBoundsException.INVALID_COORDINATES_ROW_INDEX_MESSAGE, exception.getMessage());
    }
}
