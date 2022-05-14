package pl.java.exercises.day2.task20_21_22;

public abstract class Shape3D extends Shape implements Fillable{
    abstract float calculateVolume();

    @Override
    public int fill(float i) {
        if(i > calculateVolume()){
            return 1;
        }else if (i == calculateVolume()) {
            return 0;
        }else
            return -1;
        //return Float.compare(i, calculateVolume()); zwarac -1,0,1
    }
}
