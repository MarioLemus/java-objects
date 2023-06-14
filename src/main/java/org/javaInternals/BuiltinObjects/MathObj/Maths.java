package org.javaInternals.BuiltinObjects.MathObj;

import static org.javaInternals.App.log;

public class Maths {
    public Maths() {
        // Math.abs(number): get the absolute numeric value independently of the sign (transform to positive)
        double ex1 = -1.9;
        log(Math.abs(ex1));

        // Math.max(number, number): get the highest number
        double ex2 = -1.9;
        int ex3 = 2;
        log(Math.max(ex2, ex3));

        // Math.min(number, number): get the lowest number
        double ex4 = -1.9;
        int ex5 = 2;
        log(Math.min(ex4, ex5));

        // Math.sqrt(number, number): get the lowest number
        double ex6 = 4;
        log(Math.sqrt(ex6));

        // Math.pow(number, number): return a value elevated to "x" power
        double ex7 = 5;
        double ex8 = 6;
        log(Math.pow(ex7, ex8));

        // Math.random(): return a pseudo random value between 0.0 and 1.0
        double ex9 = 7;
        log(Math.exp(ex9));

        // Math.floor(number): return a rounded value down
        double ex10 = 7.9;
        log(Math.floor(ex10));

        // Math.ceil(number): return a rounded value up
        double ex11 = 8.1;
        log(Math.ceil(ex11));

        // Math.round(number): return a rounded up or down value depending on its proximity to the next number
        double ex12 = 9.1;
        double ex13 = 9.5;
        log(Math.round(ex12));
        log(Math.round(ex13));

        // Math.signum(number): return the sign of a value ("-1" negative representation or "1" positive representation)
        double ex14 = -10;
        double ex15 = 10;
        log(Math.signum(ex14));
        log(Math.signum(ex15));
    }
}
