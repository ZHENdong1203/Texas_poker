package main.Ranking;


import main.Player;
import main.PlayerContants;
import main.RankingRule;

import java.util.Iterator;
import java.util.Map;
//解析玩家手中的牌是不是四条
public class FourOfAKindImp extends AbstractRanking{
    protected RankingResult StartResolve(Player player) {

        RankingResult rankingResult = null;
        Map<Integer, Integer> rankCount = player.getCardsCountMap();

        boolean hasFourOfaKind = false;

        Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == PlayerContants.player_hand_cards-1) {
                hasFourOfaKind = true;
                break;
            }
        }

        if (hasFourOfaKind) {
            rankingResult = new RankingResult();
            rankingResult.setRankingRule(RankingRule.FOUR_OF_A_KIND);
        }

        return rankingResult;
    }
}
