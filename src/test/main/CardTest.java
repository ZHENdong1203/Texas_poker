package test.main; 

import main.Card;
import main.CardNum;
import main.CardType;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

public class CardTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testEquals() throws Exception {
    Card card1=new Card(CardType.RED_PEACH, CardNum.CARD_FIVE);
    Card card2=new Card(CardType.RED_PEACH,CardNum.CARD_FIVE);
    Card card3=new Card(CardType.SQUARE,CardNum.CARD_FIVE);
    assertEquals(card1,card1);
    assertEquals(card1,card2);
    assertFalse(card1==card3);
} 

@Test
public void testToString() throws Exception {
    Card card1=new Card(CardType.RED_PEACH,CardNum.CARD_THIRTEEN);
    Card card2=new Card(CardType.BLACK_PEACH,CardNum.CARD_SEVEN);
    Card card3=new Card(CardType.SQUARE,CardNum.CARD_TEN);
    Card card4=new Card(CardType.FLOWER,CardNum.CARD_SIX);
    assertEquals(card1.toString(),"A13");
    assertEquals(card2.toString(),"C7");
    assertEquals(card3.toString(),"B10");
    assertEquals(card4.toString(),"D6");
} 


} 
