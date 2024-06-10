package org.stepup.stream6;

import org.junit.Assert;
import org.junit.Test;

import org.stepup.stream6.entities.Utils;
import org.stepup.stream6.interfaces.Fractionable;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testApp()
    {
        System.out.println("\nUtilsTest.cache()");
        UtilsTest.FractionTst fr = new UtilsTest.FractionTst(7,7);
        Fractionable nm = Utils.cache(fr);
        double res = nm.doubleValue();
        res = nm.doubleValue();
        res = nm.doubleValue();
        Assert.assertEquals( 1.0,res,0);
        Assert.assertEquals( 1,fr.cnt,0);
    }
}
