import java.util.Arrays;

//GFG : https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=1&curated[]=1&sortBy=submissions
public class CompareTwoArrays {
    public static void main(String[] args) {
        int N = 5;
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};
        boolean result = check(A,B,N);
        System.out.println(result);
    }
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N) {
        boolean finalResult = false;
    //here sorting both the arrays using java Arrays function
        Arrays.sort(A);
        Arrays.sort(B);
    //comparing both the arrays if they are equal or not and setting the boolean value accordingly.
        if(Arrays.equals(A,B)){
            finalResult = true;
        }
        return finalResult;
    }
}
