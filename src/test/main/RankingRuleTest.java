package test.main; 

import main.RankingRule;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*;

public class RankingRuleTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testGetName() throws Exception {
    RankingRule rankingRule=RankingRule.HIGH_CARD;
    assertEquals(rankingRule.getName(),"高牌");
    assertEquals(rankingRule.getPriority(),100);
} 



} 
