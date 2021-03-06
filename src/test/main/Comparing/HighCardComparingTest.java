package test.main.Comparing; 

import main.*;
import main.Ranking.HighCardImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

public class HighCardComparingTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testCompare() throws Exception {
    Card cardA1 = new Card(CardType.SQUARE, CardNum.CARD_FOUR);
    Card cardA2 = new Card(CardType.FLOWER, CardNum.CARD_THREE);
    Card cardA3 = new Card(CardType.SQUARE, CardNum.CARD_SIX);
    Card cardA4 = new Card(CardType.FLOWER, CardNum.CARD_SEVEN);
    Card cardA5 = new Card(CardType.RED_PEACH, CardNum.CARD_EIGHT);

    Player player1 = new Player();
    player1.addCard(cardA1);
    player1.addCard(cardA2);
    player1.addCard(cardA3);
    player1.addCard(cardA4);
    player1.addCard(cardA5);

    StartRanking startRanking = new HighCardImp();
    RankingResult rankingResult = startRanking.resolveStart(player1);

    assertTrue(rankingResult != null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.HIGH_CARD);


    Card cardB1 = new Card(CardType.FLOWER, CardNum.CARD_FOUR);
    Card cardB2 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TWO);
    Card cardB3 = new Card(CardType.SQUARE, CardNum.CARD_SIX);
    Card cardB4 = new Card(CardType.FLOWER, CardNum.CARD_SEVEN);
    Card cardB5 = new Card(CardType.BLACK_PEACH, CardNum.CARD_EIGHT);

    Player player2 = new Player();
    player2.addCard(cardB1);
    player2.addCard(cardB2);
    player2.addCard(cardB3);
    player2.addCard(cardB4);
    player2.addCard(cardB5);

    StartRanking startRanking1 = new HighCardImp();
    RankingResult rankingResult1 = startRanking1.resolveStart(player2);

    assertTrue(rankingResult1 != null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.HIGH_CARD);

    assertEquals(-1, player1.compareTo(player2));
} 


} 
