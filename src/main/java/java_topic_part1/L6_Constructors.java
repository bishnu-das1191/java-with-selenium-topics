package java_topic_part1;

public class L6_Constructors {
    public static void main(String[] args) {

        Loan loan2 = new Loan(12345,"XYZ",1000000);
        System.out.println(loan2);
    }
}

class Loan {

    private int accountNum;
    private String accountHolderName;
    private int amount;

    // no parameter constructor
    public Loan() {
        System.out.println("From No Parameter Constructor.");
    }

    public Loan(int accountNum, String accountHolderName) {
        this();
        System.out.println("From 2 Parameter Constructor.");

    }

    // parameterized constructor
    public Loan(int accountNum, String accountHolderName, int amount) {
        this(accountNum,accountHolderName);
        this.accountNum = accountNum;
        this.accountHolderName = accountHolderName;
        this.amount = amount;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan {" +
                "accountNum=" + accountNum +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
