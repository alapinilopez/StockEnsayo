package edu.poniperro.stockx.item;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SneakerTest extends TestCase {

    @Test
    public void sneakerNike() {
        Sneaker sneakerNike = new Sneaker("1234567-10", "Nike Mercurial Vapor");
        assertEquals("1234567-10", sneakerNike.getStyle());
        assertEquals("Nike Mercurial Vapor", sneakerNike.getName());
    }
}