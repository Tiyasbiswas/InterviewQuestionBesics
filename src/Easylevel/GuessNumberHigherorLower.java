package Easylevel;


public class GuessNumberHigherorLower {

    public static int checkNumberHigherorLower( int num){
        int low = 1, high = num;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int pickednum = 2;//guess(mid);
            if (pickednum == 0) {
                return mid;
            }
            else if (pickednum == 1) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        int num=10;
        System.out.println(num);
        System.out.println( checkNumberHigherorLower(num));

    }
}
