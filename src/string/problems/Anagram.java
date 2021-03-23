package string.problems;

import java.util.Arrays;

public class Anagram {


    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */
    public static void main(String[] args) {

    }

    public boolean anagramCheck(String put1, String put2) {
        char[] word1 = put1.toCharArray();
        char[] word2 = put2.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        if (Arrays.equals(word1, word2)) {
            return true;
        }
        return false;
    }
}

