package main.Comparing;


import main.Player;
//高牌按顺序比较
public class HighCardComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        return this.seqComparing(player1,player2);
    }
}
