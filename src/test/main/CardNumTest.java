package test.main;

import main.CardNum;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;


public class CardNumTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testGetNum() throws Exception {
    CardNum cardNum1=CardNum.CARD_EIGHT;
    CardNum cardNum2=CardNum.CARD_THIRTEEN;
    CardNum cardNum3=CardNum.CARD_FIVE;
    assertEquals(8,cardNum1.getNum().intValue());
    assertEquals(13,cardNum2.getNum().intValue());
    assertEquals(5,cardNum3.getNum().intValue());


} 




} 
