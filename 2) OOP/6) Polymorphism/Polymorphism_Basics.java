Polymorphism = One name, many forms.

class Calculator {

    void add() {
        System.out.println("No Argument");
    }

    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}

public class Polymorphism_Basics {
    public static void main(String [] args) {
        
        Calculator c1 = new Calculator();

        c1.add();
        c1.add(5,5);
        c1.add(5,5,5);

    }
}

/*

                 Polymorphism
                      │
          ┌───────────┴───────────┐
          ↓                       ↓
   Compile-Time              Runtime
   Polymorphism              Polymorphism
          ↓                       ↓
 Method Overloading        Method Overriding