class Setter_With_Validation {
    
    private double balance;

    public void setBalance(double balance) {
  

        if(balance >= 0) {
            this.balance = balance;
        }

        else {
            System.out.println("Invalid Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String [] args) {

        Setter_With_Validation sv = new Setter_With_Validation();

        sv.setBalance(500000);

        System.out.println("Balance: " + sv.getBalance());
    }

}