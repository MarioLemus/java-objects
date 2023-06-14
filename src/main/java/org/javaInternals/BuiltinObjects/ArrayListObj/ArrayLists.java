package org.javaInternals.BuiltinObjects.ArrayListObj;

import static org.javaInternals.App.log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {
    public ArrayLists() {
        // addAll(other arraylist): add the given collection to the base one
        ArrayList<String> ex1 = new ArrayList<String>();
        ex1.add("a");
        ex1.add("b");
        ex1.add("c");

        ArrayList<String> ex2 = new ArrayList<String>();
        ex2.add("d");
        ex2.add("e");

        ex1.addAll(ex2);
        log(ex1);

        // remove(obj or index): remove an objet from an arraylist
        ArrayList<String> ex3 = new ArrayList<String>();
        ex3.add("aa");
        ex3.add("bb");
        ex3.add("cc");
        ex3.add("dd");
        ex3.add("ee");

        ex3.remove(3);
        ex3.remove("bb");
        log(ex3);

        // clear(): delete all elements in the arraylist
        ArrayList<String> ex4 = new ArrayList<String>();
        ex4.add("aaa");
        ex4.add("bbb");
        ex4.add("ccc");
        ex4.add("ddd");

        ex4.clear();
        log(ex4);

        // size(): return the number of elements in an arraylist
        ArrayList<String> ex5 = new ArrayList<String>();
        ex5.add("aaaa");
        ex5.add("bbbb");
        ex5.add("cccc");
        ex5.add("dddd");

        log(ex5.size());

        // isEmpty(): verify if there are any element in the arraylist
        ArrayList<String> ex6 = new ArrayList<String>();
        ex6.add("aaaaa");

        log(ex6.isEmpty());

        // contains(obj): verify if the arraylist contains an object
        ArrayList<String> ex7 = new ArrayList<String>();
        ex7.add("aaaaa a");
        ex7.add("bbbbb b");
        ex7.add("ccccc c");

        log(ex7.contains("bbbbb b"));

        // indexOf(obj): find the index of the given item, if it doesn't find anything returns "-1"
        ArrayList<String> ex8 = new ArrayList<String>();
        ex8.add("aaaaa aa");
        ex8.add("bbbbb bb");
        ex8.add("ccccc cc");
        ex8.add("ddddd dd");
        ex8.add("eeeee ee");

        log(ex8.indexOf("ccccc ccs"));

        // lastIndexOf(obj): same as indexOf, but it starts searching for items from starting form the last index
        ArrayList<String> ex9 = new ArrayList<String>();
        ex9.add("aaaaa aa");
        ex9.add("bbbbb bb");
        ex9.add("ccccc cc");
        ex9.add("ccccc cc");

        log(ex9.lastIndexOf("ccccc cc"));

        //  toArray(): convert an array list into an array
        ArrayList<String> ex10 = new ArrayList<String>();
        ex10.add("aaaaa aa");
        ex10.add("bbbbb bb");
        ex10.add("ccccc cc");

        // -> return an object array
        Object[] ex11 = ex10.toArray();

        // -> return a specified data type array
        String[] ex12 = ex10.toArray(new String[0]);
        log(Arrays.toString(ex11));
        log(Arrays.toString(ex12));

        // subList(): return a new list containing the indicated index range's elements
        ArrayList<String> ex13 = new ArrayList<String>();
        ex13.add("aaaaa aa");
        ex13.add("bbbbb bb");
        ex13.add("ccccc cc");

        log(ex13.subList(0, 2));

        // iterator(): create a flexible way of iteration and modification over elements in an iterable object
        ArrayList<String> ex14 = new ArrayList<String>();
        ex14.add("aaaaa aa");
        ex14.add("bbbbb bb");
        ex14.add("ccccc cc");

        Iterator<String> ex15 = ex14.iterator();

        while(ex15.hasNext()) {
            log(ex15.next());
        }

        // removeIf(elm -> condition): take a lambda as param. to filter data
        ArrayList<String> ex16 = new ArrayList<String>();
        ex16.add("aaaaa aa");
        ex16.add("bbbbb bb");
        ex16.add("ccccc cc");

        ex16.removeIf(str -> str.equals("bbbbb bb"));

        log(ex16);
    }
}
