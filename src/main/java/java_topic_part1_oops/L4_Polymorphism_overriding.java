package java_topic_part1_oops;

public class L4_Polymorphism_overriding {

    int balance = 10000;
    static int marks = 97;

    public void callMe(){
        System.out.println("In Parent 1");
    }

    public void callMe2(){
        System.out.println("In Parent 2");
    }

    public static void printMe(){
        System.out.println("Hi From Static in parent");
    }
}

class Polymorphism_overriding_child extends L4_Polymorphism_overriding{

    int balance = 20000;
    static int marks = 100;

    public void callMe(){
        System.out.println("In Child 1");
    }

    public static void printMe(){
        System.out.println("Hi From Static in child");
    }
}

class PolymorphismDemo {
    public static void main(String[] args) {

        Polymorphism_overriding_child obj = new Polymorphism_overriding_child();
        obj.callMe();

        L4_Polymorphism_overriding obj1 = new Polymorphism_overriding_child();
        obj1.callMe();

       /* Polymorphism_overriding_child obj2 = new L4_Polymorphism_overriding();
        obj2.callMe();*/

        L4_Polymorphism_overriding obj3 = new L4_Polymorphism_overriding();
        obj3.callMe();

        L4_Polymorphism_overriding obj4 = new Polymorphism_overriding_child();
        obj4.printMe();

    }
}
