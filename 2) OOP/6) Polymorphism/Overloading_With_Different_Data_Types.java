class Calculator {

    void show(int number) {
        System.out.println("Integer: " + number);
    }

    void show(double number){
        System.out.println("Double: " + number);
    }

    void show(String name) {
        System.out.println("String: " + name);
    }
}

public class Overloading_With_Different_Data_Types {
    public static void main(String [] args) {
        Calculator c1 = new Calculator();

        c1.show(15);
        c1.show(42.059);
        c1.show("Ani");
    }
}