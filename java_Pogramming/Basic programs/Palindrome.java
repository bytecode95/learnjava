import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if(num == reverseNum(num)){
			System.out.println("Number is a palindrome");
		}else{
			System.out.println("Number is not a palindrome");
			
		}
		
		
	}
	
	public static int reverseNum(int num){
		int n;
		int temp=0;
		while(num>0){
			n = num%10;
			temp = temp*10 + n;
			num = num/10;	
		}
		
		return temp;
	}
}
