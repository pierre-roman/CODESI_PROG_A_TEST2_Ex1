package test;

import Classes.NumeralToRoman;

import static org.junit.Assert.*;

public class NumeralToRomanTest {
    private NumeralToRoman op;

    @org.junit.Before
    public void setUp() throws Exception {
        op = new NumeralToRoman();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getRoman() {
        assertEquals("CXCIX", op.getRoman(199));
    }
}