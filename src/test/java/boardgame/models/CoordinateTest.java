package boardgame.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

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
}
