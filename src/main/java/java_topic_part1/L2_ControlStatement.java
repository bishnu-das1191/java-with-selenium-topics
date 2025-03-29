package java_topic_part1;

public class L2_ControlStatement {
    public static void main(String[] args) {

    /*    Scanner scn = new Scanner(System.in);
        *//*System.out.print("Enter Your Age = ");
        int age = scn.nextInt();

        if(age >= 18 ){
            System.out.println("You can Vote");
        }else{
            System.out.println("Not Eligible for Vote");
        }
*//*
        // Accept String from user
      *//*  System.out.print("Enter Your Name = ");
        String name = scn.next();
        System.out.println("Hello, Welcome to session : "+name);*//*

        // How to read single character from user
       *//* System.out.print("Enter the Character = ");
        char ch = scn.next().charAt(0);
        System.out.println("Hello, The Character You Entered is : "+ch);*//*

        // to read the user input String data
        *//*System.out.print("Enter multiple words = ");
        String result = scn.nextLine();
        System.out.println("Hello, The You Entered the Sentence : "+result);*//*

        // print the last name from user input full name
        *//*System.out.print("Enter First and Last name = ");
        String lastName = scn.nextLine().split(" ")[1];
        System.out.println("Hello, Your Last name is : "+lastName);*//*

        // Ascii code
        int a = 'a';
        System.out.println("a="+a);  //97

        int z = 'z';
        System.out.println("z="+z);  //122

        int A = 'A';
        System.out.println("A="+A);  //65

        int Z = 'Z';
        System.out.println("Z="+Z);  //90

        //Operators
        //truth table
        System.out.println(true && false);  // false
        System.out.println(false && false); // false
        System.out.println(true && true); // true
        System.out.println(false && true); // false

        System.out.println(false || false);  //false
        System.out.println(false || true);   //true
        System.out.println(true || false);   //true
        System.out.println(true || true);   //true

        //conditional operators : >=, <=, ==,!=

        //Ternary Operator
        int res = 10<20 ? 10:20;
        System.out.println(res);

        // Division and Mod operator

        int num1 = 10;
        int num2 = 5;
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);*/

        // if else

       /* int b = 0;
        if(b){
            System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }*/


      /*  boolean b = false;
        if(b == true){
            System.out.println("Me");
        }
*/

        // Switch case flow

        // build a coffee machine
     /*   Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Choice (1-4) : ");
        int choice = scn.nextInt();
        switch (choice){
            case 1:
                System.out.println("Tea");
                break;
            case 2:
                System.out.println("Coffee");
                break;
            case 3:
                System.out.println("Hot Water");
                break;
            case 4:
                System.out.println("Cold Water");
                break;
            default:
                System.out.println("Invalid Choice Selected");
        }
        */

       /* int x = 1;
        switch (x) {
            System.out.println("hello");
        }*/

     /*   int x = 10;
        int y = 20;
        switch (x){
            case 10:
                System.out.println("10");
            case y:
                System.out.println("20");
        }*/


        int x = 10;
        final int y = 20;
        switch (x){
            case 10:
                System.out.println("10");
            case y:
                System.out.println("20");
        }


    }
}


