package Easylevel;


import java.util.Arrays;

/*Write a function to find the longest common prefix string amongst an array of strings.
        https://leetcode.com/problems/longest-common-prefix/*/
public class LongestCommonPrefix {

    public static String checkLongestCommonPrefix(String[] str) {
        if (str.length == 0) return "";
        // Sort the array
        Arrays.sort(str);
        int length = str[0].length();
        StringBuilder res = new StringBuilder();
        // Comapre the first and the last strings character
        for (int i = 0; i < length; i++) {
            // If the characters match, append the character to the result.
            if (str[0].charAt(i) == str[str.length - 1].charAt(i)) {
                res.append(str[0].charAt(i));
            }
            // Else, stop the comparison.
            else {
                break;
            }
        }
        String result = res.toString();
       return result;
    }


    public static void main(String[] args) {

        String str []= {"flower","flow","flight"} ;
        System.out.println("Longest Common Prefix is :"+checkLongestCommonPrefix(str));
    }
}
