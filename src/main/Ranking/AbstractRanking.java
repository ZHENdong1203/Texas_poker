package main.Ranking;


import main.Card;
import main.CardType;
import main.Player;

import java.util.List;
//抽象牌型解析

public abstract class AbstractRanking implements StartRanking {
    public RankingResult resolveStart(Player player){
        this.preResolve(player);
        RankingResult result=this.StartResolve(player);
        this.postResolve(player,result);
        return result;
    }

    public void preResolve(Player player){

    }

    public void postResolve(Player player,RankingResult result){
        if(result!=null){
            result.setHighCard(player.getCards().get(0));
        }
        player.setRankingResult(result);
    }

    protected abstract RankingResult StartResolve(Player player);

    protected boolean isTypeSame(List<Card> cards){
        if(cards==null||cards.size()==0){
            return false;
        }
        if(cards.size()==1){
            return true;
        }
        if(cards.size()>1){
            Card card=cards.get(0);
            CardType cardType=card.getCardType();
            for(int i=0;i<cards.size();i++){
                if(cardType!=cards.get(i).getCardType()){
                    return false;
                }
            }
        }
        return true;
    }








}
