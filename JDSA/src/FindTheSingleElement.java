package JDSA.src;

/*
Link : https://www.codingninjas.com/studio/problems/find-the-single-element_6680465
Problem statement
You are given a sorted array 'arr' of positive integers of size 'n'.
It contains each number exactly twice except for one number, which occurs exactly once.
Find the number that occurs exactly once.

Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.
 */
public class FindTheSingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int result = getSingleElement(arr);
        System.out.println("Result : " + result);
    }

    public static int getSingleElement(int []arr){
        // Write your code here.
        for (int i = 0; i < arr.length; i++) {
            int num  = arr[i];
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    counter ++;
                }
            }
            if (counter == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
