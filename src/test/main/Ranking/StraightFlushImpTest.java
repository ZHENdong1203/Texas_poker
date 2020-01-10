package test.main.Ranking; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import main.Ranking.StraightFlushImp;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

public class StraightFlushImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testStartResolve() throws Exception {
    Card StraightFlushCard1=new Card(CardType.RED_PEACH, CardNum.CARD_EIGHT);
    Card StraightFlushCard2=new Card(CardType.RED_PEACH,CardNum.CARD_NINE);
    Card StraightFlushCard3=new Card(CardType.RED_PEACH,CardNum.CARD_TEN);
    Card StraightFlushCard4=new Card(CardType.RED_PEACH,CardNum.CARD_ELEVEN);
    Card StraightFlushCard5=new Card(CardType.RED_PEACH,CardNum.CARD_TWELVE);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(StraightFlushCard1);
    player1.addCard(StraightFlushCard2);
    player1.addCard(StraightFlushCard3);
    player1.addCard(StraightFlushCard4);
    player1.addCard(StraightFlushCard5);

    StartRanking startRanking1=new StraightFlushImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.STRAIGHT_FLUSH);

    Player player2=new Player();
    player2.addCard(StraightFlushCard2);
    player2.addCard(StraightFlushCard3);
    player2.addCard(StraightFlushCard4);
    player2.addCard(StraightFlushCard5);
    player2.addCard(card);

    StartRanking startRanking2=new StraightFlushImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
