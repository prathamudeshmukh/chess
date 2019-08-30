package boardgame.models;

import java.util.List;

public class Moves
{
    private List<Coordinate> freeRoamMoves;
    private List<Coordinate> killerMoves;

    public Moves(final List<Coordinate> freeRoamMoves, final List<Coordinate> killerMoves)
    {
        this.freeRoamMoves = freeRoamMoves;
        this.killerMoves = killerMoves;
    }

    public List<Coordinate> getKillerMoves()
    {
        return killerMoves;
    }

    public List<Coordinate> getFreeRoamMoves()
    {
        return freeRoamMoves;
    }
}
