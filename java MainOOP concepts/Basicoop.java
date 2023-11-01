public class Basicoop {
    public static void main(String[] args){
        //default constructor
        Shape reactangle = new Shape();
        reactangle.name = "rectangle1";
        reactangle.color = "black";
        reactangle.height = 3;
        reactangle.width = 4;

        

        //how to create a object using parameterized constructor
        Shape square = new Shape("Square1","pink", 1.5, 4, 4);
        
        System.out.println("Area of the "+reactangle.name+" is equal to "+reactangle.calculateArea(3,4));

    }
}


class Shape{
    //data fields
    String name;
    String color;
    static double border;
    int height;
    int width;
    //instance block with default parameters
    {
        name = null;
        color = null;
        height = 0;
        width = 0;
    }

    //static block with default parameters
    static{
        border = 0.0;
    }

    //default constructor

    public Shape(){
        System.out.println("This is default constructor");
    }

    //parameterized constructor
    public Shape(String name, String color, double border, int height, int width){
        System.out.println("This is parameterized constructor");
        this.name = name;
        this.color = color;
        this.border = border;
        this.height = height;
        this.width = width;
    }


    //methods
    public int calculateArea( int height, int width){
        return height* width;
    }

    int calculateCircumference(int height, int width){
        return (height+width)*2;
    }

}