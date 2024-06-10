package org.stepup.stream6;

import org.junit.Test;
import org.stepup.stream6.entities.Fraction;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testSetNum() {
        System.out.println("\nFractionTest.testSetNum()");
        Fraction fr = new Fraction(3,4);
        fr.setNum(4);
        assertEquals(fr.doubleValue(),1.0,0.0);
    }

    @Test
    public void testSetDenum() {
        System.out.println("\nFractionTest.testSetDenum()");
        Fraction fr = new Fraction(3,4);
        fr.setDenum(3);
        assertEquals(fr.doubleValue(),1.0,0.0);
    }

    @Test
    public void testDoubleValue() {
        System.out.println("\nFractionTest.testDoubleValue()");
        Fraction fr = new Fraction(3,3);
        assertEquals(fr.doubleValue(),1.0,0.0);
    }

    @Test
    public void testToString() {
        System.out.print("\nFractionTest.testToString()");
        Fraction fr = new Fraction(3,3);
        assertNotNull(fr.toString());
    }
}