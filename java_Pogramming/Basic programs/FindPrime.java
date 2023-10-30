//find prime numbers below 50

public class FindPrime {
    public static void main(String[] args){
        System.out.print(2);
        for(int i=2; i<50; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }else{
            for(int i=2; i<Math.sqrt(num); i++){
                if(num%2==0){
                    return false;
                }
            }
            
        }
        return true;
    }



}
