package test.main.Comparing; 

import main.*;
import main.Ranking.FullHouseImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

public class FullHouseComparingTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testCompare() throws Exception {
    Card cardA1 = new Card(CardType.SQUARE, CardNum.CARD_SIX);
    Card cardA2 = new Card(CardType.FLOWER, CardNum.CARD_SIX);
    Card cardA3 = new Card(CardType.SQUARE, CardNum.CARD_SIX);
    Card cardA4 = new Card(CardType.FLOWER, CardNum.CARD_EIGHT);
    Card cardA5 = new Card(CardType.RED_PEACH, CardNum.CARD_EIGHT);

    Player player1 = new Player();
    player1.addCard(cardA1);
    player1.addCard(cardA2);
    player1.addCard(cardA3);
    player1.addCard(cardA4);
    player1.addCard(cardA5);

    StartRanking startRanking = new FullHouseImp();
    RankingResult rankingResult = startRanking.resolveStart(player1);

    assertTrue(rankingResult != null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.FULL_HOUSE);


    Card cardB1 = new Card(CardType.FLOWER, CardNum.CARD_TWO);
    Card cardB2 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TWO);
    Card cardB3 = new Card(CardType.SQUARE, CardNum.CARD_TWO);
    Card cardB4 = new Card(CardType.FLOWER, CardNum.CARD_FIVE);
    Card cardB5 = new Card(CardType.BLACK_PEACH, CardNum.CARD_FIVE);

    Player player2 = new Player();
    player2.addCard(cardB1);
    player2.addCard(cardB2);
    player2.addCard(cardB3);
    player2.addCard(cardB4);
    player2.addCard(cardB5);

    StartRanking startRanking1 = new FullHouseImp();
    RankingResult rankingResult1 = startRanking1.resolveStart(player2);

    assertTrue(rankingResult1 != null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.FULL_HOUSE);

    assertEquals(-1, player1.compareTo(player2));
} 


} 
