package boardgame.models;

import java.util.HashMap;
import java.util.Map;

import static boardgame.models.Direction.*;
import static boardgame.models.NavigatorRule.Rule.*;

public class Navigator
{
    private Coordinate currentLocation;
    private NavigatorRule navigatorRule;
    private Coordinate boundary;
    private static Map<Direction, NavigatorRule> DIRECTION_NAVIGATION_RULE;
    static {
        DIRECTION_NAVIGATION_RULE = new HashMap<>();
        DIRECTION_NAVIGATION_RULE.put(NORTH, new NavigatorRule(SAME, DECREMENT));
        DIRECTION_NAVIGATION_RULE.put(SOUTH, new NavigatorRule(SAME, INCREMENT));
        DIRECTION_NAVIGATION_RULE.put(EAST, new NavigatorRule(INCREMENT, SAME));
        DIRECTION_NAVIGATION_RULE.put(WEST, new NavigatorRule(DECREMENT, SAME));
        DIRECTION_NAVIGATION_RULE.put(NORTH_EAST, new NavigatorRule(INCREMENT, DECREMENT));
        DIRECTION_NAVIGATION_RULE.put(NORTH_WEST, new NavigatorRule(DECREMENT, DECREMENT));
        DIRECTION_NAVIGATION_RULE.put(SOUTH_EAST, new NavigatorRule(INCREMENT, INCREMENT));
        DIRECTION_NAVIGATION_RULE.put(SOUTH_WEST, new NavigatorRule(DECREMENT, INCREMENT));
    }

    public Navigator(final Coordinate currentLocation, final Direction direction, final Coordinate boundary)
    {
        this.currentLocation = currentLocation;
        this.boundary = boundary;
        navigatorRule = DIRECTION_NAVIGATION_RULE.get(direction);
    }

    public boolean next() {
        if (navigatorRule == null) return false;
        if (!navigatorRule.getColumnRule().equals(SAME))
        {
            int moveBy = 1;
            if (navigatorRule.getColumnRule().equals(DECREMENT)) {
                if (currentLocation.getColumn() == 0) return false;
                moveBy = -1;
            }
            if (currentLocation.getColumn() == boundary.getColumn()) return false;
            int newColumnIndex = currentLocation.getColumn() + moveBy;
            currentLocation.setColumn(newColumnIndex);
        }
        if (!navigatorRule.getRowRule().equals(SAME))
        {
            int moveBy = 1;
            if (navigatorRule.getRowRule().equals(DECREMENT)) {
                if (currentLocation.getRow() == 0) return false;
                moveBy = -1;
            }
            if (currentLocation.getRow() == boundary.getRow()) return false;
            int newRowIndex = currentLocation.getRow() + moveBy;
            currentLocation.setRow(newRowIndex);
        }
        return true;
    }

    public Coordinate getCurrentLocation() {
        return this.currentLocation;
    }
}
