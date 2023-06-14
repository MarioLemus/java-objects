package org.javaInternals.BuiltinObjects.ArrayObj;

import java.util.Arrays;

import static org.javaInternals.App.log;

public class Array {
    public Array() {
        // Arrays are fixed data structures, so these can't be added more data directly after its declaration

        // here is how you declare an array with a fixed size ready to be use later
        String[] ex0 = new String[12];
        log(ex0.length);

        // Arrays.toString(array): transform the array into a string
        String[] ex1 = {"a", "b", "c"};
        log(Arrays.toString(ex1));

        // Arrays.copyOf(array, newLength): return a copy of the original array with a new length
        String[] ex2 = {"a", "b", "c"};
        String[] ex3 = Arrays.copyOf(ex2, 10);
        log(Arrays.toString(ex3));

        // equals(array): verify if arrays are deeply equal
        String[] ex4 = {"a", "b", "c"};
        String[] ex5 = {"a,", "b", "d"};
        log(ex4.equals(ex5));

        // fill(array, default value): fill the content of a predefine array with a default value
        String[] ex6 = new String[15];
        Arrays.fill(ex6, "cuak");
        log(Arrays.toString(ex6));

        // sort(array): sort in ascendant order the values in an array
        String[] ex7 = {"z", "x", "a", "b", "c"};
        Arrays.sort(ex7);
        log(Arrays.toString(ex7));

        // binarySearch(array): search a value using binarySearch (it should be ordered previously) algo
        // if something was found returns its index
        // if nothing was found it returns a negative number
        int[] ex8 = {5, 3, 0, 7, 15};
        String[] ex9 = {"a", "b", "c", "h", "x"};
        log(Arrays.binarySearch(ex8, 0));
        log(Arrays.binarySearch(ex9, "h"));

        // asList(array): convert an array in a list
        String[] ex10 = {"z", "x", "a", "b", "c"};
        Arrays.asList(ex10);
        log(Arrays.toString(ex10));

        // stream(array): create a stream of elements from an array
        String[] ex11 = {"zz", "xx", "aa", "bb", "cc"};
        Arrays.stream(ex11);
        log(Arrays.toString(ex11));

        // parallelSort(array): sort the elements in an array ascending
        String[] ex12 = {"zz", "xx", "aa", "bb", "cc"};
        Arrays.parallelSort(ex12);
        log(Arrays.toString(ex12));
    }
}
