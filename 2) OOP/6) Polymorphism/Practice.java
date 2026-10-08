// JAVA PRACTICE QUESTIONS
// Topics: final Keyword, static Keyword and Polymorphism
// Difficulty Level: Medium


// FINAL KEYWORD

// 1. Final Variable

// Create a Student class with a final variable COLLEGE_NAME.
// Assign a college name to it and display it.
// Try to change the value of COLLEGE_NAME after initialization and observe the error.

// // class Student {
//     final String COLLEGE_NAME = "JIT";

//     void desk() {
//         System.out.println("College Name: " + COLLEGE_NAME);
//     }
// }

// public class Practice {
//     public static void main(String [] args) {
//         Student s1 = new Student();

//         s1.desk();

//         s1.COLLEGE_NAME = "HIT";
//     }
// }



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 2. Final Variable with Constructor

// Create an Employee class with a final variable employeeId.
// Initialize employeeId using a constructor and display it.
// Create multiple Employee objects with different employee IDs.

// class Employee {
//     final int employeeId;

//     Employee(int employeeId) {
//         this.employeeId = employeeId;
//     }

//     void desk() {
//         System.out.println("Employee ID: " + employeeId);
//     }
// }

// public class Practice {
//     public static void main(String [] args) {
//         Employee e1 = new Employee(101);
//         Employee e2 = new Employee(102);
//         Employee e3 = new Employee(103);

//         e1.desk();
//         e2.desk();
//         e3.desk();


//     }
// }



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 3. Final Method

// Create a Vehicle class with a final method start().
// Create a Car class that extends Vehicle.
// Try to override the start() method in Car and observe what happens.

// class Vehicle {
    
//     final void start() {
//         System.out.println("BMW");
//     }
// }

// class Car extends Vehicle {

//     void start() {
//         System.out.println("Audi");
//     }
// }

// public class Practice {
//     public static void main(String [] args) {
//         Car c1 = new Car();

//         c1.start();
//     }
// }

//// Error:

// Practice.java:82: error: start() in Car cannot override start() in Vehicle
//     void start() {
//          ^
//   overridden method is final
// 1 error


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 4. Final Class

// Create a final class Bank.
// Create another class SBI that attempts to extend Bank.
// Observe the compiler error and explain why inheritance is not allowed.

// final class Bank {

//     System.out.println("Final Class");

// }

// class SBI extends Bank {

//     System.out.println("New Class");
// }

// public class Practice {
//     public static void main(String [] args) {
        
//         SBI s1 = new SBI();


//     }
// }


// Error:: 

