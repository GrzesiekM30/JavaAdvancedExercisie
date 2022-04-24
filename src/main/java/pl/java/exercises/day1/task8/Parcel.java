package pl.java.exercises.day1.task8;

public class Parcel {
    private int xLength;
    private int yLenght;
    private int zLength;
    private float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLenght, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLenght = yLenght;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLenght() {
        return yLenght;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }
}
