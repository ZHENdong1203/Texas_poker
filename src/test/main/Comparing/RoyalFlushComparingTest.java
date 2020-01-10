package test.main.Comparing; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.RoyalFlushImp;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

public class RoyalFlushComparingTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testCompare() throws Exception {
    Card cardA1 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TEN);
    Card cardA2 = new Card(CardType.BLACK_PEACH, CardNum.CARD_ELEVEN);
    Card cardA3 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TWELVE);
    Card cardA4 = new Card(CardType.BLACK_PEACH, CardNum.CARD_THIRTEEN);
    Card cardA5 = new Card(CardType.BLACK_PEACH, CardNum.CARD_ONE);

    Player player1 = new Player();
    player1.addCard(cardA1);
    player1.addCard(cardA2);
    player1.addCard(cardA3);
    player1.addCard(cardA4);
    player1.addCard(cardA5);

    StartRanking startRanking = new RoyalFlushImp();
    RankingResult rankingResult = startRanking.resolveStart(player1);

    assertTrue(rankingResult != null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.ROYAL_FLUSH);


    Card cardB1 = new Card(CardType.SQUARE, CardNum.CARD_TEN);
    Card cardB2 = new Card(CardType.SQUARE, CardNum.CARD_ELEVEN);
    Card cardB3 = new Card(CardType.SQUARE, CardNum.CARD_TWELVE);
    Card cardB4 = new Card(CardType.SQUARE, CardNum.CARD_THIRTEEN);
    Card cardB5 = new Card(CardType.SQUARE, CardNum.CARD_ONE);

    Player player2 = new Player();
    player2.addCard(cardB1);
    player2.addCard(cardB2);
    player2.addCard(cardB3);
    player2.addCard(cardB4);
    player2.addCard(cardB5);

    StartRanking startRanking1 = new RoyalFlushImp();
    RankingResult rankingResult1 = startRanking1.resolveStart(player2);

    assertTrue(rankingResult1 != null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.ROYAL_FLUSH);

    assertEquals(0, player1.compareTo(player2));
} 


} 
