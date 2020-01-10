package main.Ranking;

import main.Player;
import main.RankingRule;

import java.util.Iterator;
import java.util.Map;

//解析玩家手中的牌是不是三条
public class ThreeOfAKindImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;
        Map<Integer, Integer> rankCount = player.getCardsCountMap();

        boolean hasThreeOfaKind = false;

        Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == 3) {
                hasThreeOfaKind = true;
                break;
            }
        }

        if (hasThreeOfaKind) {
            rankingResult = new RankingResult();
            rankingResult.setRankingRule(RankingRule.THREE_OF_A_KIND);
        }

        return rankingResult;
    }

}
