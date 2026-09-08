// JAVA PRACTICE QUESTIONS
// Topic: super Keyword and Instance Initializer Block
// Difficulty: Medium

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 1. Super with Parent Class Variable

// Create a Vehicle class with a variable speed = 80 and a Car class with a variable speed = 120.
// Use super to display the parent class's speed from the Car class.

class Vehicle {

    int speed = 80;

}

class Car extends Vehicle {

    int speed = 120;

    void desk() {

        System.out.println("Speed: " + speed);
        System.out.println("Speed: " + super.speed);

    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        Car c1 = new Car();

        c1.desk();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 2. Super with Parent Class Method

// Create a Bank class with a method getInterestRate(). Create an SBI class that overrides this method. 
// Use super to call the parent class method before displaying the SBI-specific interest rate.

class Bank {

    void getInterestRate(){
        System.out.println("Hi");

    }
}

class SBI extends Bank {

        @Override

    void getInterestRate(){

        super.getInterestRate();

        System.out.println("Hello ");
    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        SBI s1 = new SBI();

        s1.getInterestRate();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 3. Super with Constructor

// Create a Person class with a parameterized constructor accepting name and age. Create a Student class with an 
// additional variable course. Use super() to initialize the parent class variables.

class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;
        
    }

    void desk() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Student extends Person {

    String course;

    Student(String name, int age, String course) {

        super(name, age);

        this.course = course;

    }

    void desk_0() {

        desk();

        System.out.println("Cource: " + course); 

    }

}

public class Super_With_iib {
    public static void main(String [] args) {

        Student s1 = new Student("Ani", 22, "CSE");

        s1.desk_0();

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 4. Super with Multiple Levels of Inheritance

// Create the following hierarchy:

// Person
//    |
// Employee
//    |
// Manager

// Each class should contain a variable named role. In Manager, use super appropriately to access the parent class variable.

class Person {

    String role = "Person";

    void desk() {

        System.out.println("Role: " + role);

    }
}

class Employee extends Person {

    String role = "Employee";

    void desk() {

        System.out.println("Role: " + role);

    }
}

class Manager extends Employee {

    String role = "Manager";

    void desk() {

        System.out.println("Role: " + role);
        System.out.println("Role: " + super.role);
        
    }
}

public class Super_With_iib {
    public static void main(String [] args) {
        
        Manager m1 = new Manager();

        m1.desk();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 5. Super Constructor and Method

// Create a Product class containing:
// - productName
// - price

// Create an ElectronicProduct class containing:
// - brand
// - warranty

// Use super() to initialize the parent properties and super to call a parent method that displays product details.

class Product {

    String productName;
    int price;

    Product(String productName, int price) {

        this.productName = productName;
        this.price = price;

    }

    void desk() {

        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }
}

class ElectronicProduct extends Product {

    String brand;
    int warranty;

    ElectronicProduct(String productName, int price, String brand, int warranty) {

        super(productName, price);

        this.brand = brand;
        this.warranty = warranty;

    }

    void desk_0() {

        super.desk();

        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " Years");

    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        ElectronicProduct e1 = new ElectronicProduct("TV", 55000, "LG", 5);

        e1.desk_0();

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 6. Output Prediction - Super

// Predict the output of the following program and explain why:

class A {
    int x = 10;

    void display() {
        System.out.println("A display");
    }
}

class B extends A {
    int x = 20;

    void show() {
        System.out.println(x);
        System.out.println(super.x);
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

// ans 

// 20
// 10
// A display



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 7. Super Constructor Execution

// Predict the output:

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}

public class Super_With_iib {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

// Then modify the program so that the child constructor receives a parameter.

// ans 

// Parent Constructor
// Child Constructor



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 8. Basic Instance Initializer Block

// Create a Student class containing:
// - name
// - age

// Use an instance initializer block to print:

// "Student object is being created"

// Create three objects and observe how many times the initializer block executes.

class Student {
    String name;
    int age;
    
    {
        System.out.println("Student object is being created");
    }
}

public class Super_With_iib {
    public static void main(String [] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 9. IIB and Constructor Order

// Create a class containing:
// - One instance variable
// - One instance initializer block
// - One constructor

// Display messages from each and determine the execution order.

class IIB {

    int age = 22; 

    {
        System.out.println("Hi");
    }

    IIB(){
        System.out.println("Hello");
    }
}

public class Super_With_iib {
    public static void main(String [] args) {
        IIB b1 = new IIB();
        
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 10. Multiple Instance Initializer Blocks

// Create a class with three instance initializer blocks and one constructor.

// Print:

// IIB 1
// IIB 2
// IIB 3
// Constructor

// Verify the execution order.


class IIB {

    {
        System.out.println("IIB 1");
    }

    {
        System.out.println("IIB 2");
    }

    {
        System.out.println("IIB 3");
    }

    IIB(){
        System.out.println("Constructor");
    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        IIB b1 = new IIB();

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 11. IIB with Instance Variables

// Create a BankAccount class containing:
// - accountNumber
// - balance

// Use an instance initializer block to set the initial balance to 1000.

// Create two objects and display their balances.

class BankAccount {

    int accountNumber;
    double balance;

    {
        balance = 1000;
    }
}

public class Super_With_iib{
    public static void main(String [] args) {

        BankAccount b1 = new BankAccount();
        b1.accountNumber = 101;

        BankAccount b2 = new BankAccount();
        b2.accountNumber = 102;

        System.out.println("Account Balance 1 : " + b1.balance);
        System.out.println("Account Balance 2 : " + b2.balance);

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 12. IIB with Calculation

// Create an Employee class containing:
// - basicSalary
// - hra
// - da
// - totalSalary

// Use an instance initializer block to calculate:

// totalSalary = basicSalary + hra + da

// Display the total salary using a method.

class Employee {

    int basicSalary = 55000; 
    int har = 4500;
    int da = 2600;
    int totalSalary;

    {
        totalSalary = basicSalary + har + da;
    }

    void desk(){

        System.out.println("Total Salary : " + totalSalary);
    }
}

public class Super_With_iib {
    public static void main(String [] args) {
        
        Employee e1 = new Employee();

        e1.desk();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 13. IIB and Multiple Objects

// Create a Mobile class with an instance initializer block that assigns a default value to a variable called batteryPercentage.

// Create three objects and display their battery percentage.

// Observe whether the initializer block executes once or multiple times.

class Mobile {

    int batteryPercentage;

    // Instance Initializer Block
    {
        batteryPercentage = 100;
        System.out.println("IIB Executed");
    }

    void display() {
        System.out.println("Battery Percentage : " + batteryPercentage + "%");
    }
}

public class Super_With_iib {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.display();

        Mobile m2 = new Mobile();
        m2.display();

        Mobile m3 = new Mobile();
        m3.display();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 14. Parent IIB and Child IIB

// Create the following hierarchy:

// Person
//    |
// Student

// Both classes should contain an instance initializer block.

// Also add a constructor to each class.

// Determine the execution order when a Student object is created.

class Person {

    // Parent IIB
    {
        System.out.println("Person IIB");
    }

    // Parent Constructor
    Person() {
        System.out.println("Person Constructor");
    }
}

class Student extends Person {

    // Child IIB
    {
        System.out.println("Student IIB");
    }

    // Child Constructor
    Student() {
        System.out.println("Student Constructor");
    }
}

public class Super_With_iib {

    public static void main(String[] args) {

        Student s1 = new Student();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 15. Parent IIB + Child IIB + Constructors

// Predict the output:

class A {
    {
        System.out.println("A IIB");
    }

    A() {
        System.out.println("A Constructor");
    }
}

class B extends A {
    {
        System.out.println("B IIB");
    }

    B() {
        super();
        System.out.println("B Constructor");
    }
}

public class Super_With_iib {
    public static void main(String[] args) {
        B obj = new B();
    }
}

// ans Output

// A IIB
// A Constructor
// B IIB
// B Constructor



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 16. Super Variable + IIB

// Create a parent class Employee with:
// int salary = 30000;
// Create a child class Manager with:
// int salary = 60000;
// Use an instance initializer block inside Manager to print:
// Manager Salary
// Employee Salary

// Use super to access the parent salary.

class Parent {

    int salary = 30000;

}
class Child extends Parent {

    int salary = 60000;

    {
        System.out.println("Manager Salary : " + salary);
        System.out.println("Employee Salary : " + super.salary);
    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        Child c1 = new Child();

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 17. Super Method + IIB

// Create a parent class Vehicle with a method:

// start()

// Override it in Car.

// Inside the Car instance initializer block:

// 1. Print "Car IIB"
// 2. Call the parent start() method using super.

// Then call the overridden method from the constructor.

class Parent {

    void start() {
        System.out.println("Vehicle Start");
    }
}

class Car extends Parent {

    {
        System.out.println("Car IIB");
        super.start();
    }

    @Override

    void start(){
        System.out.println("Car Start");
    }

    Car(){
        
        System.out.println("Car Concstructor");

        start();
    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        Car c1 = new Car();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 18. Output Prediction - IIB + Super

// Predict the output and explain why:

class Parent {
    int x = 10;

    {
        System.out.println("Parent IIB: " + x);
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    int x = 20;

    {
        System.out.println("Child IIB: " + x);
        System.out.println("Parent x: " + super.x);
    }

    Child() {
        System.out.println("Child Constructor");
    }
}

public class Super_With_iib {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 19. Real-Life Problem - Employee Management

// Create the following hierarchy:

// Employee
//    |
// Developer

// Employee class should contain:
// - name
// - salary
// - Constructor
// - Instance initializer block
// - displayEmployee()

// Developer class should contain:
// - language
// - Constructor
// - Instance initializer block
// - displayDeveloper()

// Requirements:
// - Use super() to initialize name and salary.
// - Use an IIB in both classes.
// - Display the complete developer information.
// - Observe the execution order of both IIBs and constructors.

class Employee {
    String name;
    double salary;
    
    {
        System.out.println("Employee IIB");
    }

    Employee(String name, double salary) {

        System.out.println("Emoloyee Constuctor");

        this.name = name;
        this.salary = salary;        
    }

    void displayEmployee() {

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);

    }

}

class Developer extends Employee {

    String language;

    {
        System.out.println("Developer IIB");
    }

    Developer(String name, double salary, String language) {

        super(name, salary);

        System.out.println("Developer Constructor");

        this.language = language;

    }

    void displayDeveloper() {

        displayEmployee();

        System.out.println("Developer Language: " + language);
    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        Developer d1 = new Developer("Ani", 150000, "JAVA");

        System.out.println("\n--- Developer Details ---");

        d1.displayDeveloper();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 20. Real-Life Problem - Online Shopping System

// Create the following hierarchy:

// Product
//    |
// Electronics
//    |
// Laptop

// Product class:
// - productName
// - price
// - Parameterized constructor
// - IIB to print "Product object initialized"

// Electronics class:
// - brand
// - warranty
// - Parameterized constructor
// - IIB to print "Electronics object initialized"

// Laptop class:
// - ram
// - processor
// - Parameterized constructor
// - IIB to print "Laptop object initialized"

// Requirements:
// 1. Use super() at each inheritance level.
// 2. Use IIB in all three classes.
// 3. Display all laptop details.
// 4. Observe the exact order of:
//    - Parent IIB
//    - Parent constructor
//    - Child IIB
//    - Child constructor
// 5. Create at least two Laptop objects and compare the execution order.

class Product {

    String productName;
    double price;

    {
        System.out.println("Product Object Initialized");
    }

    Product(String productName, double price) {

        this.productName = productName;
        this.price = price;

        System.out.println("Product Constructor");

    }

    void displayProduct() {

        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);

    }
}

class Electronics extends Product {

    String brand;
    int warranty;

    {
        System.out.println("Electronic Object Initialized");
    }

    Electronics(String productName, double price, String brand, int warranty) {

        super(productName, price);

        this.brand = brand;
        this.warranty = warranty;
        
        System.out.println("Electronic Constructor");
    }

    void displayElectronic() {

        displayProduct();

        System.out.println("Electronic Brand: " + brand);
        System.out.println("Electronic Warranty: " + warranty + " Years");

    }
}

class Laptop extends Electronics {

    int ram;
    String processor;

    {
        System.out.println("Laptop Object Initialized");
    }

    Laptop(String productName, double price, String brand, int warranty, int ram, String processor) {

        super(productName, price, brand, warranty);

        this.ram = ram;
        this.processor = processor;

        System.out.println("Laptop Constructor");

    }

    void displayLaptop() {

        displayElectronic();

        System.out.println("Laptop RAM: " + ram + " GB");
        System.out.println("Laptop Processor: " + processor);

    }

}

public class Super_With_iib {
    public static void main(String [] args) {

        System.out.println("\n--- Creating Laptop 1 ---");

        Laptop l1 = new Laptop("LOQ 15", 89000, "Lenovo", 3, 16, "i5 12450HX");

        System.out.println("\n--- Laptop 1  Details ---");

        l1.displayLaptop();

        System.out.println("\n--- Creating Laptop 2  ---");

        Laptop l2 = new Laptop("LOQ 16", 159000, "Lenovo", 4, 32, "i7 13450HX");

        System.out.println("\n--- Laptop 2  Details ---");

        l2.displayLaptop();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 21. IIB and Variable Declaration

// Create a program to check whether an instance initializer block can access:
// - An instance variable declared before the IIB.
// - An instance variable declared after the IIB.

// Explain the result.

class test {

    // Before IIB
    int age = 22;

    {
     System.out.println("Age: " + age);
     System.out.println("Name: " + name);   
    }

    // After IIB
    String name = "Ani";
}

public class Super_With_iib {
    public static void main(String [] args) {
        test t1 = new test();


    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 22. Default super() in Constructor

// Create a parent class and child class where the child constructor does not explicitly contain super().

// Check whether the parent constructor is called automatically.

class Parent {

    Parent() {

        System.out.println("Parent Constructor");

    }
}

class Child extends Parent {

    Child(){
        
        System.out.println("Child Constructor");

    }
}

public class Super_With_iib {
    public static void main(String [] args) {
        Child c1 = new Child ();

    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 23. IIB with Control Statements

// Create an instance initializer block containing:
// - if-else
// - for loop
// - method call

// Create an object and observe the execution.

class Test {

    int i = 1;

    {
        if(i < 5) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        for (int i = 1; i <= 5; i++){
            System.out.println("Number is: " + i);
        }
    }

        void desk(){
            System.out.println("Method initialized");
        }

    
}

public class Super_With_iib {
    public static void main(String [] args) {
        
        Test t1 = new Test();

        t1.desk();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 24. Static Block + IIB + Constructor

// Create a program containing:
// - Static block
// - Parent IIB
// - Parent constructor
// - Child IIB
// - Child constructor

// Create an object and predict the complete execution order.

class Parent{

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Parent IIB");
    }    

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Child IIB");
    }

    Child() {
        System.out.println("Child Constructor");
    }
}

public class Super_With_iib {
    public static void main(String [] args) {
        Child c1 = new Child();
    }
}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 25. Multiple IIBs with Inheritance

// Create a program with:
// - Two IIBs in the parent class.
// - Two IIBs in the child class.
// - Parent constructor.
// - Child constructor.
// - super().

// Create a child object and write the exact execution sequence.


class Parent {

    {
        System.out.println("Parent IIB 1");
    }

    {
        System.out.println("Parent IIB 2");
    }

    Parent() {
        System.out.println("Parant Constructor");
    }
}

class Child extends Parent {

    {
        System.out.println("Child IIB 1");
    }

    {
        System.out.println("Child IIB 2");
    }

    Child() {
        super();
        System.out.println("Child Constuctor");
    }
}

public class Super_With_iib {
    public static void main(String [] args) {

        Child c1 = new Child();

    }
}


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
