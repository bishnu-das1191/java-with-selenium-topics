package org.example;

import java.util.Arrays;

public class L4_ArrayTest {
    public static void main(String[] args) {
/*
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


        */

        int[] arr = {2,4,1,0,4,7,4,3};

       /* for(int value : arr){
            System.out.print(value+" ");
        }*/

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] numArr1 = {2,5,1,8};
        int[] numArr2 = {2,5,1,8};
        System.out.println(Arrays.equals(numArr1,numArr2));

        int[] ar = new int[50];
        System.out.println("Before Filling Elements");
        System.out.println(Arrays.toString(ar));
        Arrays.fill(ar,4);
        System.out.println("After Filling Elements");
        System.out.println(Arrays.toString(ar));

        int[] ar11 = new int[3];  // [0,0,0]
        ar11[0] = 2;
        ar11[1] = 5;
        ar11[2] = 8;



        // 2D array
        int[][] arr2;
        int[][] ar2d = new int[3][3];

        int[][] a2dArr = { {1,2,3}, {5,6,7}, {8,4,0} };

        for(int[] outer : a2dArr){
            for(int value : outer){
                System.out.print(value+" ");
            }
            System.out.println();
        }

        //print 2d array elements using indexed based for loop

        System.out.println(Arrays.deepToString(a2dArr));
        System.out.println();

    }
}
