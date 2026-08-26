// JAVA PRACTICE QUESTIONS
// Topics: static, this, Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance
// Difficulty Level: Medium

// 1. Employee Counter
// Create an Employee class with employeeId, employeeName, and a static variable companyName.
// Create 5 employee objects and display their details. Change the company name once and observe 
// the effect on all objects.
//===========================================================================================================================================================================//
// class Employee{

//     int EmployeeId;
//     String EmployeeName;
    
//     static String CompanyName = "HCL";  //-------------------------------------------------------------------

//     Employee(int EmpId, String EmpName){
//         EmpId = EmployeeId;
//         EmpName = EmployeeName;

//     }

//     void desk(){
//         System.out.println("Employee ID : " + EmployeeId);
//         System.out.println("Employee Name : " + EmployeeName);
//         System.out.println("Employee Company name : " + CompanyName);
//         System.out.println("===============================================");
//     }
// }
// public class Practice{
//     public static void main(String[] args){
//         Employee e1 = new Employee(102, "Avi");
//         Employee e2 = new Employee(103, "Ani");
//         Employee e3 = new Employee(104, "Navi");
//         Employee e4 = new Employee(105, "Dip");
//         Employee e5 = new Employee(106, "Suku");


//     // change company name
//     //Changing static variable

//     Employee.CompanyName = "TCS"; //--------------------------------------------------------------------

//         e1.desk();
//         e2.desk();
//         e3.desk();
//         e4.desk();
//         e5.desk();

//     }
// }

// Output //

// Employee ID : 0
// Employee Name : null
// Employee Company name : TCS
// ===============================================
// Employee ID : 0
// Employee Name : null
// Employee Company name : TCS
// ===============================================
// Employee ID : 0
// Employee Name : null
// Employee Company name : TCS
// ===============================================
// Employee ID : 0
// Employee Name : null
// Employee Company name : TCS
// ===============================================
// Employee ID : 0
// Employee Name : null
// Employee Company name : TCS
// ===============================================

//===========================================================================================================================================================================//

// 2. Student Count
// Create a Student class with rollNo, name, and a static variable studentCount. Automatically 
// increase studentCount whenever a new object is created. Display the total number of students created.

// class Student{
//     int roll;
//     String name;

//     static int StudentCount = 0; // ----------------------------------------------------------------

//     Student(int roll, String name){
//         this.roll = roll;
//         this.name = name;

//         StudentCount++;  //----------------------------------------------------------------------
//     }
//     void desk(){
//         System.out.println("Student Roll No : " + roll);
//         System.out.println("Student Name : " + name);
//         System.out.println("=============================");

//     }
// }
// public class Practice{
//     public static void main(String [] args){
//         Student s1 = new Student(101,"Avi");
//         Student s2 = new Student(101,"Ani");
//         Student s3 = new Student(101,"Navi");
//         Student s4 = new Student(101,"Gudu");
//         Student s5 = new Student(101,"Tom");

//         s1.desk();
//         s2.desk();
//         s3.desk();
//         s4.desk();
//         s5.desk();

//         System.out.println("Student Counts in total : " + Student.StudentCount); //----------------------------------------------------

//     }
// }

// Output //

// Student Roll No : 101
// Student Name : Avi
// =============================
// Student Roll No : 101
// Student Name : Ani
// =============================
// Student Roll No : 101
// Student Name : Navi
// =============================
// Student Roll No : 101
// Student Name : Gudu
// =============================
// Student Roll No : 101
// Student Name : Tom
// =============================
// Student Counts in total : 5

//===========================================================================================================================================================================//

// 3. Bank Account Number Generator
// Create a BankAccount class with accountNumber, customerName, and a static variable nextAccountNumber. 
// Automatically generate a unique account number for every new account.

// class BankAccount{
//     String custName;
//     int accNo;

//     static int nextAccNo = 1001; // -----------------------------------------------------------------------------------------------

