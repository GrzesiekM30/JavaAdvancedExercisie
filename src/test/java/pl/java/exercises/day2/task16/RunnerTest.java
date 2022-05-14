package pl.java.exercises.day2.task16;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {
    @Test
    void shouldBeClassifiedAsBeginner(){
         //given
         //when
        Runner result = Runner.getFitnessLevel(500);
        //then
        assertThat(result).isEqualTo(Runner.BEGINNER);
    }
    @Test
    void shouldBeClassifiedAsIntermediete(){
        //given
        //when
        Runner result = Runner.getFitnessLevel(300);
        //then
        assertThat(result).isEqualTo(Runner.INTERMEDIATE);
    }
    @Test
    void shouldBeClassifiedAsAdvanced(){
        //given
        //when
        Runner result = Runner.getFitnessLevel(100);
        //then
        assertThat(result).isEqualTo(Runner.ADVANCED);
    }

}