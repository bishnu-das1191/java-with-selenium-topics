package org.example;

public class L4_ArrayTest {
    public static void main(String[] args) {

        // 1D Array

        int[] arr; // declaration

        int[] ar = new int[5];  // instantiation

        int[] a = new int[5];   // initialisation
        a[0] = 2;
        a[1] = 4;
        a[2] = 0;
        a[3] = 9;
        a[4] = 3;
        System.out.println(a.length);

        //to get the last indexed value from array
        System.out.println(a[a.length-1]); //3

        int[] myArr = {2,5,1,9,7,5,4}; //declaration, instantiation, initialisation
        System.out.println(myArr.length);  //7
        System.out.println(myArr[myArr.length-1]); //4
        System.out.println(myArr[myArr.length-2]); //5


        // print all the values from array using foreach loop
        for(int value : myArr){
            System.out.print(value+" ");
        }

        System.out.println();
        // print all the values from array using for loop
        for(int i=0; i<myArr.length; i++){
            System.out.print(myArr[i]+" ");
        }

        // print all the values from array using while loop

        // print all the values from array using do while loop











    }
}
