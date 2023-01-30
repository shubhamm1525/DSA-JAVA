import java.util.Arrays;

//LC : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class CompareTwoStringArrays {
    public static void main(String[] args) {
        int N = 5;
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean result = arrayStringsAreEqual(word1,word2);
        System.out.println(result);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 = "";
        String result2 = "";

        for (int i = 0; i < word1.length; i++) {
            result1 = result1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            result2 = result2 + word2[i];
        }

        return result1.equals(result2);

    }
}
