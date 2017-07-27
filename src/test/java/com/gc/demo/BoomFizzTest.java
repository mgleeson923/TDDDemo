package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelgleeson on 7/27/17.
 */
public class BoomFizzTest {



    @Test
    public void boom() throws Exception {
        BoomFizz bfTest = new BoomFizz();
        String expected = "1";
        String actual = bfTest.boom(1);
        //assertion
        assertEquals("You suck.. ya jackass", expected, actual );
    }

    @Test
    public void boomTest7() throws Exception {
        BoomFizz bfTest = new BoomFizz();
        String expected = "boom";
        String actual = bfTest.boom(7);
        //assertion
        assertEquals("You suck.. ya jackass", expected, actual );
    }

}