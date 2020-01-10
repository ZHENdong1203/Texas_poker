package main.Comparing;


import main.Card;
import main.Player;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractComparing implements StartCompare {

    //按照三条或者四条比较
    protected int multiComparing(Map<Integer, Integer> map1, Map<Integer, Integer> map2, int pair) {

        int player1Number = -1;
        int player2Number = -1;

        Iterator<Map.Entry<Integer, Integer>> it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> next = it.next();
            if (next.getValue() == pair) {
                player1Number = next.getKey();
            }
        }

        Iterator<Map.Entry<Integer, Integer>> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, Integer> next = it2.next();
            if (next.getValue() == pair) {
                player2Number = next.getKey();
            }
        }

        if (player1Number > player2Number) {
            return -1;
        }
        if (player1Number < player2Number) {
            return 1;
        }

        return 0;
    }

    //按照顺序比较
    protected int seqComparing(Player player1, Player player2) {
        List<Card> player1Cards = player1.getCards();
        List<Card> player2Cards = player2.getCards();

        int size = player1.getCardSize();

        for (int i = 0; i < size; i++) {
            if (player1Cards.get(i).getNum().getNum() < player2Cards.get(i).getNum().getNum()) {
                return 1;
            }
            if (player1Cards.get(i).getNum().getNum() > player2Cards.get(i).getNum().getNum()) {
                return -1;
            }
            if (player1Cards.get(i).getNum().getNum() == player2Cards.get(i).getNum().getNum()) {
                continue;
            }
        }
        return 0;
    }


    //pair对子数
    protected int pairComparing(Map<Integer, Integer> map1, Map<Integer, Integer> map2, int pair, int maxPairLoopAddOne) {
        if (maxPairLoopAddOne - 1 == 0) {
            pair = 1;
        }
        int player1MaxNum = this.findMaxNumber(map1, pair);
        int player2MaxNum = this.findMaxNumber(map2, pair);

        if (player1MaxNum < player2MaxNum) {
            return 1;
        }
        if (player1MaxNum > player2MaxNum) {
            return -1;
        }
        if (player1MaxNum == player2MaxNum) {
            map1.remove(player1MaxNum);
            map2.remove(player2MaxNum);
            if (map1.size() == map2.size() && 0 == maxPairLoopAddOne - 1) {
                return this.pairComparing(map1, map2, pair - 1, 1);
            }
            return this.pairComparing(map1, map2, pair, maxPairLoopAddOne - 1);
        }
        return 0;
    }

    private int findMaxNumber(Map<Integer, Integer> map, int pair) {
        int player1Number = -1;

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> next = it.next();
            if (next.getValue() == pair) {
                int number = next.getKey();
                if (number > player1Number) {
                    player1Number = number;
                }
            }
        }
        return player1Number;

    }

}
