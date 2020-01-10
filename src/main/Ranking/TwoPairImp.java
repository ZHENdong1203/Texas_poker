package main.Ranking;


import main.Player;
import main.RankingRule;

import java.util.Iterator;
import java.util.Map;


//解析玩家手中的牌是不是有两对
public class TwoPairImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;
        Map<Integer, Integer> rankCount = player.getCardsCountMap();

        boolean hasTwoPair = false;

        if (rankCount.size() == 3) {
            Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> next = it.next();
                if (next.getValue() == 2 || next.getValue() == 1) {
                    hasTwoPair = true;
                    break;
                }
            }
        }

        if (hasTwoPair) {
            rankingResult = new RankingResult();
            rankingResult.setRankingRule(RankingRule.TWO_PAIR);
        }

        return rankingResult;
    }
}
