public class Frequency {
    public static void main(String[] args){
        int[] nums = {2,4,7,3,8,5,1,1,5,4,4,4,7,8};
     
        int[] freq = new int[nums.length];
        int visited = -1;
        for(int i=0; i<nums.length; i++){
            int count = 1;
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                    //to avoid counting same elements
                    freq[j] = visited;
                }
            }
            if(freq[i]!=visited){
                freq[i] = count;
            }
            
        }
        
        
    }
}
