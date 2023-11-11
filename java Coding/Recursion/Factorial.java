public class Factorial {
    public static void main(String[] args) {
        //        int ans = factorial(3);
        //        System.out.println(ans);
        
                int answer = fact(5);
                System.out.println(answer);
            }
            //without recursion
            static int factorial(int n){
                if(n>=0){
                    int total=1;
                    for(int i=1; i<=n; i++){
                        total = total*i;
                    }
                    return total;
                }
                return  -1;
            }
        
            //using recursion
            static int fact(int n){
                if(n<=1){
                    return 1;
                }
        
                return n * fact(n-1);
            }
}
