package test.main.Comparing; 

import main.*;
import main.Ranking.FlushImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


public class FlushComparingTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testCompare() throws Exception {
    Card cardA1 = new Card(CardType.RED_PEACH, CardNum.CARD_THREE);
    Card cardA2 = new Card(CardType.RED_PEACH, CardNum.CARD_FIVE);
    Card cardA3 = new Card(CardType.RED_PEACH, CardNum.CARD_TWO);
    Card cardA4 = new Card(CardType.RED_PEACH, CardNum.CARD_SEVEN);
    Card cardA5 = new Card(CardType.RED_PEACH, CardNum.CARD_ELEVEN);

    Player player1 = new Player();
    player1.addCard(cardA1);
    player1.addCard(cardA2);
    player1.addCard(cardA3);
    player1.addCard(cardA4);
    player1.addCard(cardA5);

    StartRanking startRanking = new FlushImp();
    RankingResult rankingResult = startRanking.resolveStart(player1);

    assertTrue(rankingResult != null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.FLUSH);


    Card cardB1 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TWO);
    Card cardB2 = new Card(CardType.BLACK_PEACH, CardNum.CARD_THREE);
    Card cardB3 = new Card(CardType.BLACK_PEACH, CardNum.CARD_FIVE);
    Card cardB4 = new Card(CardType.BLACK_PEACH, CardNum.CARD_SEVEN);
    Card cardB5 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TWELVE);

    Player player2 = new Player();
    player2.addCard(cardB1);
    player2.addCard(cardB2);
    player2.addCard(cardB3);
    player2.addCard(cardB4);
    player2.addCard(cardB5);

    StartRanking startRanking1 = new FlushImp();
    RankingResult rankingResult1 = startRanking1.resolveStart(player2);

    assertTrue(rankingResult1 != null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.FLUSH);

    assertEquals(1, player1.compareTo(player2));
} 


} 
