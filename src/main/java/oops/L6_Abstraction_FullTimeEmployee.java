package oops;

public class L6_Abstraction_FullTimeEmployee extends L5_Abstraction_Employee{

    public L6_Abstraction_FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}
