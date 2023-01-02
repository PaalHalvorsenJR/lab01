package INF101.lab1.INF100labs;

import java.util.Scanner;

/**
 * Implement the methods task1, and task2.
 * These programming tasks was part of lab1 in INF100 fall 2022. You can find them here: https://inf100.ii.uib.no/lab/1/
 */
public class Lab1 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Call the methods here to test them on different inputs
        
    }

    public static void task1() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public static void task2() {
        sc = new Scanner(System.in); // Do not remove this line
        
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Reads input from console with given prompt
     * @param prompt
     * @return string input answer from user
     */
    public static String readInput(String prompt) {
        System.out.println(prompt);
        String userInput = sc.nextLine();
        return userInput;
    }

}
