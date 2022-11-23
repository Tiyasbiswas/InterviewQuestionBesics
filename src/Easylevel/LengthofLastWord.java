package Easylevel;

import java.util.Scanner;

public class LengthofLastWord {
    public static int findlastWorldLength(String str){
        int worldlen = 0;
        String str1=str.trim();
        for(int i=0;i<str1.length();i++){
            if (str1.charAt(i) == ' ')
                worldlen = 0;
            else
                worldlen++;
        }

     return worldlen;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str= sc.nextLine();
        System.out.println(findlastWorldLength(str));

    }
}
