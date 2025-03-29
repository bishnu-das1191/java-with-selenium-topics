package java_topic_part1;

public class L8_ExceptionHandling {
    public static void main(String[] args) {

        System.out.println(5/0);
/*

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Please Input Valid Number");
        }
*/
/*
        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }*/

       /* try {
            System.out.println("Hi");
        }catch (RuntimeException e){
            System.out.println("Hello");
        }
*/

     /*
        try {
            System.out.println("Hello1");
        }catch (Exception e) {
            System.out.println("hi");
        }finally {
            System.out.println("Hello2");
        }*/

         /*

        try {
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println("hi");
        } finally {
            System.out.println("Good Bye");
        }
        */


     /*   try {
            System.out.println("Hello");
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println("hi");
        } finally {
            System.out.println("Good Bye");
        }*/

/*
        try {
            System.out.println(5 / 0);
            System.out.println("Hello");
        } finally {
            System.out.println("Good Bye");
        }*/


        // System.exit(0) will terminate the program and finally block will not be executed

      /*  try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println("hi");
            System.exit(0);
        } finally {
            System.out.println("Good Bye");
        }
*/

        /*

        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println("hi");
            System.exit(0);
        } finally {
            System.out.println("Good Bye");
        }*/

        // multiple catch blocks
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("one");
        } catch (RuntimeException e) {
            System.out.println("two");
        } catch (Exception e){
            System.out.println("three");
        }


    }
}

class ExceptionTesting {
    public static void main(String[] args) {
        try {
            testThrows();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }

    public static void testThrows() throws ArithmeticException {
        System.out.println("Hello");
        System.out.println(5 / 0);
    }
}

class ThrowException {
    public static void main(String[] args) {

        printMeByPassingString(10);
    }

    private static void printMeByPassingString(int num) {

        try {
            throw new Exception("Your Input is not valid");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class NullPointerExceptionTest {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Pointer Exception");
        }
    }
}
