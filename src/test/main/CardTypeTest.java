package test.main; 

import main.CardType;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


public class CardTypeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testGetType() throws Exception {
    CardType cardType1=CardType.RED_PEACH;
    CardType cardType2=CardType.SQUARE;
    CardType cardType3=CardType.BLACK_PEACH;
    CardType cardType4=CardType.FLOWER;
    assertEquals(cardType1.getType(),"A");
    assertEquals(cardType2.getType(),"B");
    assertEquals(cardType3.getType(),"C");
    assertEquals(cardType4.getType(),"D");
} 




} 
