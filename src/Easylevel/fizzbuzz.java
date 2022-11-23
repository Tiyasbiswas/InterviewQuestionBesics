package Easylevel;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {

	public static void checkNum(int n) {
		
//		for ( int i=1;i<=n;i++) {
//			if ((i%15)==0) {
//				System.out.println("FIZZBUZZ");
//			}
//			else if ((i %3)==0) {
//				System.out.println("FIZZ");
//			}
//			else if ((i %5)==0) {
//				System.out.println("BUZZ");
//			}
//			else {
//				System.out.println(i);
//
//			}
//		}
		
	}
	public static List<String> fizzBuzz(int n) {
		List str= new ArrayList();
		for ( int i=1;i<=n;i++) {
			if ((i%15)==0) {
				str.add("FIZZBUZZ");
			}
			else if ((i %3)==0) {
				str.add("FIZZ");
			}
			else if ((i %5)==0) {
				str.add("BUZZ");
			}
			else {
				str.add(Integer.toString(i));

			}
		}
		return str;
	}


	public static void main(String[] args) {
		int num=15;
		
        checkNum(num);
		System.out.println(fizzBuzz(num));
}

}
