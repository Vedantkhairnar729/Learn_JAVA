class Student {

    // Private variables
    private String name;
    private int age;

    // Setter for name
    public void setName(String name){
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String [] args) {

        Student s = new Student();

        // Set values
        s.setName("Ani");
        s.setAge(22);

        // Get values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}