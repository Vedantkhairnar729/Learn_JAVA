class Animal{
    void sound(){
        System.out.println("Animal makes Sound");
    }
}
class Dog extends Animal{
    
    //Method Overriding

    //Child provides its own implementation of the parent's method.
    
    @Override /////////////////////////

    void sound(){
        System.out.println("Dog makes Sound");
    }
}

public class Method_Overriding{
    public static void main(String [] args){
        Dog d1 = new Dog();

        d1.sound();
    }
}

// Output 

// Dog makes Sound
//======================================================

// Parent method
//       ↓
// Child changes implementation
//       ↓
// Method Overriding