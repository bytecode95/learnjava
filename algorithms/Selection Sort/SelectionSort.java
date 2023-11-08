import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {-5,-2, 4, 3, 6, 9, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i=0; i< arr.length; i++){
            //find max in an array and swap with corerct index
            int last = arr.length-i-1;
            int maxIndex = getMaxindex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
 
    }

    private static int getMaxindex(int[] arr, int start, int end){
        int max =start;
        for(int i=start; i<= end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