//     BankAccount(String custName){
//         this.accNo = nextAccNo;
//         this.custName = custName;

//         nextAccNo++; // --------------------------------------------------------------------------------------------------------------
//     }
    
//     void desk(){
//         System.out.println("Customer Account Number : " + accNo);
//         System.out.println("Customer Name : " + custName);
//         System.out.println();
//     }
// }
// public class Practice{
//     public static void main(String [] args){
//         BankAccount b1 = new BankAccount("Avi");
//         BankAccount b2 = new BankAccount("Ani");
//         BankAccount b3 = new BankAccount("Vir");
//         BankAccount b4 = new BankAccount("nit");
//         BankAccount b5 = new BankAccount("abhi");

//         b1.desk();
//         b2.desk();
//         b3.desk();
//         b4.desk();
//         b5.desk();
//     }
// }

// Output //

// Customer Account Number : 1001
// Customer Name : Avi

// Customer Account Number : 1002
// Customer Name : Ani

// Customer Account Number : 1003
// Customer Name : Vir

// Customer Account Number : 1004
// Customer Name : nit

// Customer Account Number : 1005
// Customer Name : abhi

//===========================================================================================================================================================================//

// 4. Static Calculator
// Create a Calculator class containing static methods for addition, subtraction, multiplication, division, 
// and finding the square of a number. Call all methods without creating an object.

// class Calculator{  //---------------------------------------------------------------------------------------------------------------------------------------
    
//     static int addition(int a, int b){
//         return a + b;
//     } 
//     static int subtraction(int a, int b){
//         return a - b;
//     }
//     static int multiplication(int a, int b){
//         return a * b;
//     }
//     static int division(int a, int b){
//         return a / b;
//     }
//     static int square(int n){
//         return n * n;
//     }
// }
// public class Practice{
//     public static void main(String [] args){
//         System.out.println("Addition : " + Calculator.addition(15,5));
//         System.out.println("Subtraction : " + Calculator.subtraction(15,5));
//         System.out.println("Multiplication : " + Calculator.multiplication(15,5));
//         System.out.println("Division : " + Calculator.division(15,5));
//         System.out.println("Square : " + Calculator.square(15));
//     }
// }

// Output //

// Addition : 20
// Subtraction : 10
// Multiplication : 75
// Division : 3
// Square : 225

//===========================================================================================================================================================================//

// 5. Student Details Using this
// Create a Student class containing rollNo, name, course, and marks. Use the this keyword inside a parameterized 
// constructor to initialize instance variables. Display the complete student details.

// class Student{
//     int rollNo;
//     String name;
//     String course;
//     int mark;

//     Student(int rollNo, String name, String course, int mark){
        
//         // instance initialize
//         this.rollNo = rollNo;
//         this.name = name;
//         this.course = course;
//         this.mark = mark;
//     }
//     void desk(){
//         System.out.println("Roll No : " + rollNo);
//         System.out.println("Name : " + name);
//         System.out.println("Course : " + course);
//         System.out.println("Mark : " + mark);
//     }
// }
// public class Practice{
//     public static void main(String [] args){
//         Student s1 = new Student(102, "Avi", "IT", 88);

//         s1.desk();
//     }
// }

// Output //

// Roll No : 102
// Name : Avi
// Course : IT
// Mark : 88

//===========================================================================================================================================================================//

// 6. Employee Salary Update
// Create an Employee class with id, name, and salary. Create a method that accepts new employee details and uses 
// the this keyword to distinguish instance variables from local variables.

// class Employee{
//     int Id;
//     String name;
//     int salary;

//     void setDetails(int Id, String name, int salary){  // ------------------------------------------------------------------------------
//         this.Id = Id;
//         this.name = name;
//         this.salary = salary;
//     }
//     void display(){              // --------------------------------------------------------------------------------------
//         System.out.println("Employee ID : " + Id);
//         System.out.println("Employee Name : " + name);
//         System.out.println("Employee Salary : " + salary);
//         System.out.println();
//     }    
// }
// public class Practice{
//     public static void main(String [] args){
//         Employee e1 = new Employee();

