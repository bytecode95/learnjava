class BinarySearch{
    public static void main(String[] args){
        int[] arr = {-10,-3,2,4,6,8,9,11,14,17,19,25,36,48,55};
        int target = 25;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //ans not found return -1;
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            //find middle element
            //int middle = (start+end)/2; might be possible to exceed (start+end) the range of integer in java
            int middle = start+(end-start)/2;

            if(target<arr[middle]){
                //start will not change
                end = middle-1;
            }else if(target>arr[middle]){
                start = middle+1;
            }else{
                //ans found
                return middle;
            }
        }
        //element doesnot exist
        return -1;
    }
}