package coding_programs;

public class L1_PrintDigits {
    public static void main(String[] args) {

        /**
         *  Extract and Print all Digits 1 by 1
         */

        int num = 328;

        while(num>0){
            int lastDigit = num % 10;
            System.out.println(lastDigit);
            num = num/10;
        }



    }
}
