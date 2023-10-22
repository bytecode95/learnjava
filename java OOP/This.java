//this keyword -- this is a reference variable that refers to the current object

public class This {
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
	
	public Vehicle(String brandName, int yearofManufacturing, String transmission, boolean isairbagavaiabler){
		System.out.println("Now Vehicle Object is creating - parameterized constructor");
		this.brandName = brandName;
		this.yearofManufacturing = yearofManufacturing;
		this.transmission =  transmission;
		this.isairbagavaiable = isairbagavaiabler;
	
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
