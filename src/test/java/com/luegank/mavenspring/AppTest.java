package com.luegank.mavenspring;


import org.junit.*;

import com.luegank.mavenspring.App;

import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private App testO; 
    

    /**
     * @return the suite of tests being tested
     */
    @Before
    public void setUp()
    {
        testO =new App();
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAdd()
    {
        int re = testO.add(1,1);
    	assertEquals("bad",re,2);
    }
}
