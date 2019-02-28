package test;

import Classes.RomanToNumeral;

import static org.junit.Assert.*;

public class RomanToNumeralTest {
    public RomanToNumeral op = new RomanToNumeral();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getNumeral() {
        assertEquals(1199, op.getNumeral("MCXCIX"));
    }

    @org.junit.Test
    public void getCharNumeral() {
        assertEquals(10, op.getCharNumeral('X'));
    }
}