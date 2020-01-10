package test.main.Ranking; 

import main.*;
import main.Ranking.FlushImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


public class FlushImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testStartResolve() throws Exception {
    Card flushCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card flushCard2=new Card(CardType.RED_PEACH,CardNum.CARD_SIX);
    Card flushCard3=new Card(CardType.RED_PEACH,CardNum.CARD_THIRTEEN);
    Card flushCard4=new Card(CardType.RED_PEACH,CardNum.CARD_EIGHT);
    Card flushCard5=new Card(CardType.RED_PEACH,CardNum.CARD_ELEVEN);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_EIGHT);

    Player player1=new Player();
    player1.addCard(flushCard1);
    player1.addCard(flushCard2);
    player1.addCard(flushCard3);
    player1.addCard(flushCard4);
    player1.addCard(flushCard5);

    StartRanking startRanking=new FlushImp();
    RankingResult rankingResult=startRanking.resolveStart(player1);
    assertTrue(rankingResult!=null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.FLUSH);

    Player player2=new Player();
    player2.addCard(flushCard1);
    player2.addCard(flushCard2);
    player2.addCard(flushCard3);
    player2.addCard(flushCard4);
    player2.addCard(card);

    StartRanking startRanking1=new FlushImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player2);
    assertTrue(rankingResult1==null);






} 


} 
