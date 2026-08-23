
// Multilevel Inheritance

// Grandparent → Parent → Child.

class Animal{
    void eat(){
        System.out.println("animal eating");
    }
}
class Dog extends Animal{
    void bone(){
        System.out.println("Dog eat boan");
    }
}
class Cat extends Dog{
    void milk(){
        System.out.println("cat like a fish");
    }
}
public class Multilevel_Inheritance{
    public static void main(String [] args){
        Cat c1 = new Cat();

        c1.eat();
        c1.bone();
        c1.milk();
        
    }
}