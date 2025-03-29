package java_topic_part1_oops;

public class L9_Encapsulation {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Ram");
        p1.setAge(25);
        System.out.println("Person name is "+p1.getName()+ " and his/her age is "+p1.getAge());
    }
}

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
