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

    //instance block -- default values wiil be assigned to instance varibles - block will be copy contructor at the first

    {
        System.out.println("Hi i am instance block");
        brandName = null;
        transmission= null;
        isairbagavaiable = false;
    }

    //static block - default values for static varibles
    //only once static varibles assigned once object creation.
    //  //can create a single copy of the static variable and share it among all the instances of the class. 
    //  Memory allocation for static variables happens only once when the class is loaded in the memory.
    
    static{
        System.out.println("Hi i am static block");

    }

    //constructors are calling everytime when object cretion
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