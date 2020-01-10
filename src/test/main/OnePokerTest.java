package test.main; 

import main.OnePoker;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import javax.management.ObjectName;

import static org.junit.Assert.*;

public class OnePokerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void testGetSize() throws Exception {
    OnePoker onePoker=new OnePoker();
    assertEquals(52,onePoker.getSize());
} 


@Test
public void testDisPatch() throws Exception {
    OnePoker onePoker=new OnePoker();
    onePoker.disPatch();
    assertEquals(51,onePoker.getSize());
    onePoker.disPatch();
    assertEquals(50,onePoker.getSize());
} 


} 
