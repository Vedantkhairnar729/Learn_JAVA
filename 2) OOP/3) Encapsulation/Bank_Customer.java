import java.util.Scanner;

class Bank_Customer {

    private int accNo;
    private String custName;
    private int balance;

    void setAccNo(int accNo) {
        if (accNo > 0 ) {
            this.accNo = accNo;
        }
        else {
            System.out.println("Invalid Account Number");
        }
    }

    int getAccNo() {
        return accNo;
    }

    void setCustName(String custName) {
        if (custName != null && !custName.trim().isEmpty()) {
            this.custName = custName;
        }
        else {
            System.out.println("Customer Name Can Not be Empty ");
        }
    }

    String getCustName() {
        return custName;
    }

    void setBalance(int balance) {
        if(balance > 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Balance cannot be negative");
        }
    }

    int getBalance(){
        return balance;
    }

    public static void main(String [] args) {

        Scanner add = new Scanner(System.in);

        Bank_Customer bc = new Bank_Customer();

        System.out.print("Enter Account Number: ");
        int accNo = add.nextInt();

        add.nextLine();

        System.out.print("Enter Customer Name: ");
        String custName = add.nextLine();

        System.out.print("Enter Balance: ");
        int balance = add.nextInt();


        bc.setAccNo(accNo);
        bc.setCustName(custName);
        bc.setBalance(balance);

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + bc.getAccNo());
        System.out.println("Customer Name: " + bc.getCustName());
        System.out.println("Balance: " + bc.getBalance());

    }




}