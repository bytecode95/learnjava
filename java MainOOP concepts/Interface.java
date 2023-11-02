public class Interface {
    public static void main(String[] args){
        Shape square = new Square(4.0);
        square.draw();

        System.out.println("Area of the square: "+ square.calculateArea());
    }
}

interface Shape{
    //abstrct method for drawaing the shape
    void draw();

    //abstract method for calculating the area of the shape
    double calculateArea();
}

//concrete class for implementing the shape interface for a circle

class Square implements Shape{
    private double side;

    Square(double side){
        this.side = side;
    }


    @Override
    public void draw(){
        System.out.println("Drawing square");
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}