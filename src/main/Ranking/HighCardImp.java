package main.Ranking;

import main.Card;
import main.Player;
import main.PlayerContants;
import main.RankingRule;

import java.util.List;
import java.util.Map;

//解析玩家手中的拍是不是单牌
public class HighCardImp extends AbstractRanking{

    protected RankingResult StartResolve(Player player){
        RankingResult rankingResult=null;
        Map<Integer,Integer> cardCount=player.getCardsCountMap();

        boolean allOneCard=false;
        if(cardCount.size()== PlayerContants.player_hand_cards){
            List<Card> cards=player.getCards();
            if(!this.isTypeSame(cards)){
                Card maxCard=cards.get(0);
                Card minCard=cards.get(cards.size()-1);
                if(maxCard.getNum().getNum()-minCard.getNum().getNum()>=PlayerContants.player_hand_cards){
                    allOneCard=true;
                }
            }
        }
        if(allOneCard){
            rankingResult=new RankingResult();
            rankingResult.setRankingRule(RankingRule.HIGH_CARD);
        }
        return rankingResult;

    }


}
