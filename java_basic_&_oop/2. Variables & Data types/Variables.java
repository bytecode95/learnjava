//Three Varbles in java 1. local variables 2. instance variables 3. Static variables
public class Variables 
{  
    static int m=100;//static variable  
    void method()  
    {    
        int n =90;//local variable 
        System.out.println(n);   
    }  
    public static void main(String args[])  
    {  
        int data = 50;//instance variable   
        System.out.println(data);
        System.out.println(m);
    }  
}//end of class