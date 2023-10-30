public class CopyArray {
    public static void main(String[] args){
        int[] nums = {25, 36, 75, 39, 45};
        int[] ans = new int[nums.length];

        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i];
        }
    }
}
