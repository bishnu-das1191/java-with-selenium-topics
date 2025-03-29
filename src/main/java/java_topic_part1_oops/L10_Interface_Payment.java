package java_topic_part1_oops;

public interface L10_Interface_Payment {

    void pay();
}

class CashPayment implements L10_Interface_Payment {

    @Override
    public void pay() {
        System.out.println("This is Cash Payment");
    }
}

class CreditCardPayment implements L10_Interface_Payment{

    @Override
    public void pay() {
        System.out.println("This is Credit card payment");
    }
}
