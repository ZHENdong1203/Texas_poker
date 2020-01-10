package main;

import main.Comparing.ConcludeCompare;
import main.Comparing.StartCompare;
import main.Ranking.RankingResult;

import java.util.*;

public class Player implements Comparable<Player>{
    private List<Card> cards;
    private RankingResult rankingResult;
    public Player(){
        this.cards=new ArrayList<Card>();
    }

    /*返回玩家手上牌的张数*/
    public int getCardSize(){
        return this.cards.size();
    }

    /*增加玩家的手牌*/
    public void addCard(Card card) {
        this.cards.add(card);
        Collections.sort(this.cards);
    }

    public List<Card> getCards(){
        return cards;
    }

    public RankingResult getRankingResult(){
        if(rankingResult==null){
            rankingResult=new RankingResult();
            rankingResult.setRankingRule(RankingRule.HIGH_CARD);
            rankingResult.setHighCard(this.cards.get(0));
        }
        return rankingResult;
    }

    public Map<Integer, Integer> getCardsCountMap() {
        List<Card> cards = this.getCards();
        Map<Integer, Integer> cardCount = new HashMap<Integer, Integer>();
        for (Card card : cards) {
            Integer number = new Integer(card.getNum().getNum());
            if (!cardCount.containsKey(number)) {
                cardCount.put(number, 1);
            } else {
                cardCount.put(number, cardCount.get(number) + 1);
            }
        }
        return cardCount;
    }

    public void setRankingResult(RankingResult result){
        this.rankingResult=result;
    }

    public int compareTo(Player player) {
        int selfPriority = this.getRankingResult().getRankingRule().getPriority();
        int otherPriority = player.getRankingResult().getRankingRule().getPriority();

        if (selfPriority < otherPriority) {
            return 1;
        }
        if (selfPriority > otherPriority) {
            return -1;
        }

        if (selfPriority == otherPriority) {
            StartCompare startCompare = ConcludeCompare.getComparing(this.getRankingResult().getRankingRule());
            return startCompare.compare(this, player);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                ", rankingResult=" + rankingResult +
                '}';
    }
}
