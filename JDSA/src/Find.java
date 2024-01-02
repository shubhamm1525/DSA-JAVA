package JDSA.src;

public class Find {
    public static void main(String[] args) {
        int arr[] ={1,2,3,8,10,20};
        int target = 21;
        int index = 0;
        System.out.println(isTargetFound(arr,target,index));
    }
    private static boolean isTargetFound(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || isTargetFound(arr,target,index + 1) ;
    }
}
