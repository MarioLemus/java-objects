package org.javaInternals.BuiltinObjects.DoublesObj;

import static org.javaInternals.App.log;

public class Doubles {
    public Doubles() {
        // parseDouble(): convert a string into Double
        Double ex1 = Double.parseDouble("4.0");
        log(ex1);

        // valueOf(double): return a Double object instance
        double ex2 = 8.0;
        log(Double.valueOf(ex2));

        // doubleValue(): return a value of type double represented by Double object
        Double ex3 = 12.0;
        log(ex3.doubleValue());

        // toString(): convert a Double object into string
        Double ex4 = 16.0;
        log(ex4.toString());

        // equals(obj): verify if 2 objects are similar
        Double ex5 = 20.0;
        Double ex6 = 20.0;
        log(ex5.equals(ex6));

        // compareTo(Double): verify if 2 Double objects are similar, if similar it returns "0" otherwise "1"
        Double ex7 = 24.7;
        Double ex8 = 24.0;
        log(ex7.compareTo(ex8));

        // isNaN(): verify if the given value is a number
        Double ex9 = 30.0;
        log(ex9.isNaN());

        // isInfinite(): verify if the given number is infinite
        Double ex10 = 34.0;
        log(ex10.isInfinite());

        // intValue(): convert Double to int
        Double ex11 = 40.0;
        log(ex11.intValue());

        // longValue(): convert Double to long
        Double ex12 = 44.0;
        log(ex12.longValue());

        // floatValue(): convert Double to float
        Double ex13 = 50.0;
        log(ex13.floatValue());

        // hashCode(): return a hash code of the object
        Double ex14 = 54.0;
        log(ex14.hashCode());

        // compare(): compare 2 values of type double, if they are similar. it returns "0" otherwise "1"
        Double ex15 = 60.7;
        Double ex16 = 60.0;
        log(ex15.compareTo(ex16));
    }
}
