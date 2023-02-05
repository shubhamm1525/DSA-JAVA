import java.util.Arrays;

/**
 * GFG : https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&curated[]=1&sortBy=submissions
 */
public class MissingNumber {

    public static void main(String[] args) {
       int[] arr = { 1, 2, 4, 5, 6 };
       findMissingNumber(arr);
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int sum = n*(n+1)/2;
        System.out.println("SUM IS :: "+ sum);
        Arrays.sort(arr);
        int sum2 = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
            result = sum2 - sum;
        }
        return result;
    }
}
