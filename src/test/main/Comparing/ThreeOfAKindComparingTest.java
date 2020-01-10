package test.main.Comparing; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import main.Ranking.ThreeOfAKindImp;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

public class ThreeOfAKindComparingTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testCompare() throws Exception {
    Card cardA1 = new Card(CardType.SQUARE, CardNum.CARD_THIRTEEN);
    Card cardA2 = new Card(CardType.FLOWER, CardNum.CARD_THIRTEEN);
    Card cardA3 = new Card(CardType.SQUARE, CardNum.CARD_THIRTEEN);
    Card cardA4 = new Card(CardType.FLOWER, CardNum.CARD_ONE);
    Card cardA5 = new Card(CardType.RED_PEACH, CardNum.CARD_EIGHT);

    Player player1 = new Player();
    player1.addCard(cardA1);
    player1.addCard(cardA2);
    player1.addCard(cardA3);
    player1.addCard(cardA4);
    player1.addCard(cardA5);

    StartRanking startRanking = new ThreeOfAKindImp();
    RankingResult rankingResult = startRanking.resolveStart(player1);

    assertTrue(rankingResult != null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.THREE_OF_A_KIND);


    Card cardB1 = new Card(CardType.FLOWER, CardNum.CARD_TWELVE);
    Card cardB2 = new Card(CardType.BLACK_PEACH, CardNum.CARD_TWELVE);
    Card cardB3 = new Card(CardType.SQUARE, CardNum.CARD_TWELVE);
    Card cardB4 = new Card(CardType.FLOWER, CardNum.CARD_EIGHT);
    Card cardB5 = new Card(CardType.BLACK_PEACH, CardNum.CARD_NINE);

    Player player2 = new Player();
    player2.addCard(cardB1);
    player2.addCard(cardB2);
    player2.addCard(cardB3);
    player2.addCard(cardB4);
    player2.addCard(cardB5);

    StartRanking startRanking1 = new ThreeOfAKindImp();
    RankingResult rankingResult1 = startRanking1.resolveStart(player2);

    assertTrue(rankingResult1 != null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.THREE_OF_A_KIND);

    assertEquals(-1, player1.compareTo(player2));
} 


} 
