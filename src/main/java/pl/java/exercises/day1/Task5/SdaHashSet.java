package pl.java.exercises.day1.Task5;

import java.util.HashSet;
import java.util.Set;

public class SdaHashSet<E> {
    private final Set<E> set = new HashSet<>();

    public void add(E item) {
        set.add(item);
    }

    public void remove(E item) {
        set.remove(item);
    }

    public int size() {
        return set.size();
    }

    public boolean contains(E item) {
        return set.contains(item);
    }

    public void clear() {
        set.clear();
    }

}
