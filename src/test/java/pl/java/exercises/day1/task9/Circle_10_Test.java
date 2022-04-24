package pl.java.exercises.day1.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class Circle_10_Test {

    private Circle circle;
    @BeforeEach
    void setUp(){
        Point2D center= new Point2D(0,0);
        Point2D point= new Point2D(3,0);
        circle = new Circle(center,point);
        circle.move(new MoveDirection(0,5));

    }

    @Test
    void shouldReturnCorrectRadius(){
        //given
        //when
        double result = circle.getRadius();
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    void shouldReturnCorrectPerimeter(){
        //given
        //when
        double result = circle.getPerimeter();
        //then
        assertThat(round(result)).isEqualTo(18.85);
        //assertThat(result).isCloseTo(18.84, within(0.01D));
    }
    @Test
    void shouldReturnCorrectArea(){
        //given
        //when
        double result = circle.getArea();
        //then
        assertThat(result).isCloseTo(28.26, within(0.02D));
    }

    private double round(double value){
        return Math.ceil(value*100)/100;
    }

}