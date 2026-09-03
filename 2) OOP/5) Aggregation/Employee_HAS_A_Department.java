


class Department {
    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;

    }
}

class Employee {

    Department depart;
    String empName;
    int salary;

    Employee(Department depart, String empName, int salary) {

        this.depart = depart;
        this.empName = empName;
        this.salary = salary;

    }

    void desk() {

        System.out.println("Employee Department Name: " + depart.departmentName);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Employee_HAS_A_Department {
    public static void main(String [] args) {

        Department d1 = new Department("HR");                                                               

        Employee e1 = new Employee(d1 ,"Ani", 86000);

      

        e1.desk();
    }
}