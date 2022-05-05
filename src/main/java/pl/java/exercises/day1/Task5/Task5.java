package pl.java.exercises.day1.Task5;

public class Task5 {
    public static void main(String[] args) {
        SdaHashSet<String> mySet = new SdaHashSet<>();
        mySet.add("Stefan");
        mySet.add("Stefan");
        mySet.add("Michał");
        mySet.add("Anna");
        System.out.println(mySet.size());
        System.out.println(mySet.contains("SteFan"));
        System.out.println(mySet.contains("Stefan"));
        mySet.remove("Stefan");
        System.out.println(mySet.contains("Stefan"));
        mySet.clear();
        System.out.println(mySet.size());
    }
}
