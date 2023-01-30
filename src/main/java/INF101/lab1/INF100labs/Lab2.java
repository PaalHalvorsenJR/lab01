package INF101.lab1.INF100labs;

import java.util.ArrayList;

/**
 * Implement the methods findLongestWords, isLeapYear and isEvenPositiveInt.
 * These programming tasks was part of lab2 in INF100 fall 2022. You can find them here: https://inf100.ii.uib.no/lab/2/
 */
public class Lab2 {
    
    public static void main(String[] args) {
        // Call the methods here to test them on different inputs
        findLongestWords("heilo", "hallo", "halla");
        System.out.println(isLeapYear(2020));
        System.out.println(isEvenPositiveInt(2));
    }
   

    public static void findLongestWords(String word1, String word2, String word3) {
        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            System.out.println(word1);
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            System.out.println(word2);
        } else if (word3.length() > word1.length() && word3.length() > word2.length()) {
            System.out.println(word3);

        } else if (word1.length() == word2.length() && word1.length() == word3.length()) {
            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
        
        }else if (word1.length() == word2.length()){
            System.out.println(word1);
            System.out.println(word2);    
        } else if (word1.length() == word3.length()){
            System.out.println(word1);
            System.out.println(word3);
        } else if (word2.length() == word3.length()) {
            System.out.println(word2);
            System.out.println(word3);
        }
            
        
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static boolean isEvenPositiveInt(int num) {
        if (num % 2 == 0 && num > 0) {
            return true;
        } else {
            return false;
        }
    }

}
