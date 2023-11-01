

public class InheritanceOOP {
    public static void main(String[] args){

        Car car = new Car();
        //attribute usage in parent class
        car.name = "Toyota";
        car.yearofManufacturing = 2003;
        car.model = "Aqua";
        car.autonomus = true;

        //methods usage in parent class
        car.start();
        car.acceleration();;
        car.stop();

    }
}

class Vehicle{
    String name;
    int yearofManufacturing;
    String color;
    double engineCapacity;

    void start(){

    }
    void stop(){

    }

}

class Car extends Vehicle{
    String model;
    String FuelType;
    boolean autonomus;
    int speed;

    void acceleration(){

    }

}
