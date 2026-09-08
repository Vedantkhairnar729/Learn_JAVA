// IIB and Constructor Order

// Create a class containing:
// - One instance variable
// - One instance initializer block
// - One constructor

// Display messages from each and determine the execution order.

class IIB {
    int age = 22;

    {
        System.out.println("Hi");
    }

    IIB(){
        System.out.println("Hello");
    }
}

public class IIB_and_Constructor_Order {
    public static void main(String [] args) {

        IIB b1 = new IIB();
    }
}