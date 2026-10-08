class Animal {

    void sound() {
        System.out.println("Animal makes sounds");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        super.sound();

        System.out.println("Dog barks");
    }
}

public class super_with_Overriding {
    public static void main(String [] args) {

        Dog d = new Dog();

        d.sound();
    }
}