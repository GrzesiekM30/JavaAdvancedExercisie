package pl.java.exercises.day2.taks17;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MeasurementConverterTest {
    MeasurementConverter converter = new MeasurementConverter();

    @Test
    void shouldConvertCentimetersToInches(){
        //given
        //when
        float result = converter.convert(2f, ConversionType.CENTIMETERS_TO_INCHES);
        //then
        assertThat(result).isEqualTo(0.78f);
    }
    @Test
    void shouldConvertMilesToKilometers(){
        //given
        //when
        float result = converter.convert(2f, ConversionType.MILES_TO_KILOMETERS);
        //then
        assertThat(result).isEqualTo(3.22f);
    }
    @Test
    void shouldConvertCentimetersToInches_function(){
        //given
        //when
        float result = converter.convert(2f, ConversionTypeWithFunction.CENTIMETERS_TO_INCHES);
        //then
        assertThat(result).isEqualTo(0.78f);
    }
    @Test
    void shouldConvertMilesToKilometers_function(){
        //given
        //when
        float result = converter.convert(2f, ConversionTypeWithFunction.MILES_TO_KILOMETERS);
        //then
        assertThat(result).isEqualTo(3.22f);
    }

}