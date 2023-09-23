package secondGroupExercises;

import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if
//they are anagrams, meaning they contain the same characters in a
//different order. For example, "listen" and "silent" are anagrams.
public class Question5 {
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";
        char [] chword1= word1.toCharArray();
        char [] chword2= word2.toCharArray();
            Arrays.sort(chword1);
            Arrays.sort(chword2);
            if (Arrays.equals(chword1,chword2)){
                System.out.println("these words are anagram word");
            }else {
                System.out.println("these words are not anagram word ");
            }
    }}


