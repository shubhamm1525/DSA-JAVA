//Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
/*
* Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
*  */

import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;

public class JavaStrings {
    public static void main(String[] args) {
        myStringMethod("pqr.mno");
    }

    public static String myStringMethod(String S){
        String[] splitedString = S.split("\\.");
        String newStr = "";
        for(Integer i = splitedString.length - 1; i >= 0; i--){
            if(i!=0){
                newStr = newStr + splitedString[i] + '.';
            }else {
                newStr = newStr + splitedString[i];
            }
        }
        return newStr;
    }
}
