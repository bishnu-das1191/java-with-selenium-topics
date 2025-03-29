package java_topic_part1_oops;

public abstract class L12_Super_Constructor {

    private int rollNo;
    private String name;
    String collegeName = "ABC College";

    public L12_Super_Constructor(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void getNameAndRoll(){
        System.out.println("Name = "+name+". Roll No. = "+rollNo);
    }

    public void display(){
        System.out.println("Display Method");
    }

    public static void getTaskName(){
        System.out.println("Task Name Method");
    }
}

class Child extends L12_Super_Constructor {

    public Child(int rollNo, String name) {
        super(rollNo, name);
    }

    public void getName(){
        super.getNameAndRoll();
        super.display();
        System.out.println(super.collegeName);
    }

}

class Driver {
    public static void main(String[] args) {

        Child obj = new Child(1,"xyz");
        obj.getName();
    }
}
