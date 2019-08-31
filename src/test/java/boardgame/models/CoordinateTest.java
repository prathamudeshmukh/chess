package boardgame.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CoordinateTest
{
    @DisplayName("Test getColumn() returns column index")
    @Test
    void testGetColumnReturnsColumnIndex() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertEquals(1, coordinate.getColumn());
    }

    @DisplayName("Test getRow() returns row index")
    @Test
    void testGetRowReturnsRowIndex() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertEquals(2, coordinate.getRow());
    }

    @DisplayName("Test setRow() sets new row index")
    @Test
    void testSetRowSetsNewRowIndex() {
        Coordinate coordinate = new Coordinate(1, 2);
        coordinate.setRow(3);
        assertEquals(3, coordinate.getRow());
    }

    @DisplayName("Test setColumn() sets new column index")
    @Test
    void testSetColumnSetsNewColumnIndex() {
        Coordinate coordinate = new Coordinate(1, 2);
        coordinate.setColumn(3);
        assertEquals(3, coordinate.getColumn());
    }

    @DisplayName("Test equals() returns true if same instance passed")
    @Test
    void testEqualsReturnsTrueIfSameInstancePassed() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertTrue("Same instance should be equal", coordinate.equals(coordinate));
    }

    @DisplayName("Test equals() returns false if null passed")
    @Test
    void testEqualsReturnsFalseIfNullPassed() {
        Coordinate coordinate = new Coordinate(1, 2);
        assertFalse("Null should not be equal", coordinate.equals(null));
    }

    @DisplayName("Test equals() returns false if different instance passed")
    @Test
    void testEqualsReturnsFalseIfDifferentInstancePassed() {
        Coordinate coordinate = new Coordinate(1, 2);
        String testString = new String("test");
        assertFalse("Different instance type should not be equal", coordinate.equals(testString));
    }

    @DisplayName("Test equals() returns true if same coordinates passed")
    @Test
    void testEqualsReturnsTrueIfSameCoordinatesPassed() {
        Coordinate coordinate = new Coordinate(1, 2);
        Coordinate otherCoordinate = new Coordinate(1, 2);
        assertTrue("Same coordinate should be equal", coordinate.equals(otherCoordinate));
    }

    @DisplayName("Test equals() returns false if different coordinates passed")
    @Test
    void testEqualsReturnsFalseIfDifferentCoordinatesPassed() {
        Coordinate coordinate = new Coordinate(1, 2);
        Coordinate otherCoordinate = new Coordinate(1, 3);
        assertFalse("Same coordinate should not be equal", coordinate.equals(otherCoordinate));
    }

    @DisplayName("Test equals() returns false if different column coordinates passed")
    @Test
    void testEqualsReturnsFalseIfDifferentColumnCoordinatesPassed() {
        Coordinate coordinate = new Coordinate(1, 2);
        Coordinate otherCoordinate = new Coordinate(3, 2);
        assertFalse("Same coordinate should not be equal", coordinate.equals(otherCoordinate));
    }
}
