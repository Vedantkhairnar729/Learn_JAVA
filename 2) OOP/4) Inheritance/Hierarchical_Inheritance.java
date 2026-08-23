
// Hierarchical Inheritance

// One parent → Multiple children.


class Animal{
    void eat(){
        System.out.println("Animals are eating");
    }
}
class Dog extends Animal{
    void bone(){
        System.out.println("Dog Eat Bone");
    }
}
class Cat extends Animal{
    void fish(){
        System.out.println("Cat Eat Fish");
    }
}

public class Hierarchical_Inheritance{
    public static void main(String [] args){
      Dog d1 = new Dog();
      Cat c1 = new Cat();

    d1.eat();
    d1.bone();

    c1.eat();
    c1.fish();

    }
}

// Output

// Animals are eating
// Dog Eat Bone
// Animals are eating
// Cat Eat Fish




