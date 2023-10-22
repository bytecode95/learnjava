//3 variables types  1. Local varibles 2. Instance variables 3. Static Varibles

public class Variables {
    public static void main(String[] args){
    
		Vehicle v1 = new Vehicle("Jeep", 2016, "Manual", true);
		System.out.println(v1.brandName);

    }
}

class Vehicle{
	//instance varaibles - have default values
    //string - null
    //int - 0
    //double - 0.0
    //boolean - false
	String brandName;
    //static variable
	static int yearofManufacturing;
	String transmission;
	boolean isairbagavaiable;

    //instance block -- default values wiil be assigned to instance varibles

    {
        brandName = null;
        transmission= null;
        isairbagavaiable = false;
    }

	public Vehicle(){
		System.out.println("Now Vehicle Object is creating  - default constructor");
	}
	
	public Vehicle(String brandName, int year, String transmissiontype, boolean air){
		System.out.println("Now Vehicle Object is creating - parameterized constructor");
		brandName = brandName;
		yearofManufacturing = year;
		transmission = transmissiontype;
		isairbagavaiable = air;
	
	}

	//local varibles --- inside a method 
    //no default value
    //local varibles can not define outside a method
    //varible declaration can be done , but when we are using local varibles should have a values. other wise error
	public static void start(){
        int speed;
        speed = 10;
        System.out.println(speed);
		
	}
	

	public void stop(){
		start();
		
	}
	
	
	
}