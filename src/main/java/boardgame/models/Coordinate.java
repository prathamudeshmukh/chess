package boardgame.models;

import java.util.Objects;

public class Coordinate
{
    private int column;
    private int row;

    public Coordinate(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn()
    {
        return column;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(final Object object)
    {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        final Coordinate that = (Coordinate) object;
        return this.column == that.getColumn() && this.row == that.getRow();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.column, this.row);
    }
}
