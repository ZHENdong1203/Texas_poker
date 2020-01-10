package main.Comparing;

import main.Player;
//同花比较最大的
public class FlushComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        return this.seqComparing(player1,player2);
    }
}
