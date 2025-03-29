package java_topic_part1;

public class L5_AccessModifier {
    public static void main(String[] args) {

        //private < default < protected < public

        //private : can be accessed only within a class.
        //default : can be accessed only within the package.
        //protected : can be accessed within package + also the class where it has inherited.
        //public : can be accessed from anywhere.

        Person p1 = new Person("Bishnu",25,"India");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getLocation());

        System.out.println(p1);

        Person p2 = new Person("Xyz",26,"Japan");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getLocation());

        System.out.println(p2);



    }
}

class Person {
    private String name;
    private int age;
    private String location;

    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
