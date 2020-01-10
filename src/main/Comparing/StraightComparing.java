package main.Comparing;


import main.Player;
//顺子牌，按顺序比
public class StraightComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        return this.seqComparing(player1,player2);
    }
}
