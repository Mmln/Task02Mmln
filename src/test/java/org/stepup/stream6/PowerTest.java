package org.stepup.stream6;

import org.junit.Test;
import org.stepup.stream6.entities.Power;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PowerTest {

    @Test
    public void testSetNum() {
        System.out.println("\nPowerTest.testSetNum()");
        Power fr = new Power(3,4);
        fr.setNum(4);
        assertEquals(256.0,fr.doubleValue(),0.0);
    }

    @Test
    public void testSetDenum() {
        System.out.println("\nPowerTest.testSetDenum()");
        Power fr = new Power(3,4);
        fr.setDenum(3);
        assertEquals(27.0,fr.doubleValue(),0.0);
    }

    @Test
    public void testDoubleValue() {
        System.out.println("\nPowerTest.testDoubleValue()");
        Power fr = new Power(3,3);
        assertEquals(27.0,fr.doubleValue(),0.0);
    }

    @Test
    public void testToString() {
        System.out.print("\nPowerTest.testToString()");
        Power fr = new Power(3,3);
        assertNotNull(fr.toString());
    }
}