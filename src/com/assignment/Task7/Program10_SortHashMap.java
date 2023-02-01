package com.assignment.Task7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Program10_SortHashMap {
    static HashMap<Integer, String> m = new HashMap<>();
    public static void sortKeyValues() {
        ArrayList<Integer> sortKeys
                = new ArrayList<Integer>(m.keySet());
        Collections.sort(sortKeys);
        for (Integer i : sortKeys)
            System.out.println("Key : " + i
                    + ", Value : " + m.get(i));
    }
    public static void main(String args[]) {
        m.put(2, "two");
        m.put(5, "five");
        m.put(1, "one");
        m.put(3, "three");
        m.put(4, "four");
        sortKeyValues();
    }
}
