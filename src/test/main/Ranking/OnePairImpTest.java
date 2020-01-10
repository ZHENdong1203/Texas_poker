package test.main.Ranking; 

import main.*;
import main.Ranking.OnePairImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


public class OnePairImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testStartResolve() throws Exception {
    Card OnePairCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card OnePairCard2=new Card(CardType.RED_PEACH,CardNum.CARD_SIX);
    Card OnePairCard3=new Card(CardType.FLOWER,CardNum.CARD_TEN);
    Card OnePairCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_EIGHT);
    Card OnePairCard5=new Card(CardType.SQUARE,CardNum.CARD_ELEVEN);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(OnePairCard1);
    player1.addCard(OnePairCard2);
    player1.addCard(OnePairCard3);
    player1.addCard(OnePairCard4);
    player1.addCard(OnePairCard5);

    StartRanking startRanking=new OnePairImp();
    RankingResult rankingResult=startRanking.resolveStart(player1);
    assertTrue(rankingResult!=null);
    assertEquals(rankingResult.getRankingRule(), RankingRule.ONE_PAIR);

    Player player2=new Player();
    player2.addCard(OnePairCard1);
    player2.addCard(OnePairCard2);
    player2.addCard(OnePairCard4);
    player2.addCard(OnePairCard5);
    player2.addCard(card);

    StartRanking startRanking2=new OnePairImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);


} 


} 
