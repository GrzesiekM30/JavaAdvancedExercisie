package pl.java.exercises.day1.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> input = new HashMap<>();
        input.put("Java",18);
        input.put("Phyton",1);
        input.put("C#",25);
        input.put("PHP",0);
        print(input);

    }

    public static void print(Map<String,Integer> map ){
        /*for (String string: map.keySet()){
            System.out.print("Klucz: <" + string + ">, Wartość: <" + map.get(string)+ ">,\n");
        }*/
        /*int counter=0;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            counter++;
            if (counter == map.size()) {
                System.out.print("Klucz: <" + entry.getKey() + ">, Wartość: <" + entry.getValue() + ">.\n");
            } else {
                System.out.print("Klucz: <" + entry.getKey() + ">, Wartość: <" + entry.getValue() + ">,\n");
            }
        }*/
        String result = map.entrySet().stream()
                .map(entry -> "Klucz: <" + entry.getKey() + ">, Wartość: <" + entry.getValue() + ">" )
                .collect(Collectors.joining(",\n","","."));
        System.out.println(result);
    }
}
