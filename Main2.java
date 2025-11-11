sealed interface Shape permits Circle, Rectangle {}
final class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}
final class Rectangle implements Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}


public class Main2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);

        double area=switch(shape1){
            case Circle c -> Math.PI * c.radius * c.radius;
            case Rectangle r -> r.width * r.height;
        };
        System.out.println("Area of shape1: " + area);
    }

}
