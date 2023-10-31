class Abstraction{
    public static void main(String[] args) {

        Circle c1 = new Circle(0.5);
        Shape c2 = new Circle(1.0);
        System.out.println("Area of Circle: " + c1.calculateArea());
        System.out.println("Area of Circle: " + c2.calculateArea());
    }
}

// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area (implementation will be provided by subclasses)

    public Shape(){
        System.out.println("This is shape super class constructor");
    }


    public abstract double calculateArea();

    // Concrete method (common to all shapes)
    public void displayInfor(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    // Attributes specific to Circle
    private double radius;

    // Constructor
    public Circle(double radius) {
        System.out.println("this is circle class constructor");
        this.radius = radius;
    }

    // Implementation of abstract method for calculating area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    // Attributes specific to Rectangle
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method for calculating area
    @Override
    public double calculateArea() {
        return length * width;
    }
}
