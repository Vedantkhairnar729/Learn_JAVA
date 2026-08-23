// JAVA PRACTICE QUESTIONS
// Topics: static, this, Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance
// Difficulty Level: Medium

// 1. Employee Counter
// Create an Employee class with employeeId, employeeName, and a static variable companyName.
// Create 5 employee objects and display their details. Change the company name once and observe 
// the effect on all objects.
//===========================================================================================================================================================================//

class Employee{

    int EmployeeId;
    String EmployeeName;
    
    static String CompanyName = "HCL";

    Employee(int EmpId, String EmpName){
        EmpId = EmployeeId;
        EmpName = EmployeeName;

    }

    void desk(){
        System.out.println("Employee ID : " + EmployeeId);
        System.out.println("Employee Name : " + EmployeeName);
        System.out.println("Employee Company name : " + CompanyName);
        System.out.println("===============================================");
    }
}
public class Practice{
    public static void main(String[] args){
        Employee e1 = new Employee(102, "Avi");
        Employee e2 = new Employee(103, "Ani");
        Employee e3 = new Employee(104, "Navi");
        Employee e4 = new Employee(105, "Dip");
        Employee e5 = new Employee(106, "Suku");


    // change company name
    //Changing static variable

    Employee.CompanyName = "TCS"; // ============================================================

        e1.desk();
        e2.desk();
        e3.desk();
        e4.desk();
        e5.desk();

    }
}

// Output //

Employee ID : 0
Employee Name : null
Employee Company name : TCS
===============================================
Employee ID : 0
Employee Name : null
Employee Company name : TCS
===============================================
Employee ID : 0
Employee Name : null
Employee Company name : TCS
===============================================
Employee ID : 0
Employee Name : null
Employee Company name : TCS
===============================================
Employee ID : 0
Employee Name : null
Employee Company name : TCS
===============================================

//===========================================================================================================================================================================//

// 2. Student Count
// Create a Student class with rollNo, name, and a static variable studentCount. Automatically 
// increase studentCount whenever a new object is created. Display the total number of students created.

class Student{
    int roll;
    String name;

    static int StudentCount = 0;

    Student(int roll, String name){
        this.roll = roll;
        this.name = name;

        StudentCount++;
    }
    void desk(){
        System.out.println("Student Roll No : " + roll);
        System.out.println("Student Name : " + name);
        System.out.println("=============================");

    }
}
public class Practice{
    public static void main(String [] args){
        Student s1 = new Student(101,"Avi");
        Student s2 = new Student(101,"Ani");
        Student s3 = new Student(101,"Navi");
        Student s4 = new Student(101,"Gudu");
        Student s5 = new Student(101,"Tom");

        s1.desk();
        s2.desk();
        s3.desk();
        s4.desk();
        s5.desk();

        System.out.println("Student Counts in total : " + Student.StudentCount);   

    }
}

// Output //

Student Roll No : 101
Student Name : Avi
=============================
Student Roll No : 101
Student Name : Ani
=============================
Student Roll No : 101
Student Name : Navi
=============================
Student Roll No : 101
Student Name : Gudu
=============================
Student Roll No : 101
Student Name : Tom
=============================
Student Counts in total : 5

//===========================================================================================================================================================================//

// 3. Bank Account Number Generator
// Create a BankAccount class with accountNumber, customerName, and a static variable nextAccountNumber. 
// Automatically generate a unique account number for every new account.

//===========================================================================================================================================================================//

// 4. Static Calculator
// Create a Calculator class containing static methods for addition, subtraction, multiplication, division, 
// and finding the square of a number. Call all methods without creating an object.

//===========================================================================================================================================================================//

// 5. Student Details Using this
// Create a Student class containing rollNo, name, course, and marks. Use the this keyword inside a parameterized 
// constructor to initialize instance variables. Display the complete student details.

//===========================================================================================================================================================================//

// 6. Employee Salary Update
// Create an Employee class with id, name, and salary. Create a method that accepts new employee details and uses 
// the this keyword to distinguish instance variables from local variables.

