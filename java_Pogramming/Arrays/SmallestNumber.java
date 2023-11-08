public class SmallestNumber {
    public static void main(String[] args){
        int[] nums = {2,5,7,3,-6,15,20,-10};
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println(min);
    }
}
