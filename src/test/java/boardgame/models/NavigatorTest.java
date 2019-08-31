package boardgame.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NavigatorTest
{
    private static final Coordinate BOUNDARY = new Coordinate(7,7);;

    @DisplayName("Test next() returns true for NORTH direction")
    @Test
    void testNextReturnsTrueForNorthDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.NORTH, BOUNDARY);
        assertTrue(navigator.next());
    }

    @DisplayName("Test next() sets valid next coordinate for NORTH direction")
    @Test
    void testNextSetsValidNextCoordinatesForNorthDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.NORTH, BOUNDARY);
        navigator.next();
        Coordinate expectedCurrentLocation = new Coordinate(4,3);
        assertEquals(expectedCurrentLocation, navigator.getCurrentLocation());
    }

    
}