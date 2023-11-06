import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int n = 1;
        //using for Loop
        for(int i=1; i<=num; i++){
            n = n*i;
        }
        System.out.println("Factorial "+num+" is: "+ n);


        //using recursion method
        int fact = 1;
        fact = factorial(num);
        System.out.println("Factorial "+num+" is: "+ fact);

    }

    public static int factorial(int n){
        if(n==0){
            return n;
        }else{
            return (n*factorial(n-1));
        }
    }
}