/*
Practice.java:119: error: <identifier> expected
    System.out.println("Final Class");
                      ^
Practice.java:119: error: illegal start of type
    System.out.println("Final Class");
                       ^
Practice.java:125: error: <identifier> expected
    System.out.println("New Class");
                      ^
Practice.java:125: error: illegal start of type
    System.out.println("New Class");
                       ^
4 errors
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 5. Final Reference Variable
// Create a class Address with a variable city.
// Create a final reference variable:
// final Address address = new Address();
// Change the city using the address reference.
// Then try to assign a new Address object to the same reference.
// Identify which operation is allowed and which is not.

// class Address {
    
//     String city;

// }

// public class Practice {
//     public static void main(String [] args) {
        
//         final Address address = new Address();

//         address.city = "Pune";

//         System.out.println("City : " + address.city);

//         // address.city = "Mumbai";

//         // System.out.println("New City : " + address.city);

//         // address = new Address();
//     }
// }


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 6. Final Variable and Static Variable

// Create a Student class containing:
// static String collegeName
// final int rollNo
// Create multiple objects and demonstrate the difference between the static variable and final variable.

// class Student {

//     // Static variable
//     static String collegeName = "HIT"; // use for common instance

//     // final instance variable
//     final int rollNo;

//     Student(int rollNo) {
//         this.rollNo = rollNo;
//     }

//     void desk() {
//         System.out.println("Roll No      : " + rollNo);
//         System.out.println("CollegeName  : " + collegeName);
//         System.out.println();

//     }    
// }

// public class Practice {
//     public static void main(String [] args) {
//         Student s1 = new Student(101);
//         Student s2 = new Student(102);
//         Student s3 = new Student(103);

        
//         s1.desk();
//         s2.desk();
//         s3.desk();
//     }
// }



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 7. Final Method with Polymorphism
// Create a parent class Employee with a final method calculateSalary().
// Create Developer and Manager classes extending Employee.
// Try to override calculateSalary() in both classes.
// Explain why runtime polymorphism cannot be achieved using a final method.


// class Employee {

//     final void calculateSalary() {
//         System.out.println("Employee method");
//     }
// }

// class Developer extends Employee {
     
//     void calculateSalary() {
//         super.calculateSalary();
//         System.out.println("Developer method");
//     }
// }

// class Manager extends Employee {

//     void calculateSalary() {
//         System.out.println("Manager method");
//     }
// }

// public class Practice {
//     public static void main(String [] args) {

//         Developer d1 = new Developer();
//         Manager m1 = new Manager();

//         d1.calculateSalary();
//         m1.calculateSalary();

//     }
// }

// Error ::

/*

Practice.java:252: error: calculateSalary() in Developer cannot override calculateSalary() in Employee
    void calculateSalary() {
         ^
  overridden method is final
Practice.java:260: error: calculateSalary() in Manager cannot override calculateSalary() in Employee
    void calculateSalary() {
         ^
  overridden method is final
2 errors

*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 8. Output Prediction - Final

// Predict the output:

// class Demo {
//     final int x;

//     Demo(int x){
//         this.x = x;
//     }

//     void display() {
//         System.out.println(x); 
//     }
// }

// class Practice{
//     public static void main(String[] args) {
//         Demo d = new Demo(2);
//         d.display();
//     }
// }

// Then modify the program to initialize x through a constructor.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 9. Real-Life Problem - Bank Account

// Create a BankAccount class containing:

// final int accountNumber
// String holderName
// double balance
// Initialize accountNumber using a constructor.
// Create methods to deposit and withdraw money.
// Make sure accountNumber cannot be changed after object creation.

// class BankAccount {
//     final int accountNumber;
//     String holderName = "Avi";
//     double balance = 58000.00;

//     BankAccount(int accountNumber) {
//         this.accountNumber = accountNumber;
//     }

//     void desk() {
//         System.out.println("Account Number : " + accountNumber);
//         System.out.println("Account Holder Name : " + holderName);
//         System.out.println("Account Balance : " + balance);
//     }
// }

// class Practice {
//     public static void main(String [] args) {
//         BankAccount b = new BankAccount(101);

//         b.desk();
//     }
// }


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 10. Final Keyword Challenge

// Create a final class Employee with:
// final int id
// String name
// double salary

// Create a constructor and display method.
// Try to:
// - Change id
// - Extend Employee
// - Change name
// - Change salary

// Identify which operations are allowed and which are not.


final class Employee {
    final int id;
    String name;
    double salary;

    Employee(int empId, String empName, double empSalary) {

        id = empId;
        name = empName;
        salary = empSalary;
    }

    void desk() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Practice {
    public static void main(String [] args) {
        Employee e = new Employee(101, "Ani", 95000.00);

        
        e.desk();
        e.name = "Avi";
        e.salary = 52000.00;
        e.desk();
    }
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// STATIC KEYWORD


// 11. Static Variable

// Create a Student class containing:

// int rollNo
// String name
// static String collegeName
// Create five Student objects.
// Assign the same college name to all students using the static variable.
// Display all student details.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 12. Static Method

// Create a Calculator class with static methods:
// add()
// subtract()
// multiply()
// divide()

// Call all methods directly using the class name without creating an object.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 13. Static Block

// Create a class containing:
// - Static variable
// - Static block
// - Constructor
// - Instance method
// Print messages from each.
// Create two objects and determine how many times the static block executes.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 14. Multiple Static Blocks

// Create a class with three static blocks.
// Print:
// Static Block 1
// Static Block 2
// Static Block 3
// Create an object and observe the execution order.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 15. Static Variable and Object Count

// Create a Student class with a static variable count.
// Increment count inside the constructor.
// Create five Student objects.
// Display the total number of objects created.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 16. Static Method and Instance Variable

// Create a class Employee with:
// int salary
// static String companyName
// Create a static method displayCompany().
// Try to access salary directly inside the static method.
// If an error occurs, fix the program.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 17. Static Variable Shared by Objects

// Create a BankAccount class with:
// int accountNumber
// double balance
// static double interestRate

// Create three accounts.
// Change interestRate using one object and observe the value through the other objects.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 18. Static Block Initialization

// Create a Product class containing:
// static double discount
// Use a static block to initialize discount to 10%.
// Create a method calculateFinalPrice() that applies the discount.
// Create multiple objects and display their final prices.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 19. Real-Life Problem - Employee Counter

// Create an Employee class containing:
// int employeeId
// String name
// static int employeeCount
// Every time an Employee object is created, employeeCount should increase automatically.
// Create at least five employees and display the total number of employees.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 20. Static Nested Class

// Create an Outer class containing a static nested class Inner.
// Create a method inside Inner that prints a message.
// Call the method without creating an object of Outer.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// POLYMORPHISM


// 21. Method Overloading

// Create a Calculator class with overloaded methods:
// add(int, int)
// add(double, double)
// add(int, int, int)
// Call all three methods and display the results.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 22. Method Overloading - Area

// Create a class Area with overloaded methods:
// calculateArea(int side)
// calculateArea(int length, int breadth)
// calculateArea(double radius)

// Use method overloading to calculate the area of a square, rectangle and circle.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 23. Method Overloading with Different Data Types

// Create a class Printer with overloaded print() methods:
// print(int value)
// print(String value)
// print(double value)
// print(char value)

// Call each method and observe which method is selected.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 24. Method Overriding

// Create a parent class Animal with a method sound().
// Create Dog, Cat and Cow classes that override sound().
// Create objects of each class and call sound().


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



// 25. Runtime Polymorphism

// Create a parent class Vehicle with a method start().

// Create subclasses:
// Car
// Bike
// Bus

// Override start() in each class.
// Create a Vehicle reference and assign different child objects to it.
// Call start() using the parent reference.


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 26. Runtime Polymorphism - Employee

// Create a parent class Employee with a method calculateSalary().

// Create:
// Developer
// Manager
// Tester

// Override calculateSalary() in each class.
// Use an Employee reference to call calculateSalary() for different objects.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 27. Upcasting

// Create a parent class Shape and child classes Circle and Rectangle.

// Create objects using:
// Shape s1 = new Circle();
// Shape s2 = new Rectangle();

// Override the draw() method.
// Call draw() using the parent references and observe runtime polymorphism.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 28. Downcasting

// Create a parent class Animal and child class Dog.
// Create a Dog object and store it in an Animal reference.
// Perform upcasting first.
// Then perform downcasting and call a Dog-specific method.
// Also try an invalid downcasting scenario and observe what happens.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 29. Polymorphism + Final

// Create a parent class Payment with a method pay().

// Create subclasses:
// CreditCardPayment
// UPIPayment
// CashPayment
// Override pay() in each class.
// Then create another final method inside Payment called transactionId().
// Demonstrate which method can participate in overriding and which cannot.



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 30. FINAL + STATIC + POLYMORPHISM CHALLENGE

// Create the following class hierarchy:

// Employee
//    |
//    |----------------|
// Developer        Manager

// Employee should contain:
// final int employeeId
// String name
// static String companyName

// Create:
// - Constructor to initialize employeeId and name.
// - Static method displayCompany().
// - Method displayDetails().
// - Method calculateSalary().

// Developer should contain:
// double bonus
// Manager should contain:
// double allowance
// Override calculateSalary() in Developer and Manager.

// Requirements:
// 1. employeeId must be final.
// 2. companyName must be static.
// 3. displayCompany() must be static.
// 4. calculateSalary() should demonstrate runtime polymorphism.
// 5. Use an Employee reference to store Developer and Manager objects.
// 6. Call calculateSalary() using the Employee reference.
// 7. Try to override a final method and observe the error.
// 8. Create multiple employees and demonstrate that companyName is shared.
// 9. Display complete details of Developer and Manager.
// 10. Explain where final, static and polymorphism are used in the program.