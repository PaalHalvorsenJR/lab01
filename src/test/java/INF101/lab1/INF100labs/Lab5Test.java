package INF101.lab1.INF100labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Lab5Test {

    private static ByteArrayOutputStream outputStream;

    @BeforeEach
    void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    // ############ removeThrees ############
    @Test
    void removeThrees1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> removedList = Lab5.removeThrees(list);
        assertEquals(Arrays.asList(1, 2, 4), removedList);
    }

    @Test
    void removeThrees2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        List<Integer> removedList = Lab5.removeThrees(list);
        assertEquals(Arrays.asList(1, 2), removedList);
    }

    @Test
    void removeThrees3() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 3, 1, 3, 2, 4, 3, 3, 3));
        List<Integer> removedList = Lab5.removeThrees(list);
        assertEquals(Arrays.asList(1, 2, 4), removedList);
    }

    @Test
    void removeThrees4() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 3));
        List<Integer> removedList = Lab5.removeThrees(list);
        assertEquals(Arrays.asList(), removedList);
    }

    // ############ uniqueValues ############
    @Test
    void uniqueValues1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 1, 3, 3, 3, 2));
        List<Integer> removedList = Lab5.uniqueValues(list);
        assertEquals(Arrays.asList(1, 2, 3), removedList);
    }

    @Test
    void uniqueValues2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4, 4, 4, 4, 4, 5));
        List<Integer> removedList = Lab5.uniqueValues(list);
        assertEquals(Arrays.asList(4, 5), removedList);
    }

    // ############ addList ############
    @Test
    void addList1() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(4, 2, -3));

        Lab5.addList(a, b);
        assertEquals(Arrays.asList(5, 4, 0), a);
    }

    @Test
    void addList2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(47, 21, -30));

        Lab5.addList(a, b);
        assertEquals(Arrays.asList(48, 23, -27), a);
    }
}