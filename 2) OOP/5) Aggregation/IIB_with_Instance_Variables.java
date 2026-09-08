// IIB with Instance Variables

// Create a BankAccount class containing:
// - accountNumber
// - balance

// Use an instance initializer block to set the initial balance to 1000.

// Create two objects and display their balances.

class BankAccount 
{
    int accountNumber;
    double balance;

    {
        balance = 1000;
    }
}

public class IIB_with_Instance_Variables 
{
    public static void main(String [] args) 
    {

        BankAccount b1 = new BankAccount();
        b1.accountNumber = 101;

        BankAccount b2 = new BankAccount();
        b2.accountNumber = 102;

        System.out.println("Account Balance 1 : " + b1.balance);
        System.out.println("Account Balance 2 : " + b2.balance);

    }
}