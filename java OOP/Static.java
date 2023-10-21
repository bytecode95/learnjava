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

class Vehicle{
    String brandName;
    static int yearofManufacturing;
    String transmission;
    boolean isPowerMirros;
}
