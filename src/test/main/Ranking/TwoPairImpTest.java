package test.main.Ranking; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import main.Ranking.TwoPairImp;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

public class TwoPairImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testStartResolve() throws Exception {
    Card TwoPairCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card TwoPairCard2=new Card(CardType.RED_PEACH,CardNum.CARD_SIX);
    Card TwoPairCard3=new Card(CardType.FLOWER,CardNum.CARD_TEN);
    Card TwoPairCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_SIX);
    Card TwoPairCard5=new Card(CardType.SQUARE,CardNum.CARD_ELEVEN);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(TwoPairCard1);
    player1.addCard(TwoPairCard2);
    player1.addCard(TwoPairCard3);
    player1.addCard(TwoPairCard4);
    player1.addCard(TwoPairCard5);

    StartRanking startRanking1=new TwoPairImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.TWO_PAIR);

    Player player2=new Player();
    player2.addCard(TwoPairCard1);
    player2.addCard(TwoPairCard2);
    player2.addCard(TwoPairCard3);
    player2.addCard(TwoPairCard5);
    player2.addCard(card);

    StartRanking startRanking2=new TwoPairImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);

} 


} 
