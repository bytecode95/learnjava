//during type casting process first 8 bytes only assigned to byte b value

public class Overflow {
    public static void main(){
        int a = 130;
        byte b = (byte)a;
        
        System.out.println(a);
        System.out.println(b);
    }
}
