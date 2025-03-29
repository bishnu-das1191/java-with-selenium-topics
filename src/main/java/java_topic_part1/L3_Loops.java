package java_topic_part1;

public class L3_Loops {
    public static void main(String[] args) {

        // types of loops : while, do-while, for, for each

        // while loop
        // print numbers from 1 to 20;

       /* while(condition){
            body/ logic
        }*/

        // print numbers from 1 to 20;
        /*int i = 1;
        while(i<=20){
            System.out.print(i+" ");
            i++;
        }*/

        // print numbers from 20 to 1;
      /*  int i = 20;
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }*/

        // for loop

      /*  for(int i=0; i<10; i++){
            System.out.print(i+" ");
        }
        */


        // do while
       /* int l = 1;
        do{
            System.out.println(l+" ");
            l++;
        }while (l<=10);*/


       /* int i = 1;
        do{
            System.out.println(i+" ");
            i++;
        }while (i>=10);*/


        // break statement
       /* for(int i=0; i<=10; i++){
            if(i == 5) break;
            System.out.print(i+" ");
        }*/

        // use of continue keyword
        for(int i =1; i<=10; i++){
            if(i == 5) continue;
            System.out.print(i+" ");
        }




    }
}
