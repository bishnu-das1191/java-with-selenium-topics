package coding_programs;

public class Q2_ReverseNumber {
    public static void main(String[] args) {

        // reverse a number
        int num = 125;
        int rev = 0;
        while(num !=0){
            int ld = num % 10;
            rev = rev*10 + ld;
            num = num/10;
        }
        System.out.println(rev);
    }
}
