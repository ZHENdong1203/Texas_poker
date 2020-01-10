package main.Ranking;

import main.Card;
import main.Player;
import main.RankingRule;

import java.util.List;

//解析玩家手中的牌是不是同花
public class FlushImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;

        List<Card> cards = player.getCards();
        if (this.isTypeSame(cards)) { // 如果是同色
            rankingResult = new RankingResult();
            rankingResult.setRankingRule(RankingRule.FLUSH);
        }

        return rankingResult;
    }
}
