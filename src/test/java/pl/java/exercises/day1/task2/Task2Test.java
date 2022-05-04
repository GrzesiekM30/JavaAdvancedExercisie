package pl.java.exercises.day1.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    private static final List<String> UNSORTED = List.of("A","Z","B","W","C","z","a","b","c");
    private static final List<String> EXPECTED_RESAULT = List.of("Z","z","W","C","c","B","b","A","a");

    @Test
    void shouldReveseListOfString_usingAnonymousClass(){
        //given
        //when
        List<String> result = Task2.sortUsingAnonymousClass(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);
    }
    @Test
    void shouldReveseListOfString_usingLambda(){
        //given
        //when
        List<String> result = Task2.sortUsingLambda(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);
    }
    @Test
    void shouldReveseListOfString_usingStream(){
        //given
        //when
        List<String> result = Task2.sortUsingStream(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);
    }
}