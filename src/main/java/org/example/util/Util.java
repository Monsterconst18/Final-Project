package org.example.util;

import java.util.Arrays;

public class Util {
    /**
     * Convert each word of a String to title case
     * @param strIn the input string
     * @return a String that is split into two and in title case
     */
    public static String ToTitleCase(String strIn) {
        // Set first letter to upper case
        String firstLetter1 = strIn.substring(0,1);
        firstLetter1 = firstLetter1.toUpperCase();
        // Put a space after the first word and set the rest of letters to lower case
        int spaceLocation = strIn.indexOf(" ");
        String restOfWord1 = strIn.substring(1,spaceLocation);
        restOfWord1 = restOfWord1.toLowerCase();
        // Start the second word after the space of the first word, use same format as first word
        String firstLetter2 = strIn.substring(spaceLocation + 1,spaceLocation + 2);
        firstLetter2 = firstLetter2.toUpperCase();
        int endLocation = strIn.length();
        String restOfWord2 = strIn.substring(spaceLocation + 2,endLocation);
        restOfWord2 = restOfWord2.toLowerCase();

        return firstLetter1 + restOfWord1 + " " + firstLetter2 + restOfWord2;
    }
}
