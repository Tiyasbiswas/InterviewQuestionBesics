package Easylevel;


public class FindTheDifference {
    public  static char checkTheDiffrence(String s1, String s2) {
        String smallStr;
        String largeStr;
        if(s1.length() > s2.length()) {
            smallStr = s2;
            largeStr = s1;
        } else {
            smallStr = s1;
            largeStr = s2;
        }

        int smallStrCodeTotal = 0;
        int largeStrCodeTotal = 0;
        int i = 0;

        // Add character codes of both the strings
        for(; i < smallStr.length(); i++) {
            smallStrCodeTotal += smallStr.charAt(i);
            largeStrCodeTotal += largeStr.charAt(i);
        }

        // Add last character code of large String.
        largeStrCodeTotal += largeStr.charAt(i);

        // Minus the character code of smaller string from
        // the character code of large string.
        // The result will be the extra character code.
        int intChar = largeStrCodeTotal - smallStrCodeTotal;
        return (char)intChar;

    }
    public static void main(String[] args) {


        System.out.println("Enter the Strings:");
        String s1="abcde";
        String s2="abcd";
        System.out.println(checkTheDiffrence(s1,s2));
    }
}
