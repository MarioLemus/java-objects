package org.javaInternals.BuiltinObjects.BooleanObj;

import static org.javaInternals.App.log;

public class Booleans {
    public Booleans() {
        // parseBoolean(string): convert a string in a boolean value
        String ex1 = "true";
        log(Boolean.parseBoolean(ex1));

        // valueOf(boolean): return an instance of Boolean
        boolean ex2 = false;
        log(Boolean.valueOf(ex2));

        // booleanValue(): return a boolean value represented by Boolean object
        Boolean ex3 = true;
        log(ex3.booleanValue());

        // toString(): convert a boolean into string
        Boolean ex4 = false;
        log(ex4.toString());

        // equals(obj): compares 2 objects, returns boolean (not specific for boolean)
        Boolean ex5 = true;
        Boolean ex6 = true;
        log(ex5.equals(ex6));

        // hashCode(): return a hashcode of the object
        Boolean ex7 = false;
        log(ex7.hashCode());

        // compareTo(boolean): compare the value of 2 Boolean objects, return "0" if true otherwise "1"
        Boolean ex8 = true;
        Boolean ex9 = false;
        log(ex8.compareTo(ex9));

        // logicalAnd(boolean, boolean): do a logical AND evaluation between 2 booleans (is only true if both given values are true)
        boolean ex10 = true;
        boolean ex11 = true;
        log(Boolean.logicalAnd(ex10, ex11));

        // logicalOr(boolean, boolean): do a logical OR evaluation between 2 booleans (true if one of the given values is true)
        boolean ex12 = false;
        boolean ex13 = true;
        log(Boolean.logicalOr(ex12, ex13));

        // logicalXor(boolean, boolean): do a logical XOR evaluation between 2 booleans
        // (true if only one of the given values is true otherwise false, even if the values are true, true)
        // is represented with the following char -> "^"
        boolean ex14 = true;
        boolean ex15 = true;
        log(Boolean.logicalXor(ex14, ex15));

        boolean ex16 = true;
        boolean ex17 = false;
        log(Boolean.logicalXor(ex16, ex17));
    }
}
