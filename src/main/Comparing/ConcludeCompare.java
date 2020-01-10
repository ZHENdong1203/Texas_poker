package main.Comparing;


import main.RankingRule;

import java.util.HashMap;
import java.util.Map;

public class ConcludeCompare {
    private final static Map<RankingRule,StartCompare> maps=new HashMap<RankingRule,StartCompare>();
    private final static StartCompare defaultCompare=new DefaultComparing();

    static{
        maps.put(RankingRule.FLUSH,new FlushComparing());
        maps.put(RankingRule.HIGH_CARD,new HighCardComparing());
        maps.put(RankingRule.ONE_PAIR,new OnePairComparing());
        maps.put(RankingRule.STRAIGHT,new StraightComparing());
        maps.put(RankingRule.THREE_OF_A_KIND,new ThreeOfAKindComparing());
        maps.put(RankingRule.TWO_PAIR,new TwoPairComparing());
    }

    public static StartCompare getComparing(RankingRule rankingRule) {
        StartCompare startCompare = maps.get(rankingRule);
        if (startCompare == null) {
            return defaultCompare;
        } else {
            return startCompare;
        }
    }
}
