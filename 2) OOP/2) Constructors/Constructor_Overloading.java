class Calculator {

    Calculator() {
        System.out.println("No arguments");
    }

    Calculator(int a) {
        System.out.println("One argument: " + a);
    }

    Calculator(int a, int b) {
        System.out.println("Two arguments: " + (a + b));
    }
}
public class Constructor_Overloading{
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(10);
        Calculator c3 = new Calculator(10, 20);
    }
}