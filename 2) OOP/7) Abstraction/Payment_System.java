abstract class Payment {

    abstract void pay(double amount);

    void paymentSuccess() {
        System.out.println("Payment Successful");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI");
    }
}

class CreditCard extends Payment {

    void pay(double amount) {
        System.out.println("Paid $" + amount + "using Credit Card");
    }
}
class Payment_System {
    public static void main(String [] args){

        UPI upi = new UPI();
        upi.pay(1000);
        upi.paymentSuccess();

        CreditCard card = new CreditCard();
        card.pay(2000);
        card.paymentSuccess();
    }
}
