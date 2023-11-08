//ceiling of a number in an array --smallest number of greater than or equal to target
//foolring of number in an array -- greater number of smaller than or equal
//if you see sorted array try applying binary serach
public class BinarySearch1 {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 14;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int middle;
       //if target is smaller than arr[0](smallest number)
       if(target<arr[0]){
            return -1;
       }
        while(start<=end){
            middle = start + (end-start)/2;
            if(target==arr[middle]){
                return middle;
            }else if(target<arr[middle]){
                end = middle - 1;
            }else if(target>arr[middle]){
                start = middle + 1;
            }
        }
        return start;
        //return end; --- for ceiling case
    }
}
