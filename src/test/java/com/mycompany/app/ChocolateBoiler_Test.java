package com.mycompany.app;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Edmundo on 20/10/2016.
 */
public class ChocolateBoiler_Test {
    public ChocolateBoiler choco ;
    @Before
    public void setUp()
    {
        choco = ChocolateBoiler.getInstance();
    }
    @Test
    public void fillTest()
    {
        assertTrue(choco.isEmpty());
        choco.fill();
        assertTrue(!choco.isEmpty());

    }
    @Test
    public void boilTest()
    {
        choco.fill();
        assertTrue(!choco.isBoiled());
        choco.boil();
        assertTrue(choco.isBoiled());
    }
    @Test
    public void drainTest()
    {
        choco.fill();
        choco.boil();

        choco.drain();
        assertTrue(choco.isEmpty());
    }
}
