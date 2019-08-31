package boardgame;

import boardgame.exceptions.OutOfBoardBoundsException;
import boardgame.models.Coordinate;
import boardgame.models.Player;
import boardgame.models.Slot;
import boardgame.pieces.Rook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class GameTest
{
    @DisplayName("Test if getAllowedMoves() returns Moves for Slot")
    @Test
    void testGetAllowedMovesShouldReturnMovesForSlot() {
        Game game = new Game();
        Coordinate coordinate = new Coordinate(1, 5);
        Rook rook = new Rook(Player.WHITE);
        try
        {
            assertNull(game.getAllowedMoves(coordinate));
        } catch (OutOfBoardBoundsException e)
        {
            e.printStackTrace();
        }
    }

}
