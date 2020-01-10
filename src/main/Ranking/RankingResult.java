package main.Ranking;

import main.Card;
import main.RankingRule;

//解析牌型
public class RankingResult {
    private Card highCard;
    private RankingRule rankingRule;
    public Card getHighCard(){
        return highCard;
    }

    public void setHighCard(Card highCard){
        this.highCard=highCard;
    }

    public RankingRule getRankingRule(){
        return rankingRule;
    }

    public void setRankingRule(RankingRule rankingRule){
        this.rankingRule=rankingRule;
    }

    @Override
    public String toString(){
        return "RankingResult{"+"rankingRule"+rankingRule.getName()+"}";
    }



}