//===========================================================================================================================================================================//

// 7. Product Class Using this
// Create a Product class with productId, productName, price, and quantity. Create a parameterized constructor 
// using this. Add a method to calculate and display the total price.

//===========================================================================================================================================================================//

// 8. Constructor Chaining Using this()
// Create a Mobile class with brand, model, and price. Create three constructors:
// - Default constructor
// - Constructor accepting brand
// - Constructor accepting brand, model, and price
// Use this() to call one constructor from another.

//===========================================================================================================================================================================//

// 9. Employee and Developer
// Create a base class Employee containing id, name, and salary. Create a derived class Developer containing 
// programmingLanguage and projectName. Display all employee and developer details.

//===========================================================================================================================================================================//

// 10. Vehicle and Car
// Create a Vehicle class with brand, model, and speed. Create a Car class that inherits from Vehicle and adds 
// fuelType and numberOfDoors. Display all information.

//===========================================================================================================================================================================//

// 11. Bank Account and Savings Account
// Create a BankAccount class with accountNumber, holderName, and balance. Create a SavingsAccount class that 
// inherits from BankAccount and adds interestRate. Create a method to calculate and display interest.

//===========================================================================================================================================================================//

// 12. Person and Student
// Create a Person class with name, age, and city. Create a Student class that inherits from Person and adds rollNo, course, and marks. 
// Display complete student information.

//===========================================================================================================================================================================//

// 13. Person -> Employee -> Manager
// Create three classes:
// Person -> name, age
// Employee -> employeeId, salary
// Manager -> department, teamSize
// Use multilevel inheritance. Create a Manager object and display all details.

//===========================================================================================================================================================================//

// 14. Vehicle -> Car -> ElectricCar
// Create three classes:
// Vehicle -> brand, model
// Car -> numberOfDoors, fuelType
// ElectricCar -> batteryCapacity, chargingTime
// Use multilevel inheritance. Display all properties and create a method to calculate the approximate driving range.

//===========================================================================================================================================================================//

// 15. Student -> GraduateStudent -> ResearchStudent
// Create three classes:
// Student -> name, rollNo, marks
// GraduateStudent -> specialization, university
// ResearchStudent -> researchTopic, guideName
// Use multilevel inheritance and display complete research student information.

//===========================================================================================================================================================================//

// 16. Employee -> Developer -> SeniorDeveloper
// Create three classes:
// Employee -> id, name, salary
// Developer -> programmingLanguage, project
// SeniorDeveloper -> experience, teamSize
// Use multilevel inheritance. Create a method to calculate a bonus based on experience.

//===========================================================================================================================================================================//

// 17. Employee Hierarchy
// Create a base class Employee containing id, name, and salary. Create three child classes:
// Developer -> programmingLanguage
// Tester -> testingTool
// HR -> recruitmentArea
// Use hierarchical inheritance and display the details of all three types of employees.

//===========================================================================================================================================================================//

// 18. Vehicle Hierarchy
// Create a base class Vehicle containing brand, model, and price. Create three child classes:
// Car -> numberOfDoors
// Bike -> engineCapacity
// Truck -> loadCapacity
// Use hierarchical inheritance. Create objects for each class and display their details.

//===========================================================================================================================================================================//

// 19. Account Hierarchy
// Create a base class Account containing accountNumber, holderName, and balance. Create three child classes:
// SavingsAccount -> interestRate
// CurrentAccount -> overdraftLimit
// SalaryAccount -> employerName
// Use hierarchical inheritance and display account information for each account type.

//===========================================================================================================================================================================//

// 20. University Management System
// Create a base class Person containing name, age, and contactNumber. Create three child classes:
// Student -> rollNo, course, marks
// Teacher -> subject, salary
// Staff -> department, designation
// Use hierarchical inheritance. Create objects for all three classes and display their complete information. 
// Also add one suitable method in each child class to demonstrate its specific functionality.

//===========================================================================================================================================================================//