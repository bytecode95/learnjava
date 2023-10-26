//The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.
import java.util.Scanner;
public class ForLoop{
    public static void main(String[] args){
        // for(initialization; condition; increment/decrement){    
        //     //statement or code to be executed    
        // }    
         Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        //get positive negative and zero count of user enter numbers
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount =0;
        for(int i=0; i<20; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            int num = sc.nextInt();
            if(num>0){
                positiveCount++;
            }else if(num<0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println("Number of positive integers: "+ positiveCount);
        System.out.println("Number of negative integers: "+ negativeCount);
        System.out.println("Number of zeros: "+ zeroCount);

    }
}