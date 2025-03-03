package coding_programs;

public class Q4_SumOfDigits {
    public static void main(String[] args) {

        int num = 12345;

        int sum = 0;
        while(num !=0){
            int ld = num % 10;
            sum = sum + ld;  // sum += ld
            num= num/10;
        }
        System.out.println(sum);
    }
}
