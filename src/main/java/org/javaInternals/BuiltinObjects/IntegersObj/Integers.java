package org.javaInternals.BuiltinObjects.IntegersObj;

import static org.javaInternals.App.log;
public class Integers {
    public Integers() {

        // parseInt(string, radix (optional)): Converts a string into number, radix is used to specify the base of the number (this could be optional)
        String ex1 = "1";
        log(Integer.parseInt(ex1));

        // valueOf(int "or" string): Return an instance of integer with the specified value
        int ex2 = 10;
        log(Integer.valueOf(ex2));

        String ex3 = "14";
        log(Integer.valueOf(ex3));

        // intValue(): Get the int value of an integer
        Integer ex4 = 16;
        log(ex4.intValue());

        // toString(): transform an integer object into string
        Integer ex5 = 20;
        log(ex5.toString());

        // equals(): verify if an object is similar to other object
        Integer ex6 = 24;
        log(ex6.equals(24));

        // compareTo(integer object): verify if the value of 2 integer object is similar, if it is returns "0" otherwise "-1"
        Integer ex7 = 30;
        Integer ex8 = 32;
        log(ex7.compareTo(ex8));

        // doubleValue(): transform an integer into a double
        Integer ex9 = 34;
        log(ex9.doubleValue());

        // byteValue(): Return the integer value as byte type
        Integer ex10 = 40;
        log(ex10.byteValue());

        // shortValue(): Return the integer value as short type
        Integer ex11 = 44;
        log(ex11.shortValue());

        // longValue(): Return the integer value as long type
        Integer ex12 = 50;
        log(ex12.longValue());

        // floatValue(): Return the integer value as float type
        Integer ex13 = 54;
        log(ex13.floatValue());

        // hashCode(): Return the hash code of an object
        String ex14 = "hola";
        log(ex14.hashCode());

        // compare(): compare 2 int values, if they are similar it returns "0" otherwise "-1"
        int ex15 = 60;
        int ex16 = 60;
        log(Integer.compare(ex15, ex16));
    }
}
