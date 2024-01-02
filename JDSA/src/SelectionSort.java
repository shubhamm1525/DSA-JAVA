package JDSA.src;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {

            int minInt  = i;

            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minInt]){
                    minInt = j;
                }
            }
            int tempVar = arr[i];
            arr[i] = arr[minInt];
            arr[minInt] = tempVar;

        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
