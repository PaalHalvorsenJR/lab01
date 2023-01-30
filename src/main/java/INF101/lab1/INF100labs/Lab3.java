package INF101.lab1.INF100labs;

/**
 * Implement the methods multiplesOfSevenUpTo, multiplicationTable and crossSum.
 * These programming tasks was part of lab3 in INF100 fall 2022. You can find them here: https://inf100.ii.uib.no/lab/3/
 */
public class Lab3 {
    
    public static void main(String[] args) {
        // Call the methods here to test them on different inputs
        multiplesOfSevenUpTo(49);
        multiplicationTable(3);
        System.out.println(crossSum(4321));
    }

    public static void multiplesOfSevenUpTo(int n) {
    for (int i = 7; i <= n ; i += 7) {
        System.out.println(i);
    }
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; n >= i; i++ ) {
            System.out.print(i + ":" + " ");
            for (int j = 1; n >= j; j++) {
                System.out.print((i * j) + " ");        
            }
            System.out.println();
        }
    }

    public static int crossSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}