//         e1.setDetails(150, "Ani", 900000);
//         e1.display();
//     }
// }

// Output //

// Employee ID : 150
// Employee Name : Ani
// Employee Salary : 900000

//===========================================================================================================================================================================//

// 7. Product Class Using this
// Create a Product class with productId, productName, price, and quantity. Create a parameterized constructor 
// using this. Add a method to calculate and display the total price.

// class Product{
//     int productId;
//     String productName;
//     int price;
//     int quantity;

//     Product(int productId, String productName, int price, int quantity){
//         this.productId = productId;
//         this.productName = productName;
//         this.price = price;
//         this.quantity = quantity;

//     }
//     void display(){

//         double total = price * quantity;        // --------------------------------------------------------------------------------------------

//         System.out.println("Product ID : " + productId);
//         System.out.println("Product Name : " + productName);
//         System.out.println("Product Price : " + price);
//         System.out.println("Quantity : " + quantity);
//         System.out.println("Total price : " + total);
//     }
// }
// public class Practice{
//     public static void main(String [] args){
//         Product p1 = new Product(26012, "Fan", 1500, 7);

//         p1.display();
//     }
// }

// Output //

// Product ID : 26012
// Product Name : Fan
// Product Price : 1500
// Quantity : 7
// Total price : 10500.0

//===========================================================================================================================================================================//

// 8. Constructor Chaining Using this()
// Create a Mobile class with brand, model, and price. Create three constructors:
// - Default constructor
// - Constructor accepting brand
// - Constructor accepting brand, model, and price
// Use this() to call one constructor from another.

// class Mobile{
//     String brand;
//     String model;
//     int price;

//     Mobile(){                        // ---------------------------------------------------------------------------
//         this("Oppo", "A34", 15000);
       
//     }
//     Mobile( String brand){           //-----------------------------------------------------------------------------
//         this(brand, "T3x",40000);
        
//     }
//     Mobile(String brand, String model, int price){
//         this.brand = brand;
//         this.model = model;
//         this.price = price;
//     }
//     void display(){
//         System.out.println("Mobile Brand : " + brand);
//         System.out.println("Mobile Model : " + model);
//         System.out.println("Mobile Price : " + price);
//         System.out.println();
        
//     }

// }
// public class Practice{
//     public static void main(String [] args){
//         Mobile m1 = new Mobile();
//         Mobile m2 = new Mobile("Vivo");
//         Mobile m3 = new Mobile("Iphone", "18 pro", 150000);
//         Mobile m4 = new Mobile("OnePlus", "15", 30000);

//         m1.display();
//         m2.display();
//         m3.display();
//         m4.display();
//     }
// }

// Output //

// Mobile Brand : Oppo
// Mobile Model : A34
// Mobile Price : 15000

// Mobile Brand : Vivo
// Mobile Model : T3x
// Mobile Price : 40000

// Mobile Brand : Iphone
// Mobile Model : 18 pro
// Mobile Price : 150000

// Mobile Brand : OnePlus
// Mobile Model : 15
// Mobile Price : 30000

//===========================================================================================================================================================================//

// 9. Employee and Developer
// Create a base class Employee containing id, name, and salary. Create a derived class Developer containing 
// programmingLanguage and projectName. Display all employee and developer details.

// class Employee{
//     int id;
//     String name;
//     int salary;

//     Employee(int id, String name, int salary){
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }

//     void employeeDetails(){
//         System.out.println("Employee ID : " + id);
//         System.out.println("Employee Name : " + name);
//         System.out.println("Employee Salary : " + salary);
//         System.out.println();
        
//     }
// }

// class Developer extends Employee{
//     String programmingLanguage;
//     String projectName;
  
