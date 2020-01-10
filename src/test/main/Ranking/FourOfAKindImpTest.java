package test.main.Ranking; 

import main.*;
import main.Ranking.FourOfAKindImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

public class FourOfAKindImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testStartResolve() throws Exception {
    Card FourOfKindCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card FourOfKindCard2=new Card(CardType.RED_PEACH,CardNum.CARD_TEN);
    Card FourOfKindCard3=new Card(CardType.FLOWER,CardNum.CARD_TEN);
    Card FourOfKindCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_TEN);
    Card FourOfKindCard5=new Card(CardType.SQUARE,CardNum.CARD_ELEVEN);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(FourOfKindCard1);
    player1.addCard(FourOfKindCard2);
    player1.addCard(FourOfKindCard3);
    player1.addCard(FourOfKindCard4);
    player1.addCard(FourOfKindCard5);

    StartRanking startRanking1=new FourOfAKindImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.FOUR_OF_A_KIND);

    Player player2=new Player();
    player2.addCard(FourOfKindCard2);
    player2.addCard(FourOfKindCard3);
    player2.addCard(FourOfKindCard4);
    player2.addCard(FourOfKindCard5);
    player2.addCard(card);

    StartRanking startRanking2=new FourOfAKindImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
