package pl.java.exercises.day1.task8;

import java.nio.channels.FileLock;

public class ParcelValidator implements Validator{
    private static final int TOTAL_MAX_LENGHT = 300;
    private static final int SINGLE_MIN_LENGHT = 30;
    private static final float MAX_WEIGHT_FOR_EXPRES = 15f;
    private static final float MAX_WEIGHT_FOR_NON_EXPRES = 30f;
    @Override
    public boolean validate(Parcel input) {
        return isSumOfXYZCorrect(input)
                &&isEachDimesnionCorrect(input)
                &&isWeightCorrect(input);
    }

    private boolean isSumOfXYZCorrect(Parcel input) {

        return (input.getxLength() + input.getzLength() + input.getyLenght()) <= TOTAL_MAX_LENGHT;
    }
    private boolean isEachDimesnionCorrect(Parcel input) {

        return input.getxLength() >= SINGLE_MIN_LENGHT
                && input.getzLength() >= SINGLE_MIN_LENGHT
                && input.getyLenght() >= SINGLE_MIN_LENGHT;
    }
    private boolean isWeightCorrect(Parcel input) {

        return (input.isExpress()&&input.getWeight()<=MAX_WEIGHT_FOR_EXPRES||
                !input.isExpress()&&input.getWeight()<=MAX_WEIGHT_FOR_NON_EXPRES);
    }
}
