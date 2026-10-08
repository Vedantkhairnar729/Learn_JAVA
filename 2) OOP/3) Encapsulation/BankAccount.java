class BankAccount {

    private int accNo;
    private double balance;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String [] args) {

        BankAccount b = new BankAccount();

        b.setAccNo(260101);
        b.setBalance(50000.00);

        System.out.println("Account Number: " + b.getAccNo());
        System.out.println("Balance: " + b.getBalance());

    }

}