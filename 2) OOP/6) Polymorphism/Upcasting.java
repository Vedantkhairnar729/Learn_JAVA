Parent reference → Child object.

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override

    void sound() {
        System.out.println("Dog Bark");
    }
}

public class Upcasting {
    public static void main(String [] args) {

        Animal d1 = new Dog();

        d1.sound();
    }
}

/*
Animal reference
      ↓
   Dog object


This is very important for runtime polymorphism.