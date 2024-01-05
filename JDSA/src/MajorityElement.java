package JDSA.src;
import java.util.*;
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,2,2,7};
        int result = majorityElement(arr);
        System.out.println(result);
        int result2 = majorityElement2(arr);
        System.out.println(result2);
    }

    /*
    STRIVER's A-Z LINK : https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/
    PROBLEM LINK : https://www.codingninjas.com/studio/problems/majority-element_6783241?leftPanelTabValue=PROBLEM
    Brute Force Approach
    Select 1st element and check with whole elements in list if duplicate found increase counter.
    After every elements iteration check if counter is > n/2 return the element
    Time Complexity : O(N2)
    */
    public static int majorityElement(int []v) {
        // Write your code here
        int n = v.length;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < n; j++) {
                if (v[j] == v[i]){
                    counter = counter + 1;
                }
            }
            if (counter > (n/2)){
                return v[i];
            }
        }
        return -1;
    }

    /*
    Better Approach : Use map to store the element as key and the No of time it appears as value by iterating through whole array.
    Iterate through map entries and check if the key's value is greater than n/2 then return the key.
    Time Complexity: O(N*logN) + O(N), where N = size of the given array.

     */
    public static int majorityElement2(int []v) {
        // Write your code here
        int n = v.length;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = myMap.getOrDefault(v[i], 0);
            myMap.put(v[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : myMap.entrySet()) {
            if (it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }


}

