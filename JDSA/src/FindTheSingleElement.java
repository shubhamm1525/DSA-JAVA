package JDSA.src;

/*
Striver A-Z : https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
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
    //Brute Approach:
    public static int getSingleElement(int []arr){
        // Loop through all elements from the array
        for (int i = 0; i < arr.length; i++) {
            // Select 1st element arr[i] = 1;
            int num  = arr[i];
            int counter = 0;
            //again loop through the same elements in array
            for (int j = 0; j < arr.length; j++) {
                //compare if arr[i] = 1 and arr[j] = 1 are equal if yes increase counter by 1
                //means if a number is repeated for that number counter will be 2
                //here for "1" counter will be 2 for "2" counter will be 1
                if (arr[j] == num) {
                    counter ++;
                }
            }
            //hence when arr[i] == 2, counter will be 1 and the answer will be "2"
            if (counter == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