//     Developer(int id, String name, int salary, String programmingLanguage, String projectName){
       
//         super(id,name,salary); // --------------------------------------------------------------------------------
       
//         this.programmingLanguage = programmingLanguage;
//         this.projectName = projectName;
//     }

//     void developerDetails(){

//         employeeDetails(); // --------------------------------------------------------------------------

//         System.out.println("Programming Language : " + programmingLanguage);
//         System.out.println("Project Name : " + projectName);
//         System.out.println("======================================================");
//     }
// }

// public class Practice{
//     public static void main(String [] args){

//         Developer d1 = new Developer(
//             101, "Avi", 15000, "Java", "Banking System"
//         );

//         Developer d2 = new Developer(
//             102, "Ani", 700000, "C", "Railway System"
//         );

//         Developer d3 = new Developer(
//             103, "Guru", 40000, "Python", "AI Project"
//         );

      
//         d1.developerDetails();
//         d2.developerDetails();
//         d3.developerDetails();

//     }
// }

// Output //

// Employee ID : 101
// Employee Name : Avi
// Employee Salary : 15000

// Programming Language : Java
// Project Name : Banking System
// ======================================================
// Employee ID : 102
// Employee Name : Ani
// Employee Salary : 700000

// Programming Language : C
// Project Name : Railway System
// ======================================================
// Employee ID : 103
// Employee Name : Guru
// Employee Salary : 40000

// Programming Language : Python
// Project Name : AI Project
// ======================================================
//===========================================================================================================================================================================//

// 10. Vehicle and Car
// Create a Vehicle class with brand, model, and speed. Create a Car class that inherits from Vehicle and adds 
// fuelType and numberOfDoors. Display all information.

// class Vehicle{
//     String brand;
//     String model;
//     int speed;

//     Vehicle(String brand, String model, int speed){
//         this.brand = brand;
//         this.model = model;
//         this.speed = speed;
//     }

//     void vdisplay(){
//         System.out.println("Car Brand : " + brand);
//         System.out.println("Car Model : " + model);
//         System.out.println("Car Speed : " + speed);
//     }
// }

// class Car extends Vehicle{
//     String fuleType;
//     int numberOfDoors;

//     Car(String brand, String model, int speed, String fuleType, int numberOfDoors){

//     super(brand,model,speed);

//     this.fuleType = fuleType;
//     this.numberOfDoors = numberOfDoors;

//     }

//     void cdisplay(){

//         vdisplay();

//         System.out.println("Car Fule Type : " + fuleType);
//         System.out.println("Car Number Of Doors : " + numberOfDoors);
//         System.out.println();
//     }
// }

// public class Practice{
//     public static void main(String [] args){
//         Car c1 = new Car("Tayota", "Fourtuner", 180, "Diesel",5);

//         c1.cdisplay();
//     }
// }

// Output //

// Car Brand : Tayota
// Car Model : Fourtuner
// Car Speed : 180
// Car Fule Type : Diesel
// Car Number Of Doors : 5

//===========================================================================================================================================================================//

// 11. Bank Account and Savings Account
// Create a BankAccount class with accountNumber, holderName, and balance. Create a SavingsAccount class that 
// inherits from BankAccount and adds interestRate. Create a method to calculate and display interest.

// class BankAccount{
//     int accountNumber;
//     String holderName;
//     double balance;

//     BankAccount(int accountNumber, String holderName, double balance){
//         this.accountNumber = accountNumber;
//         this.holderName = holderName;
//         this.balance = balance;
//     }

//     void accountDetails(){
//         System.out.println("Account Number : " + accountNumber);
//         System.out.println("Account Holder Name : " + holderName);
//         System.out.println("Account Balance : " + balance);

//     }
// }

// class SavingsAccount extends BankAccount{

//     double interestRate;

//     SavingsAccount(int accountNumber, String holderName, double balance, double interestRate){

//         super(accountNumber, holderName, balance);

