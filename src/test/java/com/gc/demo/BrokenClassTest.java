package com.gc.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelgleeson on 7/27/17.
 */
public class BrokenClassTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void isCardAMatch() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        boolean expected = true;
        boolean actual = brokenClass.isCardAMatch("ace", "ace");
        assertTrue("Additional Supply Depots Required", actual);
    }

    @Test
    public void baseEncodeFileName() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        String expected = "c2VjcmV0";
        String actual = brokenClass.baseEncodeFileName("secret");
        assertEquals("Whoops", expected, actual);

    }

    @Test
    public void roundUp() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        int expected = 6;
        int actual = brokenClass.roundUp(5.5f);
        assertEquals("Whoops", expected, actual);
    }

    @Test
    public void sum() throws Exception {
        BrokenClass brokenClass = new BrokenClass();
        int expected = 100;
        int actual = brokenClass.sum(50, 50);
        assertEquals("Whoops", expected, actual);
    }

    @After
    public void tearDown() throws Exception {

    }
}