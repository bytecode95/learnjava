
import java.util.Scanner;
import java.util.Arrays;
//1_D Array
public class Array_1D{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[6];
        for(int i=0; i<marks.length; i++){
            System.out.print("Enter student "+(i+1)+" mark: ");
            marks[i] = sc.nextDouble();
        }
        sc.close();
        System.out.println(Arrays.toString(marks));

    }
}
