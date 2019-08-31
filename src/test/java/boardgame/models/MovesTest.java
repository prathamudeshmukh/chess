package boardgame.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovesTest
{

    @DisplayName("Test getKillerMoves returns list of killer moves")
    @Test
    void testGetKillerMovesReturnsListOfKillerMoves()
    {
        Coordinate killer1 = new Coordinate(1, 2);
        Coordinate killer2 = new Coordinate(1, 3);
        List<Coordinate> killerMoves = Arrays.asList(killer1, killer2);
        List<Coordinate> freeRoamMoves = new ArrayList<>();
        Moves moves  = new Moves(freeRoamMoves, killerMoves);
        assertEquals(killerMoves, moves.getKillerMoves(), "Killer moves do not match");
    }

    @DisplayName("Test getFreeRoamMoves returns list of killer moves")
    @Test
    void testGetFreeRoamMovesReturnsListOfKillerMoves()
    {
        Coordinate freeRoam1 = new Coordinate(1, 2);
        Coordinate freeRoam2 = new Coordinate(1, 3);
        List<Coordinate> killerMoves = new ArrayList<>();
        List<Coordinate> freeRoamMoves = Arrays.asList(freeRoam1, freeRoam2);
        Moves moves  = new Moves(freeRoamMoves, killerMoves);
        assertEquals(freeRoamMoves, moves.getFreeRoamMoves(), "Free Roam moves do not match");
    }
}