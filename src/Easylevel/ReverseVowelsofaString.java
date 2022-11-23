package Easylevel;

import java.util.Scanner;

public class ReverseVowelsofaString {
  public static boolean checkVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
   public static String reverseVowelsInString(String str) {
       int j =0;
        String vowel="";
         char ch[]=str.toCharArray();
         for(int i=0;i<ch.length;i++){

             if (checkVowel(ch[i])) {
                 j++;
                 vowel += ch[i];
             }
         }
       for (int i = 0; i < ch.length; i++) {
           if (checkVowel(ch[i])) {
               ch[i] = vowel.charAt(--j);
           }
       }

       return String.valueOf(ch);

   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the Input ");
        String str = sc.nextLine();
        System.out.println(reverseVowelsInString(str));

    }
}
