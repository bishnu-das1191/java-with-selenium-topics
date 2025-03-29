package java_topic_part1_oops;

public class L8_AbstractionDemo {
    public static void main(String[] args) {

        L7_Abstraction_Contractor contractor = new L7_Abstraction_Contractor("contractor",10,10);

        L6_Abstraction_FullTimeEmployee fte = new L6_Abstraction_FullTimeEmployee("FTE",10);

        System.out.println(contractor.calculateSalary());
        System.out.println(fte.calculateSalary());
    }
}
