import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {20,30,40,50},
                {25,35,45,55}
        };

        int[] result = search(arr,35);
        System.out.println(Arrays.toString(result));

    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;

        while(r < arr.length && c >= 0){
            //Here we are checking if the [r][c] element is equalts to our target element then we are returning the
            //row and column index values.
            if(arr[r][c] == target){
                return new int[]{r,c};
            }else if (arr[r][c] < target){
                //Here if the target element is less than r,c element which means that the target does not lie in this row
                r++;
            }else {
                //finally here we are excluding the column directly as the elements in that column is greater than
                //target so we can remove this column for searching target.
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
