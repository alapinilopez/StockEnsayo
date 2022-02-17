package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Sneaker;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MinAskTest extends TestCase {

    @Test
    public void checkCriteriasBidsAsks() {
        Sneaker sneaker = new Sneaker("1234567-10", "Sneaker 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria minAsk = new MinAsk();
        sneaker.setAsk(minAsk.checkCriteria(sneaker).get(0).value());
        assertEquals(288, sneaker.getAsk());
    }


}