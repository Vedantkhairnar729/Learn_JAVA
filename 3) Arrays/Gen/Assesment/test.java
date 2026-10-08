/*JAVA ARRAY - REAL WORLD PRACTICE QUESTIONS
==========================================

QUESTION 1: Reverse Customer Order IDs
---------------------------------------

A shopping application stores customer order IDs in an integer array.

Example:
int[] orderIds = {101, 102, 103, 104, 105};

Task:
Reverse the order IDs and display them.

Expected Output:
105 104 103 102 101

Condition:
Do not use any built-in array reverse method.

Use a loop and print the elements from the last index to the first index.
class test {
    public static void main(String [] args) {

        int [] order = {101, 102, 103, 104, 105};

        for (int i = order.length -1; i >= 0; i--) {
            System.out.println(order [i] + " ");
        }
    }
}

output:
105 
104 
103 
102 
101 

==================================================

QUESTION 2: Reverse Daily Sales Using Another Array
---------------------------------------------------

A shop stores its daily sales amounts for 5 days.

Example:

Task:
Create another integer array and store the elements of the original
array in reverse order.

Display both arrays.

Expected Output:

Original Sales:
1200 2500 1800 3000 2200

Reversed Sales:
2200 3000 1800 2500 1200
int[] sales = {1200, 2500, 1800, 3000, 2200};

Condition:
Do not directly print the original array in reverse.
Create a second array and store the reversed values in it.

class test {
    public static void main(String [] args) {

        int [] sales = { 101, 102, 103, 104, 105};

        int [] reverseSales = new int [sales.length];

        for (int i = 0; i < sales.length; i++){
            reverseSales[i] = sales[sales.length -1 -i];
        }

        System.out.println("Original Sales: ");

        for (int i = 0; i < sales.length; i++) {
            System.out.println(sales[i] + " ");
        }

        System.out.println();

        System.out.println("Reversed Sales: ");

        for (int i = 0; i < reverseSales.length; i++) {
            System.out.println(reverseSales[i] + " ");
        }
    }
}

output: 

Original Sales: 
101 
102 
103 
104 
105 

Reversed Sales: 
105 
104 
103 
102 
101 

==================================================

QUESTION 3: String Array - Student Names
-----------------------------------------

A school stores the names of students registered for a competition.

Example:
String[] students = {"Amit", "Riya", "Sneha", "Rahul", "Pooja"};

Task:

1. Display all student names.
2. Display the total number of students.
3. Display the names in reverse order.

Expected Output:

Students:
Amit
Riya
Sneha
Rahul
Pooja

Total Students: 5

Students in Reverse:
Pooja
Rahul
Sneha
Riya
Amit

class test {
    public static void main(String [] args) {
        String [] students = {"Avi", "Ani", "Amit", "Rahul"};

        System.out.println("Students:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println();
        System.out.println("Total Student: " + students.length);

        for (int i = students.length -1; i >= 0; i--) {
            System.out.println(students[i]);
        }
    }

}

output:

Students:
Avi
Ani
Amit
Rahul

Total Student: 4
Rahul
Amit
Ani
Avi



==================================================

QUESTION 4: Jagged Array - Monthly Expenses
--------------------------------------------

A family records its expenses for different weeks.

Each week can have a different number of expense entries.

Create a jagged array where:

Week 1 has 3 expenses:
1000, 500, 300

Week 2 has 2 expenses:
800, 400

Week 3 has 4 expenses:
1200, 600, 300, 200

Week 4 has 3 expenses:
900, 500, 250

Task:

1. Create a jagged array to store these expenses.
2. Display all expenses week by week.
3. Calculate and display the total expense for each week.

Expected Output:

Week 1:
1000 500 300
Total: 1800

Week 2:
800 400
Total: 1200

Week 3:
1200 600 300 200
Total: 2300

Week 4:
900 500 250
Total: 1650



*/
/*
class test {
    public static void main(String [] args) {

        int[][] expences = {
            {1000, 500, 300},
            {800, 400},
            {1200, 600, 300, 200},
            {900, 500, 250}
        };
        

        for (int i = 0; i < expences.length; i++) {

            System.out.println("Week " + (i + 1) + ":");
            int total = 0;

            for (int j = 0; j < expences[i].length; j++) {

                System.out.println(expences[i][j] + " ");

                total = total + expences[i][j];
            }

            System.out.println();
            System.out.println("Total: " + total);
            System.out.println();
        }
    }
}

output:

Week 1:
1000 
500 
300 

Total: 1800

Week 2:
800 
400 

Total: 1200

Week 3:
1200 
600 
300 
200 

Total: 2300

Week 4:
900 
500 
250 

Total: 1650

==================================================

QUESTION 5: Array of Objects - Employee Details
-----------------------------------------------

A company wants to store information about its employees.

Create an Employee class with the following fields:

Fields:
1. employeeId
2. name
3. department
4. salary

Create an array of Employee objects and store details of 5 employees.

Example:

101, "Amit", "IT", 35000
102, "Riya", "HR", 40000
103, "Rahul", "Sales", 32000
104, "Sneha", "IT", 45000
105, "Pooja", "Finance", 42000

Task:

1. Create an array of Employee objects.
2. Store details of 5 employees.
3. Display the details of all employees.
4. Display the names of employees working in the "IT" department.

Expected Output:

Employee Details:
101 Amit IT 35000
102 Riya HR 40000
103 Rahul Sales 32000
104 Sneha IT 45000
105 Pooja Finance 42000

Employees from IT Department:
Amit
Sneha

*/
class Employee {

    int employeeId;
    String name;
    String department;
    double salary;


    Employee(int employeeId, String name, String department, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {

        System.out.println(employeeId + " " + name + " " + department + " " + salary);
        
    }
}

public class test {
    public static void main(String [] args) {

        Employee[] emp = new Employee[5];

        emp[0] = new Employee(101, "Amit", "IT", 35000);
        emp[1] = new Employee(102, "Riya", "HR", 40000);
        emp[2] = new Employee(103, "Rahul", "Sales", 32000);
        emp[3] = new Employee(104, "Sneha", "IT", 45000);
        emp[4] = new Employee(105, "Pooja", "Finance", 42000);


       System.out.println("Employee Details:");

       for (int i = 0; i < emp.length; i++) {
        emp[i].display();
       }

       System.out.println();
       System.out.println("Employee from IT Department:");

       for (int i = 0; i < emp.length; i++){

            if (emp[i].department.equals("IT")) {
                System.out.println(emp[i].name);
            }
        }
    }
}

output:
Employee Details:
101 Amit IT 35000.0
102 Riya HR 40000.0
103 Rahul Sales 32000.0
104 Sneha IT 45000.0
105 Pooja Finance 42000.0

Employee from IT Department:
Amit
Sneha


