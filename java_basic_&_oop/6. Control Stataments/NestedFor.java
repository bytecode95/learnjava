//nested for loop can be used to create 2D arrays in java
//first loop - row
//second loop - columns

import java.util.Scanner;
import java.util.Arrays;

public class NestedFor {
    public static void main (String[] args){
        int[][] num = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print("Enter "+(i+1)+" row "+(j+1)+" column number: ");
                num[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(Arrays.deepToString(num));
        

    }
}
