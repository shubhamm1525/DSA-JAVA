/*
 LEETCODE : https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class Mountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                //We are in ascending part of array, as the first element is greater than the next one
                //so no need to check after mid as its already greater than its next elements
                end  = mid;
            }else {
                //we are in descending part of the array, middle element is less than its next element
                start = mid + 1;
            }
        }
        return start;
    }
}
