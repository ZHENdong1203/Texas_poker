package main.Ranking;

import main.Card;
import main.Player;
import main.RankingRule;
import java.util.List;

//解析玩家手中的牌是不是同花顺
public class StraightFlushImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;

        List<Card> cards = player.getCards();
        if (this.isTypeSame(cards)) { // 如果是同色
            boolean isStraightFlush = true;
            Card previousCard = null;
            for (Card card : cards) {
                if (previousCard != null) {
                    if (card.getNum().getNum() - previousCard.getNum().getNum() != -1) {
                        isStraightFlush = false;
                        break;
                    }
                }
                previousCard = card;
            }
            if (isStraightFlush) {
                rankingResult = new RankingResult();
                rankingResult.setRankingRule(RankingRule.STRAIGHT_FLUSH);
            }

        }

        return rankingResult;
    }
}
