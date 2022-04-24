package pl.java.exercises.day1.task1;

import org.testng.annotations.Test;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;


public class Task1Test {

    private static final List<String> UNSORTED = List.of("A","Z","B","W","C");
    private static final List<String> EXPECTED_RESAULT = List.of("Z","W","C","B","A");

    @Test
    void shouldReveseListOfString_usingAnonymousClass(){
        //given
        //when
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);

    }
    @Test
    void shouldReveseListOfString_usingOwnComparator(){
        //given
        //when
        List<String> result = Task1.sortUsingOwnComparator(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);

    }
    @Test
    void shouldReveseListOfString_usingLambda(){
        //given
        //when
        List<String> result = Task1.sortUsingLambda(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);

    }
    @Test
    void shouldReveseListOfString_usingStream(){
        //given
        //when
        List<String> result = Task1.sortUsingStream(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);

    }
    @Test
    void shouldReveseListOfString_usingSortOnList(){
        //given
        //when
        List<String> result = Task1.sortOnList(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESAULT);

    }

}