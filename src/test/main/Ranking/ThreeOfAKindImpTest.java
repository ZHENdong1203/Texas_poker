package test.main.Ranking; 

import main.*;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import main.Ranking.ThreeOfAKindImp;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

public class ThreeOfAKindImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testStartResolve() throws Exception {
    Card ThreeOfKindCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card ThreeOfKindCard2=new Card(CardType.RED_PEACH,CardNum.CARD_TEN);
    Card ThreeOfKindCard3=new Card(CardType.FLOWER,CardNum.CARD_TEN);
    Card ThreeOfKindCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_SIX);
    Card ThreeOfKindCard5=new Card(CardType.SQUARE,CardNum.CARD_ELEVEN);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(ThreeOfKindCard1);
    player1.addCard(ThreeOfKindCard2);
    player1.addCard(ThreeOfKindCard3);
    player1.addCard(ThreeOfKindCard4);
    player1.addCard(ThreeOfKindCard5);

    StartRanking startRanking1=new ThreeOfAKindImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.THREE_OF_A_KIND);

    Player player2=new Player();
    player2.addCard(ThreeOfKindCard2);
    player2.addCard(ThreeOfKindCard3);
    player2.addCard(ThreeOfKindCard4);
    player2.addCard(ThreeOfKindCard5);
    player2.addCard(card);

    StartRanking startRanking2=new ThreeOfAKindImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
