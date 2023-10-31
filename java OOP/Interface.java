public class Interface {
    public static void main(String[] args) {
        // Creating objects of Circle and Square
        Shape circle = new Circle(3.0);
        Shape square = new Square(4.0);

        // Using the draw method, polymorphically
        circle.draw(); // Output: Drawing Circle
        square.draw(); // Output: Drawing Square

        // Using the calculateArea method, polymorphically
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}

// Interface representing a shape
interface Shape {
    // Abstract method for drawing the shape
    void draw();

    // Abstract method for calculating the area of the shape
    double calculateArea();
}

// Concrete class implementing the Shape interface for a Circle
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class implementing the Shape interface for a Square
class Square implements Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
