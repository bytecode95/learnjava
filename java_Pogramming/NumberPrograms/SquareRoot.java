import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Method 1 using sqrt()
        System.out.println(Math.sqrt(num));

        //Method 2
        double temp;
        double sqrt = num/2;
        
        do{
            temp = sqrt;
            sqrt = (temp+(num/temp))/2;
        }while(temp-sqrt!=0);
            System.out.println(sqrt);
        sc.close();
    }
}
