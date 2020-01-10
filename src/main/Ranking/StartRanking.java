package main.Ranking;


import main.Player;

//解析玩家手中的牌是什么类型

public interface StartRanking {
    RankingResult resolveStart(Player player);
}
