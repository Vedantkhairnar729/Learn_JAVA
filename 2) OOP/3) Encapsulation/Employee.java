class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String [] args) {

        Employee e = new Employee();

        e.setName("Ani");
        e.setSalary(870000.00);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }

}