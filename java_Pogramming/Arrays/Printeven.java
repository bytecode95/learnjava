package Arrays;

public class Printeven {
    public static void main(String[] args){
        int[] num = {23, 45, 47, 33, 78, 56, 97};
        for(int i=0; i< num.length; i++){
            if(i%2==0){
                continue;
            }else{
                System.out.println(num[i]);
            }
        }
    }
}
