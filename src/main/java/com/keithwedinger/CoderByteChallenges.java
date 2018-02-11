package com.keithwedinger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Java version of CoderByteChallanges solutions
 *
 * @author Keith Wedinger <br>
 * Created On: 1/19/18
 */
public class CoderByteChallenges {
    public String letterChanges(String input) {
        final ArrayList<Character> lowerCaseVowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        char[] inputChars = input.toCharArray();
        char[] changedChars = new char[inputChars.length];
        for(int i = 0; i < inputChars.length; i++) {
            char currentChar = inputChars[i];
            if (('a' <= currentChar && 'z' >= currentChar) || ('A' <= currentChar && 'Z' >= currentChar)) {
                if (currentChar == 'z') {
                    changedChars[ i ] = 'a';
                } else if (currentChar == 'Z') {
                    changedChars[ i ] = 'A';
                } else{
                    changedChars[i] = (char)(inputChars[i] + 1);
                    if (lowerCaseVowelList.contains(changedChars[i])) {
                        changedChars[i] = Character.toUpperCase(changedChars[i]);
                    }
                }
            } else {
                changedChars[i] = inputChars[i];
            }
        }

        return new String(changedChars);
    }

    public String longestWord(String sen) {
        String[] words = sen.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        return words[words.length - 1];

    }
}

