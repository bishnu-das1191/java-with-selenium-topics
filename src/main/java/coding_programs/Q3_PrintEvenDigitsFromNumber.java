package coding_programs;

public class Q3_PrintEvenDigitsFromNumber {
    public static void main(String[] args) {
        //print only even numbers from given input
        int input = 3174308;
        while(input !=0){
            int lastDigit = input % 10;
            if(lastDigit % 2 == 0) System.out.println(lastDigit);
            input = input/10;
        }
    }
}
