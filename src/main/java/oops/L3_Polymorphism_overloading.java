package oops;

public class L3_Polymorphism_overloading {

    public void performClick(){
        System.out.println("Without any param");
    }


    public void performClick(int val){
        System.out.println("With 1 param");
    }


    public void performClick(int val1, int val2){
        System.out.println("With 2 params");
    }


    public void performClick(String str1, String str2){
        System.out.println("With 2 string params");
    }

    public void performClick(int val1, String val2){
        System.out.println("With 1 int and 1 string param");
    }

    public void performClick(String val1, int val2){
        System.out.println("With 1 string and 1 int param");
    }

    // not possible to overload a method by changing the access modifier
   /* private void performClick(String val1, int val2){
        System.out.println("With 1 string and 1 int param");
    }*/


    // not possible to overload a method by changing the return type of the method
    /*public int performClick(String val1, int val2){
        System.out.println("With 1 string and 1 int param");
        return 0;
    }*/



}

class DriverTest {
    public static void main(String[] args) {

        L3_Polymorphism_overloading obj = new L3_Polymorphism_overloading();
        obj.performClick();
        obj.performClick(10);
        obj.performClick("Hello",07);
        System.out.println(1);
        System.out.println("World");



    }
}
