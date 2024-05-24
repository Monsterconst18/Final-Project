package org.example.util;

import java.util.Arrays;

public class Util {
    /**
     * Convert each word of a String to title case
     * @param strIn the input string
     * @return a String that is split into two and in title case
     */
    public static String ToTitleCase(String strIn) {
        String firstLetter1 = strIn.substring(0,1);
        
        firstLetter1 = firstLetter1.toUpperCase();
        int spaceLocation = strIn.indexOf(" ");
        String restOfWord1 = strIn.substring(1,spaceLocation);
        restOfWord1 = restOfWord1.toLowerCase();
        String firstLetter2 = strIn.substring(spaceLocation + 1,spaceLocation + 2);
        firstLetter2 = firstLetter2.toUpperCase();
        int endLocation = strIn.length();
        String restOfWord2 = strIn.substring(spaceLocation + 2,endLocation);
        restOfWord2 = restOfWord2.toLowerCase();

        return firstLetter1 + restOfWord1 + " " + firstLetter2 + restOfWord2;
    }
}
