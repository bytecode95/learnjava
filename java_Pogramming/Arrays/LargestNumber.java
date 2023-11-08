public class LargestNumber {
    public static void main(String[] args){
        int[] nums = {2,-3,5,8,6,20,-5,25};

        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
