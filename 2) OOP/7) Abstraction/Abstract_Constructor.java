abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

class Abstract_Constructor {
    public static void main(String [] args) {

        Dog d = new Dog();

        d.sound();
    }
}