//If else statments
//Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements. It is one of the fundamental features of Java, which provides a smooth flow of program.
import java.util.Scanner;
public class IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1 mark: ");
        double mark1 = sc.nextDouble();

        System.out.println("Enter your 2 mark: ");
        double mark2 = sc.nextDouble();

        double average = ((mark1+mark2)/2);

        if(average >= 75.0){
            System.out.println("Grade A");
        }else if(average<75.0 && average>= 65.0){
            System.out.println("Grade B");
        }else if(average<65.0 && average>= 55.0){
            System.out.println("Grade C");
        }else if(average<55.0 && average>= 40.0){
            System.out.println("Grade S");
        }else{
            System.out.println("Grade w");
        }
    }
    
}
