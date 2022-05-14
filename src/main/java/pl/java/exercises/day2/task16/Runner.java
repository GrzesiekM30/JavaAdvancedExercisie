package pl.java.exercises.day2.task16;

import java.util.Arrays;
import java.util.Comparator;

public enum Runner {
    BEGINNER(401,Integer.MAX_VALUE),
    INTERMEDIATE(201,400),
    ADVANCED(0,200);
    private static final Runner[] VALUES = values();
    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }


    public static Runner getFitnessLevel(int time){
        return Arrays.stream(VALUES)
                .filter(r-> r.maxTime >= time && time >= r.minTime)
                .findFirst()
                .orElse(Runner.BEGINNER);

    }
}
