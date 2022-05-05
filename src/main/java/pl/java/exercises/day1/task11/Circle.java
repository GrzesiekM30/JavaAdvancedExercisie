package pl.java.exercises.day1.task11;

public class Circle implements Movable, Resizable {
    private final Point2D center;
    private final Point2D point;
    private static double radius;
   // private static double perimeter;


    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
        this.radius = getRadius();
    }


    public double getRadius(){
        return radius = Math.sqrt(
                Math.pow((center.getX() - point.getX()),2)+
                        Math.pow((center.getY() - point.getY()),2));
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }


    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public double resize(double resizeFactor) {
        radius = radius*resizeFactor;
        return radius;
    }
}
