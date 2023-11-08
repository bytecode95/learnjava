package BubbleSort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int[] nums = {5, 2, 8, 7, 1};
        sorting(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sorting(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]= temp;
                }
            }
        }
    }
}
