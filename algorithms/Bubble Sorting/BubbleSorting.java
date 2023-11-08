import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args){
        int[] nums = {2,5,3,8,1};
       bubbleSort(nums);
       System.out.println(Arrays.toString(nums));

    }  

    static void bubbleSort(int[] arr){
        boolean swaped = false;
        //run the steps n-1 steps
        for(int i=0; i<arr.length; i++){
            //for each step max items will come at thelast respective index
            for(int j=1; j<arr.length-i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
            break;
            }
        }
        

    }
}
