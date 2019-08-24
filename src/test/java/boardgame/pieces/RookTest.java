package boardgame.pieces;

import boardgame.models.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RookTest
{
    @DisplayName("Test getPlayer() returns Player")
    @Test
    void testGetLocationReturnsLocationCoordinates() {
        Rook rook = new Rook(Player.WHITE);
        Assertions.assertEquals(Player.WHITE, rook.getPlayer());
    }

}
