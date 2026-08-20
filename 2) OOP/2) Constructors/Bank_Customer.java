class BankCustomer {

    String customerName;
    long accountNumber;
    double balance;

    BankCustomer() {
        customerName = "Unknown";
        accountNumber = 0;
        balance = 0;
    }

    BankCustomer(String customerName, long accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

        if (balance >= 100000) {
            System.out.println("Premium Customer");
        } 
        else if (balance >= 50000) {
            System.out.println("Regular Customer");
        } 
        else {
            System.out.println("Basic Customer");
        }
    }
}
public class Bank_Customer{
    public static void main(String[] args) {

        BankCustomer c1 = new BankCustomer();

        BankCustomer c2 =
            new BankCustomer("Vedant", 123456789, 120000);

        c1.display();

        System.out.println();

        c2.display();
    }
}