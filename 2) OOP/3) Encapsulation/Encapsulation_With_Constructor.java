class Encapsulation_With_Constructor {

    private String name;
    private double salary;

    Encapsulation_With_Constructor(String name, double salary) {

        this.name = name;
        this.salary = salary;     
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String [] args) {

        Encapsulation_With_Constructor ec = new Encapsulation_With_Constructor("Ani", 55200.00);

        System.out.println("Name: " + ec.getName());
        System.out.println("Salary: " + ec.getSalary());
    }


}