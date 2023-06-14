package org.javaInternals.BuiltinObjects.StringsObj;

import java.util.Arrays;

import static org.javaInternals.App.log;

public class Strings {
    // In the following section, I will be writing down the most commonly used methods for strings
    public Strings() {
        String baseString = "The dog barks at the people passing by.";

        // length(): Return the length of string
        log(baseString.length());

        // chatAt(index): Return the character in the indicated position
        log(baseString.charAt(0));

        // concat(additional string): Concat a new string to the current one
        String newStringToConcat = " The people got scared of it.";
        log(baseString.concat(newStringToConcat));

        // equals(object): Compare if na object is similar to other object (of course it works with Strings)
        String comparisonString = "Cuak is the best pokemon out there";
        Integer a = 0;
        Integer b = 0;
        log(a.equals(b));

        // equalsIgnoreCase(comparison string): Compare if a string is similar to other independently if it's upper or lower case
        String testString1 = "test";
        String testString2 = "TEST";
        log(testString1.equalsIgnoreCase(testString2));

        // substring(index): Return a sub-string from the indicated index
        String substringExm = "Over the Galaxy there exists a lot of starts";
        log(substringExm.substring(5));

        // substring(starting index, ending index): Return a substring starting from the "starting index"
        // until the "ending index", the ending index is exclusive
        String substringExm2 = "Monkey pox was a temporary decease that creates a lot of fear among global people";
        log(substringExm2.substring(0, 34));

        // indexOf(string): Return the starting index of the first character found
        // if character doesn't exist, it returns -1
        String indexOfExm = "The cat is over the wall";
        log(indexOfExm.indexOf("cat"));

        // lastIndexOf(string): Return the ending index of the last character found
        String lastIndexOfExm = "The cat is over the wall, and is eating";
        log(lastIndexOfExm.lastIndexOf("is"));

        // startsWith(prefix): Verify if the string starts with the given prefix (it is case-sensitive)
        String startsWithExm = "Is the car red?";
        log(startsWithExm.startsWith("Is"));

        // startsWith(prefix, starting index): Verify if the string starts with the given prefix (it is case-sensitive)
        String startsWithExm2 = "Is the car red?";
        log(startsWithExm2.startsWith("the", 3));

        // endWith(suffix): Verify if the string ends with the given suffix (it is case-sensitive)
        String endsWithExm = "Is the car red?";
        log(endsWithExm.endsWith("?"));

        // isEmpty(): Verify if the string is empty
        String isEmptyExm = "a?";
        log(isEmptyExm.isEmpty());

        // replaceFirst(old char, new char): Replace only the first coincidence with a new string
        String replaceFirstExm = "the cat is totally hysterical, but it is dealing with its problems";
        log(replaceFirstExm.replaceFirst("is", "was"));

        // replace(old char, new char): Replace all the coincidences of a word with a new string
        String replaceExm = "is the is yes is ?";
        log(replaceExm.replace("is", "cuak"));

        // replaceAll(regex, new string): Replace all the coincidences of a regex expression (or string pattern) for a new string
        String replaceAllExm = "is the is yes is?";
        log(replaceAllExm.replaceAll("[i,y]", "x"));

        // toLowerCase(): Transform the string to lowercase
        String toLoweCaseExm = "THE CAR IS RED";
        log(toLoweCaseExm.toLowerCase());

        // toUpperCase(): Transform the string to uppercase
        String toUpperCaseExm = "the car is red";
        log(toUpperCaseExm.toUpperCase());

        // trim(): Quit all blank spaces in the beginning, and end of a string
        String trimExm = " koala series 7 ";
        log(trimExm.trim());

        // split(regex or expression): Divides a string into an array of substrings
        String splitExm = "koala is cutting a tree";
        log(Arrays.toString(splitExm.split("is")));

        // contains(string): Verify if the string contains a specific sequence of characters
        String containsExm = "the blue mark is something you missed on twitter";
        log(containsExm.contains("blue"));
    }

}
