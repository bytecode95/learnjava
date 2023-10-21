//conversion and type casting

public class Conversion{
    public static void main(String[]args){
        //byte b = 128; this gives an error int value can not convert into byte. becasue maximum value of byte is 127

        int value = 345;
        double b = value;  //conversion
        int k = 35000;
        byte typeCasting = (byte)k;  //typecasting
        System.out.println(value);
        System.out.println(b);  
        System.out.println(typeCasting);
    }
}