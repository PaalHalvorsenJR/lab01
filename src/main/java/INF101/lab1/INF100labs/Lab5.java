package INF101.lab1.INF100labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implement the methods removeThrees, uniqueValues and addList.
 * These programming tasks was part of lab5 in INF100 fall 2022. You can find them here: https://inf100.ii.uib.no/lab/5/
 */
public class Lab5 {
    
    public static void main(String[] args) {
        // Call the methods here to test them on different inputs
        ArrayList<Integer> list = new ArrayList<Integer>();
        
    }
    


    public static ArrayList<Integer> removeThrees(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static List<Integer> uniqueValues(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!unique.contains(list.get(i))) {
                unique.add(list.get(i));
            }
        } 
        return unique;
        
    }

    public static void addList(ArrayList<Integer> a, ArrayList<Integer> b){
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) + b.get(i));
        }
    }
}

