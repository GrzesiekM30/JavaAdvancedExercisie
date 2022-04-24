package pl.java.exercises.day1.task8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParcelValidatorTest {

    @Test
    void isLenghtSumIsCorrect(){
        //given
        Parcel parcel = new Parcel(50,50,50,25,false);
        ParcelValidator parcelValidator = new ParcelValidator();
        //when
        boolean result = parcelValidator.validate(parcel);
        //then
        assertThat(result).isTrue();
    }

}