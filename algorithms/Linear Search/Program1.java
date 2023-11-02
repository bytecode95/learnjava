public class Program1 {
    public static void main(String[] args){
        int a = 30;
        int[] nums = {23, 45, 67, 45, 39, 75, 30, 40, 28, 49};

        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==a){
                System.out.println("element is at position: "+(i));
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element is not found!");
        }
    }
}
