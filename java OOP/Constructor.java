//Constructor 

//a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.


public class Constructor {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
		v1.brandName = "Toyota Corolla";
		v1.yearofManufacturing = 2002;
		v1.transmission = "Auto";
		v1.isairbagavaiable = true;
		
		System.out.println(v1.brandName+" "+v1.yearofManufacturing);
		
		Vehicle v2 = new Vehicle();
		v2.brandName = "Tesla";
		//v2.yearofManufacturing = 2007;
		v2.transmission = "Auto";
		v2.isairbagavaiable = true;
		
		System.out.println(v2.brandName+" "+v2.yearofManufacturing);
		
		
		Vehicle v3 = new Vehicle("Jeep", 2016, "Manual", true);
		System.out.println(v3.brandName);

    }
}

class Vehicle{
	//attributes
	//static keyword usage
	String brandName;
	int yearofManufacturing;
	String transmission;
	boolean isairbagavaiable;
	
	//constructor --- default constructor
	public Vehicle(){
		System.out.println("Now Vehicle Object is creating  - default constructor");
	}
	
	//method overloading - methods can be defined agin when parameter type or count changing
	//constructor -- parameterized constructor
	
	public Vehicle(String name, int year, String transmissiontype, boolean airbagavaiablity){
		System.out.println("Now Vehicle Object is creating - parameterized constructor");
        //varaible = parameter name 
        //dont use same name for variable and parameter name
		brandName = name;
		yearofManufacturing = year;
		transmission = transmissiontype;
		isairbagavaiable = airbagavaiablity;
	
	}
	
	//method or action
	//static method
	
	public static void start(){
		//stop(); error
	}
	
	
	//non static method
	public void stop(){
		start();
		
	}
}
