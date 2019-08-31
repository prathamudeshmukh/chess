package boardgame.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static boardgame.models.NavigatorRule.Rule.DECREMENT;
import static boardgame.models.NavigatorRule.Rule.SAME;
import static org.junit.jupiter.api.Assertions.*;

class NavigatorRuleTest
{

    @DisplayName("Test getColumnRule() returns column rule")
    @Test
    void testGetColumnRuleReturnsColumnRule()
    {
        NavigatorRule navigatorRule = new NavigatorRule(SAME, DECREMENT);
        assertEquals(SAME, navigatorRule.getColumnRule(), "Invalid column rule returned");
    }

    @DisplayName("Test getRowRule() returns row rule")
    @Test
    void testGetRowRuleReturnsRowRule()
    {
        NavigatorRule navigatorRule = new NavigatorRule(SAME, DECREMENT);
        assertEquals(DECREMENT, navigatorRule.getRowRule(), "Invalid row rule returned");
    }
}