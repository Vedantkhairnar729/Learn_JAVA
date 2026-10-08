
// Encapsulation = Wrapping data and methods together inside a class.

class Encapsulation_Basics {

    private String name = "Avi";
    private int age = 22;

    void desk() {
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }



    public static void main(String [] args) {

        Encapsulation_Basics s = new Encapsulation_Basics();

        s.desk();
        

    }
}

