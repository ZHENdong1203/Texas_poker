package main.Ranking;

import main.Card;
import main.CardNum;
import main.Player;
import main.RankingRule;

import java.util.ArrayList;
import java.util.List;

//解析玩家手中的牌是不是同花大顺
public class RoyalFlushImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;

        List<Card> cards = player.getCards();
        if (this.isTypeSame(cards)) { // 如果是同色
          List<CardNum> cardRank=new ArrayList<CardNum>();
            for (Card card : cards) {
                cardRank.add(card.getNum());
            }
            if(cardRank.contains(CardNum.CARD_TEN)
            &&cardRank.contains(CardNum.CARD_ELEVEN)
            &&cardRank.contains(CardNum.CARD_TWELVE)
            &&cardRank.contains(CardNum.CARD_THIRTEEN)
            &&cardRank.contains(CardNum.CARD_ONE)){
                rankingResult=new RankingResult();
                rankingResult.setRankingRule(RankingRule.ROYAL_FLUSH);
            }
        }

        return rankingResult;
    }
}
