package boardgame.models;

public class Navigator
{
    private Coordinate currentLocation;
    private Direction direction;
    private Coordinate boundary;

    public Navigator(final Coordinate currentLocation, final Direction direction, final Coordinate boundary)
    {
        this.currentLocation = currentLocation;
        this.direction = direction;
        this.boundary = boundary;
    }

    public boolean next() {
        if (direction.equals(Direction.NORTH)) {
            if (currentLocation.getRow() == 0) return false;
            this.currentLocation.setRow(currentLocation.getRow() - 1);
            return true;
        }
        return false;
    }

    public Coordinate getCurrentLocation() {
        return this.currentLocation;
    }
}
