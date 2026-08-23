class parent{
    String name = "Parent";
}
class child extends parent{
    String name = "Child";

    void test(){

    // Super keyword //

    // Used to access the parent class variable, method, or constructor.
    
        System.out.println("Parent : "+ super.name);
        System.out.println("Child : "+ name);
    }
}
public class super_keyword{
    public static void main(String [] args){
        child c1 = new child();

        c1.test();
    }
}