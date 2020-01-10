package main.Comparing;

import main.Player;

import java.util.Map;
//先比对子，再比三张单牌
public class OnePairComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        Map<Integer,Integer> player1CardMap=player1.getCardsCountMap();
        Map<Integer,Integer> player2CardMap=player2.getCardsCountMap();

        return this.pairComparing(player1CardMap,player2CardMap,2,2);
    }
}
