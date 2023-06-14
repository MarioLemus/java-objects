package org.javaInternals.BuiltInInterfaces.IteratorInt;


import java.util.ArrayList;
import java.util.Iterator;

import static org.javaInternals.App.log;

public class Iterators {

    // Iterator interface, allows you to have a flexible multi-data-structure
    // way of iterate and interact with data in the different collection types
    public Iterators() {
        ArrayList<String> ex1 = new ArrayList<>();
        ex1.add("a");
        ex1.add("b");
        ex1.add("c");
        ex1.add("d");
        ex1.add("e");
        ex1.add("f");

        Iterator<String> ex2 = ex1.iterator();

        while (ex2.hasNext()) {
            if (ex2.next().equals("c")) ex2.remove();
        }

        log(ex1);

    }
}
