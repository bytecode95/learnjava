public class Static {
    public static void main(String[] args){

        Vehicle v1= new Vehicle();
        v1.brandName = "Toyota Corolla";
        v1.transmission = "Petrol";
        v1.yearofManufacturing = 2001;
        System.out.println(v1.brandName +" "+ v1.yearofManufacturing);


        Vehicle v2 = new Vehicle();
        v2.brandName = "Tesla";
        v2.transmission = "Electric";
        System.out.println(v2.brandName +" "+ v2.yearofManufacturing);

    }   
}


//inside static method staic methods canot call
//But inside a non static method, staic method can be called
class Vehicle{
    String brandName;
    static int yearofManufacturing;
    String transmission;
    boolean isPowerMirros;

    //static method
    public static void play(){
        //dance() --- error
    }

    //non static method 
    public void dance(){
        play();
    }

    public void stop(){

    }

}
