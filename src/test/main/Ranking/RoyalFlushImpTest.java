package test.main.Ranking; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.RoyalFlushImp;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoyalFlushImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testStartResolve() throws Exception {
    Card RoyalFlushCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card RoyalFlushCard2=new Card(CardType.RED_PEACH,CardNum.CARD_ELEVEN);
    Card RoyalFlushCard3=new Card(CardType.RED_PEACH,CardNum.CARD_TWELVE);
    Card RoyalFlushCard4=new Card(CardType.RED_PEACH,CardNum.CARD_THIRTEEN);
    Card RoyalFlushCard5=new Card(CardType.RED_PEACH,CardNum.CARD_ONE);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(RoyalFlushCard1);
    player1.addCard(RoyalFlushCard2);
    player1.addCard(RoyalFlushCard3);
    player1.addCard(RoyalFlushCard4);
    player1.addCard(RoyalFlushCard5);

    StartRanking startRanking1=new RoyalFlushImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.ROYAL_FLUSH);

    Player player2=new Player();
    player2.addCard(RoyalFlushCard2);
    player2.addCard(RoyalFlushCard3);
    player2.addCard(RoyalFlushCard4);
    player2.addCard(RoyalFlushCard5);
    player2.addCard(card);

    StartRanking startRanking2=new RoyalFlushImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
