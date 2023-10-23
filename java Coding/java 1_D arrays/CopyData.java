

public class CopyData {
    public static void main(String[] args){
        int[] arr1 = new int[] {25, 65, 89, 45};
        int[] arr2 = new int[arr1.length];
        //copy data
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        //dispaly data
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }


    }
}
