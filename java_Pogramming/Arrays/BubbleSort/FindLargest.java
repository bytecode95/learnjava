package BubbleSort;

import java.util.Arrays;



public class FindLargest {
    public static void main(String[] args){
        int[] arr = {1,2,5,6,3,2};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
        //this can be used to find largest numbers after sorting
    }

    public static void sorting(int[] nums){
        for(int i=0; i<1; i++){
            for(int j=1; j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
