//Value returning method 
import java.util.Scanner;
import java.util.Arrays;

public class Main1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[3];

        for(int i=0; i<ar.length; i++){
            System.out.print("Enter "+(i+1)+" number:");
          ar[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(ar));
        int total = getSum(ar);
        System.out.println(total);
        System.out.println(getAverage(ar, total));
    }

    
    public static int getSum(int ar[]){
        int sum = 0;
        for(int i=0; i<ar.length;i++){
            sum += ar[i];
        }
        return sum;
    }

    public static int getAverage(int ar[], int sum){
        int average = sum/ar.length;
        return average;
    }

}


