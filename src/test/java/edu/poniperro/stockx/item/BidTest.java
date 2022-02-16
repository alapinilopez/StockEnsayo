package edu.poniperro.stockx.item;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BidTest extends TestCase {
    @Test
    public void addBid(){
        Bid bid = new Bid("15", 600);
        assertEquals("15", bid.size());
        assertEquals(600, bid.value());
    }

}