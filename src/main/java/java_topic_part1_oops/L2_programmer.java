package java_topic_part1_oops;

public class L2_programmer extends L1_Employee{

    int bonus = 10000;
}

class TestCls {
    public static void main(String[] args) {

        //IS-A Relationship
        L2_programmer p = new L2_programmer();
        System.out.println("Programmer salary is : "+p.salary);
        System.out.println("Bonus salary is : "+p.bonus);
        System.out.println("Net Salary of Programmer : "+(p.salary + p.bonus));

        //Has-A Relationship
        L1_Employee emp = new L1_Employee();
        emp.printMe();





    }
}
