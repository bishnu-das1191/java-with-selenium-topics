package oops;

public class L7_Abstraction_Contractor  extends L5_Abstraction_Employee{

    private int workingHours;

    public L7_Abstraction_Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}
