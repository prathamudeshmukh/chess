package boardgame.models;
import boardgame.pieces.Rook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SlotTest
{
    @DisplayName("Test getLocation() returns location coordinates")
    @Test
    void testGetLocationReturnsLocationCoordinates() {
        Coordinate coordinate = new Coordinate(1, 5);
        Rook rook = new Rook(Player.WHITE);
        Slot slot = new Slot(coordinate, rook);
        Assertions.assertEquals(coordinate, slot.getLocation());
    }

    @DisplayName("Test getPiece() returns Piece")
    @Test
    void testGetPieceReturnsPiece() {
        Coordinate coordinate = new Coordinate(1, 5);
        Rook rook = new Rook(Player.WHITE);
        Slot slot = new Slot(coordinate, rook);
        Assertions.assertEquals(rook, slot.getPiece());
    }
}
