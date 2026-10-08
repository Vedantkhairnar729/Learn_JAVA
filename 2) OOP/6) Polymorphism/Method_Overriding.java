// A child class provides its own implementation of a parent method.

class Animal {

    void sound() {
        System.out.println("Animals Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Method_Overriding {
    public static void main(String [] args) {
        Dog d1 = new Dog();

        d1.sound();
    }
}