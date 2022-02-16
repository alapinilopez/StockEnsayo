package edu.poniperro.stockx.item;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AskTest extends TestCase {

    @Test
    public void addAsk() {
        Ask ask1 = new Ask("13", 300);
        assertEquals("13", ask1.size());
        assertEquals(300, ask1.value());
    }

}