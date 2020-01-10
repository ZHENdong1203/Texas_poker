package main.Ranking;

import main.Card;
import main.Player;
import main.RankingRule;

import java.util.List;

//解析玩家手中的牌是不是顺子
public class StraightImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;

        List<Card> cards = player.getCards();
        if (!this.isTypeSame(cards)) { // 如果不是同色
            boolean isStraight = true;
            Card previousCard = null;
            for (Card card : cards) {
                if (previousCard != null) {
                    if (card.getNum().getNum() - previousCard.getNum().getNum() != -1) {
                        isStraight = false;
                        break;
                    }
                }
                previousCard = card;
            }
            if (isStraight) {
                rankingResult = new RankingResult();
                rankingResult.setRankingRule(RankingRule.STRAIGHT);
            }

        }

        return rankingResult;
    }

}
