package pl.java.exercises.day1.Task6;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("Second", "Second_value");
        treeMap.put("First", "First_value");
        treeMap.put("Third", "Third_value");
        treeMap.put("Zero", "Last_value");

        showFirstAndLastEntrySet(treeMap);

    }

    public static void showFirstAndLastEntrySet(TreeMap treeMap){
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}

