// Super with Parent Class Method

// Create a Bank class with a method getInterestRate(). Create an SBI class that overrides this method. 
// Use super to call the parent class method before displaying the SBI-specific interest rate.

class Bank {

    void getInterestRate(){
        System.out.println("hi");
    }
}

class SBI extends Bank {

    @Override

    void getInterestRate() {

        super.getInterestRate("Hello");

    }
}

public class Super_with_Parant_Class_Method {
    public static void main {

        SBI s1 = new SBI();

        s1.getInterestRate();
    }
}