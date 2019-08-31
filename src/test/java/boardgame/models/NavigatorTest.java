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

    @DisplayName("Test next() returns true for NORTH_EAST direction")
    @Test
    void testNextReturnsTrueForNorthEastDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.NORTH_EAST, BOUNDARY);
        assertTrue(navigator.next());
    }

    @DisplayName("Test next() returns true for SOUTH_WEST direction")
    @Test
    void testNextReturnsTrueForSouthWestDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.SOUTH_WEST, BOUNDARY);
        assertTrue(navigator.next());
    }

    @DisplayName("Test next() returns true for SOUTH direction")
    @Test
    void testNextReturnsTrueForSouthDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.SOUTH, BOUNDARY);
        assertTrue(navigator.next());
    }

    @DisplayName("Test next() returns true for EAST direction")
    @Test
    void testNextReturnsTrueForSouthEastDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.EAST, BOUNDARY);
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

    @DisplayName("Test next() sets valid next coordinate for NORTH_EAST direction")
    @Test
    void testNextSetsValidNextCoordinatesForNorthEastDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.NORTH_EAST, BOUNDARY);
        navigator.next();
        Coordinate expectedCurrentLocation = new Coordinate(5,3);
        assertEquals(expectedCurrentLocation, navigator.getCurrentLocation());
    }

    @DisplayName("Test next() sets valid next coordinate for SOUTH_WEST direction")
    @Test
    void testNextSetsValidNextCoordinatesForSouthWestDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.SOUTH_WEST, BOUNDARY);
        navigator.next();
        Coordinate expectedCurrentLocation = new Coordinate(3,5);
        assertEquals(expectedCurrentLocation, navigator.getCurrentLocation());
    }

    @DisplayName("Test next() sets valid next coordinate for SOUTH direction")
    @Test
    void testNextSetsValidNextCoordinatesForSouthDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.SOUTH, BOUNDARY);
        navigator.next();
        Coordinate expectedCurrentLocation = new Coordinate(4,5);
        assertEquals(expectedCurrentLocation, navigator.getCurrentLocation());
    }

    @DisplayName("Test next() sets valid next coordinate for EAST direction")
    @Test
    void testNextSetsValidNextCoordinatesForEastDirection()
    {
        Coordinate currentLocation = new Coordinate(4,4);
        Navigator navigator = new Navigator(currentLocation, Direction.EAST, BOUNDARY);
        navigator.next();
        Coordinate expectedCurrentLocation = new Coordinate(5,4);
        assertEquals(expectedCurrentLocation, navigator.getCurrentLocation());
    }

    @DisplayName("Test next() returns false when boundary is reached for NORTH direction")
    @Test
    void testNextReturnsFalseWhenBoundaryIsReachedForNorthDirection()
    {
        Coordinate currentLocation = new Coordinate(4,0);
        Navigator navigator = new Navigator(currentLocation, Direction.NORTH, BOUNDARY);
        assertFalse(navigator.next());
        assertEquals(currentLocation, navigator.getCurrentLocation(), "Current Location is not matching");
    }

    @DisplayName("Test next() returns false when boundary is reached for NORTH_EAST direction")
    @Test
    void testNextReturnsFalseWhenBoundaryIsReachedForNorthEastDirection()
    {
        Coordinate currentLocation = new Coordinate(7,1);
        Navigator navigator = new Navigator(currentLocation, Direction.NORTH_EAST, BOUNDARY);
        assertFalse(navigator.next());
        assertEquals(currentLocation, navigator.getCurrentLocation(), "Current Location is not matching");
    }

    @DisplayName("Test next() returns false when boundary is reached for SOUTH_WEST direction")
    @Test
    void testNextReturnsFalseWhenBoundaryIsReachedForSouthWestDirection()
    {
        Coordinate currentLocation = new Coordinate(1,7);
        Navigator navigator = new Navigator(currentLocation, Direction.SOUTH_WEST, BOUNDARY);
        assertFalse(navigator.next());
        assertEquals(currentLocation, navigator.getCurrentLocation(), "Current Location is not matching");
    }

    @DisplayName("Test next() returns false when boundary is reached for SOUTH direction")
    @Test
    void testNextReturnsFalseWhenBoundaryIsReachedForSouthDirection()
    {
        Coordinate currentLocation = new Coordinate(1,7);
        Navigator navigator = new Navigator(currentLocation, Direction.SOUTH, BOUNDARY);
        assertFalse(navigator.next());
        assertEquals(currentLocation, navigator.getCurrentLocation(), "Current Location is not matching");
    }

    @DisplayName("Test next() returns false when boundary is reached for WEST direction")
    @Test
    void testNextReturnsFalseWhenBoundaryIsReachedForWestDirection()
    {
        Coordinate currentLocation = new Coordinate(0,4);
        Navigator navigator = new Navigator(currentLocation, Direction.WEST, BOUNDARY);
        assertFalse(navigator.next());
        assertEquals(currentLocation, navigator.getCurrentLocation(), "Current Location is not matching");
    }

    @DisplayName("Test next() returns false for invalid direction")
    @Test
    void testNextReturnsFalseForInvalidDirection()
    {
        Coordinate currentLocation = new Coordinate(4,0);
        Navigator navigator = new Navigator(currentLocation, null, BOUNDARY);
        assertFalse(navigator.next());
    }
}