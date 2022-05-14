package pl.java.exercises.day2.taks17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {
    METERS_TO_YARDS (v->v*1.09f),
    YARDS_TO_METERS(v->v*0.91f),
    CENTIMETERS_TO_INCHES(v->v*0.39f),
    INCHES_TO_CENTIMETER(v->v*2.54f),
    KILOMETERS_TO_MILES(v->v*0.62f),
    MILES_TO_KILOMETERS(v->v*1.61f);

    private final Function<Float,Float> conversion;

    ConversionTypeWithFunction(Function<Float, Float> conversion) {
        this.conversion = conversion;
    }

    public Function<Float, Float> getConversion() {
        return conversion;
    }
}
