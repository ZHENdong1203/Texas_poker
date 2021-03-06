package main.Comparing;

import main.Player;

import java.util.Map;

public class FourOfAKindComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        Map<Integer,Integer> player1CardMap=player1.getCardsCountMap();
        Map<Integer,Integer> player2CardMap=player2.getCardsCountMap();

        return this.multiComparing(player1CardMap,player2CardMap,4);
    }
}
