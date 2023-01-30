package INF101.lab1.INF100labs;

import java.util.ArrayList;

/**
 * Implement the methods removeRow and allRowsAndColsAreEqualSum.
 * These programming tasks was part of lab7 in INF100 fall 2022. You can find
 * them here: https://inf100.ii.uib.no/lab/7/
 */
public class Lab7 {

    public static void main(String[] args) {
    }

    public static void removeRow(ArrayList<ArrayList<Integer>> grid, int row) { 
        grid.remove(row); 
    }
        
    
    public static boolean allRowsAndColsAreEqualSum(ArrayList<ArrayList<Integer>> grid) {
        int rowSum = 0;
        int colSum = 0;
        for (int i = 0; i < grid.size(); i++) {
          int currentRowSum = 0;
          int currentColSum = 0;
          for (int j = 0; j < grid.get(i).size(); j++) {
            currentRowSum += grid.get(i).get(j);
            currentColSum += grid.get(j).get(i);
          }
          if (i == 0) {
            rowSum = currentRowSum;
            colSum = currentColSum;
          } else {
            if (currentRowSum != rowSum || currentColSum != colSum) {
              return false;
            }
          }
        }
        return true;
      }
    }