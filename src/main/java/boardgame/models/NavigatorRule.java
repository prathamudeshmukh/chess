package boardgame.models;

public class NavigatorRule
{
    enum Rule {
        SAME,DECREMENT,INCREMENT
    }
    private Rule columnRule;
    private Rule rowRule;

    public NavigatorRule(Rule columnRule, Rule rowRule) {
        this.columnRule = columnRule;
        this.rowRule = rowRule;
    }

    public Rule getColumnRule()
    {
        return columnRule;
    }

    public Rule getRowRule()
    {
        return rowRule;
    }

}
