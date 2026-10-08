Same class + same method name + different parameters.

class Calculator {

    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class Method_Overloading {
    public static void main(String [] args) {
        Calculator c1 = new Calculator();

        c1.add(5,5);
        c1.add(5.0,5.2);

    }
}