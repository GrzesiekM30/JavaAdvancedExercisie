package pl.java.exercises.day1.task11;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class Circle_11_Test {
    private Circle circle;
    @BeforeEach
    void setUp() {
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(3, 0);
        circle = new Circle(center, point);
    }
    @Test
    void shouldReturnResizedRadius(){
        //given
        //when
        double result = circle.resize(2);
        //then
        assertThat(result).isEqualTo(6);
    }
    @Test
    void shouldReturnResizedPerimeter(){
        //given
        double radius = circle.resize(2);
        //when
        double result = circle.getPerimeter();
        //then
        assertThat(round(result)).isEqualTo(37.7);
    }
    @Test
    void shouldReturnCorrectArea(){
        //given
        double radius = circle.resize(2);
        //when
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(113.04, within(0.5D));
    }

    private double round(double value){
        return Math.ceil(value*100)/100;
    }

}