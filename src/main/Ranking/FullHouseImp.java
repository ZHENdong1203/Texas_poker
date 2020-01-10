package main.Ranking;

import main.Player;
import main.RankingRule;

import java.util.Iterator;
import java.util.Map;

//解析玩家手中的牌是不是满堂红(三条加一对）
public class FullHouseImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;
        Map<Integer, Integer> rankCount = player.getCardsCountMap();

        boolean hasFullHouse = false;

        if(rankCount.size()==2) {
            Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer,Integer> next=it.next();
                if (next.getValue() == 2 || next.getValue() == 3) {
                    hasFullHouse = true;
                    break;
                }
            }
        }

        if (hasFullHouse) {
            rankingResult = new RankingResult();
            rankingResult.setRankingRule(RankingRule.FULL_HOUSE);
        }

        return rankingResult;
    }
}
