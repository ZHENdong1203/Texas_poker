package test.main.Ranking; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import main.Ranking.StraightImp;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

public class StraightImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testStartResolve() throws Exception {
    Card StraightCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TWO);
    Card StraightCard2=new Card(CardType.RED_PEACH,CardNum.CARD_THREE);
    Card StraightCard3=new Card(CardType.FLOWER,CardNum.CARD_FOUR);
    Card StraightCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_FIVE);
    Card StraightCard5=new Card(CardType.SQUARE,CardNum.CARD_SIX);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_ELEVEN);

    Player player1=new Player();
    player1.addCard(StraightCard1);
    player1.addCard(StraightCard2);
    player1.addCard(StraightCard3);
    player1.addCard(StraightCard4);
    player1.addCard(StraightCard5);

    StartRanking startRanking=new StraightImp();
    RankingResult rankingResult=startRanking.resolveStart(player1);
    assertTrue(rankingResult!=null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.STRAIGHT);

    Player player2=new Player();
    player2.addCard(StraightCard1);
    player2.addCard(StraightCard2);
    player2.addCard(StraightCard3);
    player2.addCard(StraightCard4);
    player2.addCard(card);

    StartRanking startRanking2=new StraightImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
