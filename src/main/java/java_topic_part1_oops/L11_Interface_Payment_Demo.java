package java_topic_part1_oops;

public class L11_Interface_Payment_Demo {
    public static void main(String[] args) {

        L10_Interface_Payment obj = new CashPayment();
        obj.pay();

        L10_Interface_Payment obj1 = new CreditCardPayment();
        obj1.pay();
    }
}
