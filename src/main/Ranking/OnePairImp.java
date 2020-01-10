package main.Ranking;


import main.Player;
import main.RankingRule;

import java.util.Iterator;
import java.util.Map;


//解析玩家手中的牌是不是有一对
public class OnePairImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;
        Map<Integer, Integer> rankCount = player.getCardsCountMap();

        boolean hasOnePair = false;

        if (rankCount.size() == 4) {
            Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> next = it.next();
                if (next.getValue() == 2 || next.getValue() == 1) {
                    hasOnePair = true;
                    break;
                }
            }
        }

        if (hasOnePair) {
            rankingResult = new RankingResult();
            rankingResult.setRankingRule(RankingRule.ONE_PAIR);
        }

        return rankingResult;
    }
}
