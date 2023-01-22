public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,25,56};
        int target = 12;
        int result = searchBinary(arr,target);
        System.out.println(result);
    }

    public static int searchBinary(int[] args,int target){
        System.out.println(args);
        int start = 0;
        int end = args.length - 1;


        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < args[mid]){
                end  = mid - 1;
            } else if (target > args[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
