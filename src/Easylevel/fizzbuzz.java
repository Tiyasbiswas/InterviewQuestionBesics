package Easylevel;

public class fizzbuzz {

	public static void checkNum(int n) {
		
		for ( int i=1;i<=n;i++) {
			if ((i%15)==0) {
				System.out.println("FIZZBUZZ");
			}
			else if ((i %3)==0) {
				System.out.println("FIZZ");
			}
			else if ((i %5)==0) {
				System.out.println("BUZZ");
			}
			else {
				System.out.println(i);

			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int num=15;
		
        checkNum(num);	
}

}
