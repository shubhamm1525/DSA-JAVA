package JDSA.src;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,0,2};
        sort012(arr);
    }

    //Striver A-Z Link : https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/
    //Que Link : https://www.codingninjas.com/studio/problems/631055?topList=striver-sde-sheet-problems&leftPanelTabValue=PROBLEM
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low = 0;
        int mid = 0;
        int high = arr.length -1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }else if (arr[mid] == 1) {
                mid ++;
            } else if(arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high --;
            }

        }
    }
}
