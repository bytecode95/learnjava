
import java.util.Arrays;
public class Basicarray {
    public static void main(String[] args){
        //defined array
        int[] num1 = {23, 45, 36, 48, 98, 76};
        int[] num2 = new int[num1.length];

        for(int i=0; i<num2.length; i++){
            num2[i] = num1[1];
        }
        System.out.println(Arrays.toString(num2));
    }
}
