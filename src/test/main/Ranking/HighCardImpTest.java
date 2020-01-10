package test.main.Ranking; 

import main.*;
import main.Ranking.HighCardImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;
public class HighCardImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testStartResolve() throws Exception {
    Card HighCard1=new Card(CardType.RED_PEACH, CardNum.CARD_FIVE);
    Card HighCard2=new Card(CardType.RED_PEACH,CardNum.CARD_SIX);
    Card HighCard3=new Card(CardType.FLOWER,CardNum.CARD_SEVEN);
    Card HighCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_EIGHT);
    Card HighCard5=new Card(CardType.SQUARE,CardNum.CARD_NINE);
    Card HighCard6=new Card(CardType.SQUARE,CardNum.CARD_TEN);

    Player player1=new Player();
    player1.addCard(HighCard1);
    player1.addCard(HighCard2);
    player1.addCard(HighCard3);
    player1.addCard(HighCard4);
    player1.addCard(HighCard6);

    StartRanking startRanking1=new HighCardImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.HIGH_CARD);

    Player player2=new Player();
    player2.addCard(HighCard1);
    player2.addCard(HighCard2);
    player2.addCard(HighCard3);
    player2.addCard(HighCard4);
    player2.addCard(HighCard5);

    StartRanking startRanking2=new HighCardImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
