package org.stepup.stream6;

import org.stepup.stream6.entities.Fraction;
import org.stepup.stream6.entities.Power;
import org.stepup.stream6.entities.Utils;
import org.stepup.stream6.interfaces.Fractionable;

public class App
{
    public static void main( String[] args ) {
        System.out.println( "Task02Mmln started..." );

        System.out.println( "\nFraction section started..." );
        Fraction fr = new Fraction(2,3);
        Fractionable num = Utils.cache(fr);

        System.out.println("Point 00  Cache created, but not calculated = null " + num );
        System.out.print("Point 01 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 02 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 03 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 04  call setNum(5), ");
        num.setNum(5);
        System.out.println();
        System.out.print("Point 05 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 06 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 07 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 08  call num.setDenum(10), ");
        num.setDenum(10);
        System.out.println();
        System.out.print("Point 09 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 10 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.print("Point 11 ");
        System.out.printf("%.2f%n",num.doubleValue());
        System.out.println( "Fraction section finished..." );

        System.out.println( "\nPower section started..." );
        Power pw = new Power(2,3);
        Fractionable nm = Utils.cache(pw);
        System.out.println("Point 00  Cache created, but not calculated = null " + nm);
        System.out.print("Point 01 ");
        System.out.printf("%.2f%n",nm.doubleValue());
        System.out.print("Point 02 ");
        System.out.printf("%.2f%n",nm.doubleValue());
        System.out.print("Point 03 ");
        System.out.printf("%.2f%n",nm.doubleValue());
        System.out.print("Point 04  call setNum(5), ");
        nm.setNum(5);
        System.out.println();
        System.out.print("Point 05 ");
        System.out.printf("%.2f%n",nm.doubleValue());
        System.out.print("Point 06 ");
        System.out.printf("%.2f%n",nm.doubleValue());
        System.out.print("Point 07 ");
        System.out.printf("%.2f%n",nm.doubleValue());
        System.out.print("Point 08  call num.setDenum(10), ");
        System.out.println( "Power section finished..." );
        System.out.println( "\nTask02Mmln finished..." );
    }
}
