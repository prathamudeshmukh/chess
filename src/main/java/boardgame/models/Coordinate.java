package boardgame.models;

public class Coordinate
{
    private final int column;
    private final int row;

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

}
