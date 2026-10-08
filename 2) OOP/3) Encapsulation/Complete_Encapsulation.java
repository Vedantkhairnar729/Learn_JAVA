class Complete_Encapsulation {

    private String costName;
    private long accNo;
    private double balance;

    Complete_Encapsulation(String costName, long accNo, double balance) {

        this.costName = costName;
        this.accNo = accNo;

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public String getCostName(){
        return costName;
    }

    public long getAccNo(){
        return accNo;
    }

    public double getBalance(){
        return balance;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
        }

        else {
            System.out.println("invalid amount");
        }
    }

    public void withdraw(double amount) {
        
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        else{
            System.out.println("Invalid Withdrawal");
        }
    }

    public void display(){

        System.out.println("Customer: " + costName);
        System.out.println("Account: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public static void main(String [] args) {

        Complete_Encapsulation ce = new Complete_Encapsulation("Vedant", 147258369, 500000);

        ce.deposit(10000);
        ce.withdraw(5000);

        ce.display();

    }
}