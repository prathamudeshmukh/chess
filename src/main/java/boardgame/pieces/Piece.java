package boardgame.pieces;

import boardgame.models.Player;

public interface Piece
{
    Player getPlayer();

    Rule getRule();
}
