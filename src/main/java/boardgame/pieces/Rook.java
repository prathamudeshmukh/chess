package boardgame.pieces;

import boardgame.models.Player;

public class Rook implements Piece
{
    private Player player;
    public Rook(Player player) {
        this.player = player;
    }

    public Player getPlayer()
    {
        return this.player;
    }

    public Rule getRule()
    {
        return null;
    }
}
