package Easylevel;

import java.util.Scanner;

public class Maximum69Number {

    public static int checkMaximum69Number(int num){
        char[] charNum = String.valueOf(num).toCharArray();
        for(int i=0;i<charNum.length;i++){
            if(charNum[i] =='6'){
                charNum[i] ='9';
             break;
            }
        }
        return Integer.valueOf(String.valueOf(charNum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int num= sc.nextInt();
         System.out.println(checkMaximum69Number(num));
    }
}
