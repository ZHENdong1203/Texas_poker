package main.Comparing;

import main.Player;

public class StraightFlushComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        return this.seqComparing(player1,player2);
    }
}
