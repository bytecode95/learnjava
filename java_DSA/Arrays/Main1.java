package Arrays;
import java.util.Scanner;
import java.util.Arrays;
//2D Arrays
//create an array with three students four subject marks
public class Main1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double[][] marks = new double[3][4];
        for(int i=0; i<marks.length; i++){
            for(int j=0; j< marks[i].length; j++){
                System.out.print("Enter student "+(i+1)+" marks "+(j+1)+": ");
                marks[i][j] = sc.nextDouble();
            }
        }
        System.out.println(Arrays.toString(marks));
        sc.close();
    }
}
