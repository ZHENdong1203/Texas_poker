package test.main.Ranking; 

import main.*;
import main.Ranking.FullHouseImp;
import main.Ranking.RankingResult;
import main.Ranking.StartRanking;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

public class FullHouseImpTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testStartResolve() throws Exception {
    Card FullHouseCard1=new Card(CardType.RED_PEACH, CardNum.CARD_TEN);
    Card FullHouseCard2=new Card(CardType.RED_PEACH,CardNum.CARD_TEN);
    Card FullHouseCard3=new Card(CardType.FLOWER,CardNum.CARD_TEN);
    Card FullHouseCard4=new Card(CardType.BLACK_PEACH,CardNum.CARD_ELEVEN);
    Card FullHouseCard5=new Card(CardType.SQUARE,CardNum.CARD_ELEVEN);

    Card card=new Card(CardType.SQUARE,CardNum.CARD_FIVE);

    Player player1=new Player();
    player1.addCard(FullHouseCard1);
    player1.addCard(FullHouseCard2);
    player1.addCard(FullHouseCard3);
    player1.addCard(FullHouseCard4);
    player1.addCard(FullHouseCard5);

    StartRanking startRanking1=new FullHouseImp();
    RankingResult rankingResult1=startRanking1.resolveStart(player1);
    assertTrue(rankingResult1!=null);
    assertEquals(rankingResult1.getRankingRule(), RankingRule.FULL_HOUSE);

    Player player2=new Player();
    player2.addCard(FullHouseCard2);
    player2.addCard(FullHouseCard3);
    player2.addCard(FullHouseCard4);
    player2.addCard(FullHouseCard5);
    player2.addCard(card);

    StartRanking startRanking2=new FullHouseImp();
    RankingResult rankingResult2=startRanking2.resolveStart(player2);
    assertTrue(rankingResult2==null);
} 


} 
