package test.main; 

import main.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Map;

import static org.junit.Assert.*;
public class PlayerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testAddCard() throws Exception {
    OnePoker onePoker=new OnePoker();
    Player player=new Player();
    for(int i=0;i< PlayerContants.player_hand_cards;i++){
        player.addCard(onePoker.disPatch());
    }
    assertEquals(5,player.getCardSize());
} 


@Test
public void testGetCardsCountMap() throws Exception {
    Player player=new Player();
    Card card1=new Card(CardType.RED_PEACH,CardNum.CARD_SEVEN);
    Card card2=new Card(CardType.BLACK_PEACH,CardNum.CARD_SEVEN);
    Card card3=new Card(CardType.FLOWER,CardNum.CARD_NINE);
    Card card4=new Card(CardType.SQUARE,CardNum.CARD_SIX);
    Card card5=new Card(CardType.FLOWER,CardNum.CARD_TEN);

    player.addCard(card1);
    player.addCard(card2);
    player.addCard(card3);
    player.addCard(card4);
    player.addCard(card5);

    Map<Integer,Integer> cardCount=player.getCardsCountMap();

    assertEquals(2,cardCount.get(CardNum.CARD_SEVEN.getNum()).intValue());
    assertEquals(1,cardCount.get(CardNum.CARD_NINE.getNum()).intValue());
    assertEquals(1,cardCount.get(CardNum.CARD_SIX.getNum()).intValue());
    assertEquals(1,cardCount.get(CardNum.CARD_TEN.getNum()).intValue());


} 




} 
