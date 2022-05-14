package pl.java.exercises.day2.task20_21_22;

import java.util.Objects;

public class Hexagon extends Shape{
    private final float a;

    public Hexagon(float a) {
        this.a = a;
    }

    @Override
    float calculatePerimeter() {
        return 6*a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexagon hexagon = (Hexagon) o;
        return a == hexagon.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
