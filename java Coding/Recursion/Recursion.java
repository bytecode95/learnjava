

public class Recursion {
    public static void main(String[] args) {
        //        Scanner sc = new Scanner(System.in);
        //        System.out.print("Enter number: ");
        //        int n = sc.nextInt();
        //        fibonacchi(n);
                int ans = fibo(4);
                System.out.println(fibo(ans));
        
            }
            //without recursion
            public static void fibonacchi(int n){
                int a1 = 0;
                int a2 = 1;
                int a3;
                System.out.print(a1+" "+a2);
                for(int i=1; i<n; i++){
                    a3 = a1 + a2;
                    System.out.print(" "+a3);
                    a1 = a2;
                    a2 = a3;
                }
            }
        
            //using recursion
            static int fibo(int n){
                //base condition
                if(n<2){
                    return n;
                }
                return fibo(n-1)+ fibo(n-2);
            }
}
