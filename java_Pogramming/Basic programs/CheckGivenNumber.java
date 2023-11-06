import java.util.Scanner;

public class CheckGivenNumber {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if(isPrime(num)){
			System.out.println(num+" is a prime number");
		}else{
			System.out.println(num+" is not a prime number");
		}
		
	}
	
	public static boolean isPrime(int num){
		if(num==0 && num==1){
			return false;
		}else if(num==2){
			return true;
		}else{
			for(int i=2; i<(num); i++){
				if(num%i==0){
					return false;
				}
			}
		}
		return true;
	}
}
