public class Duplicate {
    public static void main(String[] args){
        int[] num = {2,4,5,3,4,5,2,2,6,7,5,8};

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                }
            }
        }
    }
}
