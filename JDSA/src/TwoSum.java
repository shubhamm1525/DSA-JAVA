package JDSA.src;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;


/*
Striver A-Z Link : https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
Problem Statement: Given an array of integers arr[] and an integer target.
1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
 */
public class TwoSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String result = readMethod(n,arr,target);
        System.out.println(result);
        String result2 = twoSumMethod(n,arr,target);
        System.out.println(result2);
    }

    /*
LINK : https://www.codingninjas.com/studio/problems/reading_6845742?leftPanelTabValue=PROBLEM
Problem statement
Sam want to read exactly ‘TARGET’ number of pages.

He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

Example:
Input: ‘N’ = 5, ‘TARGET’ = 5
‘BOOK’ = [4, 1, 2, 3, 1]

Output: YES
Explanation:
Sam can buy 4 pages book and 1 page book.

 */
    public static String readMethod(int n, int []book, int target){
        // Write your code here.
        String result = "NO";
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (book[i] + book[j] == target) {
                    result = "YES";
                    return result;
                }
            }
        }
        return result;
    }

    //Optimized Approach(using two-pointer):
        public static String twoSumMethod(int n, int []arr, int target) {
            Arrays.sort(arr);
            int left = 0;
            int right = n-1;
            while (left<right){
                int sum = arr[left] + arr[right];
                    if (sum == target){
                        return "YES";
                    } else if (sum < target) {
                        left ++;
                    }else {
                        right --;
                    }
            }
            return "NO";
            }
}