//         this.interestRate = interestRate;
       
//     }

//     void calculateInterest(){
       
//         double interest = (balance * interestRate) / 100;

//         accountDetails();

//         System.out.println("Interest Rate : " + interestRate + "%");
//         System.out.println("Interest : " + interest);

//     }
// }

// public class Practice{
//     public static void main(String [] args){
//         SavingsAccount s1 = new SavingsAccount(102, "Ani", 98000, 7.5);

//         s1.calculateInterest();
//     }
// }

// Output //

// Account Number : 102
// Account Holder Name : Ani
// Account Balance : 98000.0
// Interest Rate : 7.5%
// Interest : 7350.0


//===========================================================================================================================================================================//

// 12. Person and Student
// Create a Person class with name, age, and city. Create a Student class that inherits from Person and adds rollNo, course, and marks. 
// Display complete student information.

// class Person{
//     String name;
//     int age;
//     String city;

//     Person(String name, int age, String city){
//         this.name = name;
//         this.age = age;
//         this.city = city;
//     }

//     void desk(){
//         System.out.println("Student Name : " + name);
//         System.out.println("Student Age : " + age);
//         System.out.println("Student City : " + city);
//     }
// }

// class Student extends Person{
//     int rollNo;
//     String course;
//     int marks;

//     Student(String name, int age, String city, int rollNo, String course, int marks){

//         super(name, age, city);

//         this.rollNo = rollNo;
//         this.course = course;
//         this.marks = marks;    

//     }

//     void display(){

//         desk();

//         System.out.println("Student Roll No : " + rollNo);
//         System.out.println("Student Course Name : " + course);
//         System.out.println("Student Marks : " + marks);
//         System.out.println();
//     }
// }

// public class Practice{
//     public static void main(String [] args){
//         Student s1 = new Student("Ani", 22, "Pune", 102, "CSE", 85);

//         s1.display();
//     }
// }

// Output // 

// Student Name : Ani
// Student Age : 22
// Student City : Pune
// Student Roll No : 102
// Student Course Name : CSE
// Student Marks : 85

//===========================================================================================================================================================================//

// 13. Person -> Employee -> Managernn
// Create three classes:
// Person -> name, age
// Employee -> employeeId, salary
// Manager -> department, teamSize
// Use multilevel inheritance. Create a Manager object and display all details.


// class Person {

//     String name; 
//     int age;

//     Person(String name, int age) {

//     //veriable       //Parameter use anywere   -------------------------------------------------------------------
//         this.name = name;         
//         this.age = age;
//     }

//     void desk_1() {

//         System.out.println("Person Name : " + name);
//         System.out.println("Person Age : " + age);
//     }
// }

// class Employee extends Person {

//     int empId;
//     int empSalary;

//     Employee(String name, int age, int empId, int empSalary) {

//         super(name, age);

//         this.empId = empId;
//         this.empSalary = empSalary;
//     }

//     void desk_2() {

//         desk_1();

//         System.out.println("Employee ID : " + empId);
//         System.out.println("Employee Salary : " + empSalary);

//     }
// }

// class Manager extends Employee {

//     String department;
//     int teamSize;

//     Manager(String name, int age, int empId, int empSalary, String department, int teamSize) {

//         super(name, age, empId, empSalary);

//         this.department = department;
//         this.teamSize = teamSize;

//     }

//     void desk_3() {
        
//         desk_2();

//         System.out.println("Employee Department : " + department);
//         System.out.println("Employee Team Size : " + teamSize);

//     }
// }

// public class Practice {
//     public static void main(String [] args) {
//         Manager m1 = new Manager("Ani", 22, 26022, 85000, "CSE", 5);

//         m1.desk_3();
//     }
// }

// Output //

// Person Name : Ani
// Person Age : 22
// Employee ID : 26022
// Employee Salary : 85000
// Employee Department : CSE
// Employee Team Size : 5

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