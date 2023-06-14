package org.javaInternals;

import org.javaInternals.BuiltinObjects.ThreadObj.Threads;

public class App {
    public static <T> void log(T msg) {
        System.out.println(msg);
    }

    public static void main( String[] args )
    {
        // Studied methods (sorted by chat-gpt list order)

        // new Strings();
        // new Integers();
        // new Doubles();
        // new Booleans();
        // new Iterators();
        // new Maths();
        // new Exceptions();
        new Threads();
    }
}
