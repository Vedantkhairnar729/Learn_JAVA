// 1. Use classes and objects.
// 2. Use default constructors and parameterized constructors.
// 3. Do NOT use static keyword.
// 4. Do NOT use this keyword.
// 5. Create objects in the main() method.
// 6. Display the required information using methods.

//============================================================================================================================================================================

// 1. Create a class Student with data members:
//    name, rollNo and marks.

//    Create a default constructor that initializes the student
//    with some default values.

//    Create a method display() to display student details.

//    Create 2 objects and display their details.

class Student{

    //data members
    String name;
    int rollno;
    float mark;

    //default constructor
    Student(){
        name = "Vedant";
        rollno = 256;
        mark = 98;
    }

    //parameteris constructor
    Student(String StudentName, int RollNo, float Mark){
        name = StudentName;
        rollno = RollNo;
        mark = Mark;        

    }
    

    //method of display details 
    void Display(){
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Mark : " + mark);
        System.out.println("===================================");
    }

}

public class Practice{
    public static void main(String [] args){
       
        Student S1 = new Student();
        Student S2 = new Student("Avi", 256, 75);

        S1.Display();
        S2.Display();

    }
}

// Output //

Name : Vedant
Roll No : 256
Mark : 98.0
===================================
Name : Avi
Roll No : 256
Mark : 75.0
===================================


//============================================================================================================================================================================

// 2. Create a class Employee with data members:
//    name, employeeId and salary.

//    Create:
//    - A default constructor that assigns default values.
//    - A parameterized constructor that accepts name, employeeId
//      and salary.

//    Create one object using each constructor and display the details.

class Employee{

        // data member
        String name;
        int employeeId;
        int salary;
        
        // default constructor
    Employee(){
        name = "Vedant";
        employeeId = 26967;
        salary = 900000;
    }

        // parameterized constructer
    Employee(String empName, int empId, int empSalary){
        name = empName;
        employeeId = empId;
        salary = empSalary;
    }

        // method of display details
    void display(){
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Salary : " + salary);
        System.out.println("=========================================");
    }

}

public class Practice{
    public static void main( String [] args){
        Employee E1 = new Employee();
        Employee E2 = new Employee("Ved", 26895, 1900000);

        E1.display();
        E2.display();
    }
}

// Output //

Employee Name : Vedant
Employee Id : 26967
Employee Salary : 900000
=========================================
Employee Name : Ved
Employee Id : 26895
Employee Salary : 1900000
=========================================

//============================================================================================================================================================================

// 3. Create a class BankAccount with data members:
//    accountNumber, accountHolder and balance.

//    Create a default constructor that initializes:
//    accountNumber = 1001
//    accountHolder = "Unknown"
//    balance = 0

//    Create a parameterized constructor to accept all three values.

//    Create objects using both constructors and display the details.

class BankAccount{

    //data members
    int accNo;
    String accHolder;
    int balance;

    //default constructor
    BankAccount(){
        accNo = 1001;
        accHolder = "Unkonown";
        balance = 0;

    }
    
    //parametrized constructor
    BankAccount(int accountNo, String accountHolder, int accBalance){
        accNo = accountNo;
        accHolder = accountHolder;
        balance = accBalance;
    }
    
    // method of desplay details
    void display(){
        System.out.println("Account No : " + accNo);
        System.out.println("Account Holder : " + accHolder);
        System.out.println("Account Balance : " + balance);
        System.out.println("==============================================");
    }
}
public class Practice{
    public static void main( String [] args){
        BankAccount bankManager1 = new BankAccount();
        BankAccount bankManager2 = new BankAccount(1002, "vedant", 199999999);

        bankManager1.display();
        bankManager2.display();

    }
} 

// Output //

Account No : 1001
Account Holder : Unkonown
Account Balance : 0
==============================================
Account No : 1002
Account Holder : vedant
Account Balance : 199999999
==============================================


//============================================================================================================================================================================

// 4. Create a class Book with data members:
//    title, author and price.

//    Create a default constructor with default book details.

//    Create a parameterized constructor that accepts title,
//    author and price.

//    Create 3 book objects:
//    - One using the default constructor.
//    - Two using the parameterized constructor.

//    Display all details.

class Book{
    // data members
    String title;
    String author;
    int price;
    
    // default constructor
    Book(){
        title = "The Nobel";
        author = "Mical Word";
        price = 2500;
    }

    // parameterized constructer
    Book(String BookTitle, String BookAuthor, int BookPrice){
        title = BookTitle;
        author = BookAuthor;
        price = BookPrice;
    }

    // method of display details
    void display(){
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book Price : " + price);
        System.out.println("===========================================");
    }
}

public class Practice{
    public static void main(String [] args){

        Book B1 = new Book();
        Book B2 = new Book("Moon Time", "Astor Ment", 5250);
        Book B3 = new Book("Agresive Mind", "Mild Optic", 2500);

        B1.display();
        B2.display();
        B3.display();
    }
}

// Output //

Book Title : The Nobel
Book Author : Mical Word
Book Price : 2500
===========================================
Book Title : Moon Time
Book Author : Astor Ment
Book Price : 5250
===========================================
Book Title : Agresive Mind
Book Author : Mild Optic
Book Price : 2500
===========================================


//============================================================================================================================================================================

// 5. Create a class Product with data members:
//    productId, productName and price.

//    Create a default constructor and a parameterized constructor.

//    Create 3 objects using different constructors.

//    Write a method displayProduct() to display the product details.

class Product{
    //data members
    int productId;
    String productName;
    int productPrice;
        
    // default constructor
    Product(){
        productId = 2655;
        productName = "OnePlus 4";
        productPrice = 25000;
    }

    //parametarized constructor
    Product(int proId, String proName, int proPrice){
        productId = proId;
        productName = proName;
        productPrice = proPrice;
    }

        // method of display details
    void display(){
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Product Price : " + productPrice);
        System.out.println("==========================================");
    }
}

public class Practice{
    public static void main(String [] args){

        Product P1 = new Product();
        Product P2 = new Product(4568, "Realme 10", 56200);
        Product P3 = new Product(2568, "Poco 6", 25000);

        P1.display();
        P2.display();
        P3.display();
    }
}

// Output //

Product ID : 2655
Product Name : OnePlus 4
Product Price : 25000
==========================================
Product ID : 4568
Product Name : Realme 10
Product Price : 56200
==========================================
Product ID : 2568
Product Name : Poco 6
Product Price : 25000
==========================================


//============================================================================================================================================================================

// 6. Create a class Car with data members:
//    brand, model and price.

//    Create a default constructor that initializes default values.

//    Create a parameterized constructor that accepts all details.

//    Create 4 car objects and display their details.

//    Also create a method that displays the car whose price is
//    greater than 10,00,000.

class Car{
    //data members
    String brand;
    String model;
    int price;
    //default constructor
    Car(){
        brand = "Tayota";
        model = "Land Cruser";
        price = 1000000;
    }
    //parametarized constructor
    Car(String carBrand, String carModel, int carPrice){
        brand = carBrand;
        model = carModel;
        price = carPrice;
    }
    //method of display details
    void dcar(){
        if (price > 1000000){
            System.out.println("Car Brand : " + brand);
            System.out.println("Car Model : " + model);
            System.out.println("Car price : " + price);
            System.out.println("===============================================");
        }
        
    }
    
}
public class Practice{
    public static void main(String [] args){
        Car C1 = new Car();
        Car C2 = new Car("Audi","R8",580000000);
        Car C3 = new Car("Pagani", "Roster",2000000);
        Car C4 = new Car("BMW", "M5", 4500000);


        C1.dcar();
        C2.dcar();
        C3.dcar();
        C4.dcar();
    }
}

// // Output //

Car Brand : Audi
Car Model : R8
Car price : 580000000
===============================================
Car Brand : Pagani
Car Model : Roster
Car price : 2000000
===============================================
Car Brand : BMW
Car Model : M5
Car price : 4500000
===============================================

    
//============================================================================================================================================================================

// 7. Create a class Employee with data members:
//    name, id, salary and department.

//    Create a default constructor.

//    Create a parameterized constructor that accepts all four values.

//    Create 5 employee objects.

//    Display the details of employees whose salary is greater than 50,000.

class Employee{
    //data members
    String name;
    int id;
    int salary;
    String department;
    //default constructor
    Employee(){
        name = "Piyu";
        id = 2655;
        salary = 2500000;
        department = "Civil";
    }
    //parameterized constructor
    Employee(String empName, int empId, int empSalary, String empDepartment){
        name = empName;
        id = empId;
        salary = empSalary;
        department = empDepartment;
    }
    // method of display details
    void demp(){
        if(salary > 50000)
        {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Department : " + department);
        System.out.println("======================================");
        }
    }

}
public class Practice{
    public static void main(String [] args){
        
        Employee E1 = new Employee();
        Employee E2 = new Employee("Vedant", 101, 600000, "IT");
        Employee E3 = new Employee("Rahul", 102, 45000, "HR");
        Employee E4 = new Employee("Amit", 103, 75000, "Finance");
        Employee E5 = new Employee("Priya", 104, 50000, "IT");
        Employee E6 = new Employee("Sneha", 105, 90000, "Marketing");

        E1.demp();
        E2.demp();
        E3.demp();

    }
}

// Output //

Employee Name : Piyu
Employee ID : 2655
Employee Salary : 2500000
Employee Department : Civil
======================================
Employee Name : Vedant
Employee ID : 101
Employee Salary : 600000
Employee Department : IT
======================================


//============================================================================================================================================================================

// 8. Create a class Mobile with data members:
//    brand, model, price and storage.

//    Create:
//    - A default constructor.
//    - A parameterized constructor.

//    Create objects using both constructors.

//    Create a method that displays whether the mobile is
//    "Budget" or "Premium" based on its price.

class Mobile{
    String brand;
    String model;
    int price;
    int storage;

    Mobile(){
        brand = "Oppo";
        model = "R8";
        price = 15000;
        storage = 125;
    }
    
    Mobile(String mobileBrand, String mobileModel, int mobilePrice, int mobileStorage){
        brand = mobileBrand;
        model = mobileModel;
        price = mobilePrice;
        storage = mobileStorage;
    }
    
    void cardetails(){
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile Model : " + model);
        System.out.println("Mobile Price : " + price);
        System.out.println("Mobile Storage : " + storage + "GB");
        System.out.println("========================================");

    }

    void range(){
        if(price <= 20000){
            System.out.println("Category : Budget");
        }
        else{
            System.out.println("Category : Premium");
        }
    }
}

public class Practice{
    public static void main(String [] args){
        Mobile M1 = new Mobile();
        Mobile M2 = new Mobile("Vivo", "T3x", 35022, 256);
        
        M1.range();
        M1.cardetails();
       
        M2.range();
        M2.cardetails();
    }
}

// Output //

Category : Budget
Mobile Brand : Oppo
Mobile Model : R8
Mobile Price : 15000
Mobile Storage : 125GB
========================================
Category : Premium
Mobile Brand : Vivo
Mobile Model : T3x
Mobile Price : 35022
Mobile Storage : 256GB
========================================


//============================================================================================================================================================================

// 9. Create a class Rectangle with data members:
//    length and breadth.

//    Create:
//    - A default constructor that assigns default values.
//    - A parameterized constructor that accepts length and breadth.

//    Create objects using both constructors.

//    Create methods to calculate:
//    - Area
//    - Perimeter

//    Display the results.

class Rectangle {
    int length;
    int breadth;

    Rectangle(){
        length = 6;
        breadth = 9;
    }
    Rectangle(int recLength, int recBreadth){
        length = recLength;
        breadth = recBreadth;
    }

    void displayAngle(){
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("=======================================");
    }

    double calcArea(){
        return length * breadth;
    }
    double calcPara(){
        return 2 * (length + breadth);
    }
}
public class Practice{
    public static void main(String [] args){
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(10,5);

        
        System.out.println("Area : " + R1.calcArea());
        System.out.println("Perimeter : " + R1.calcPara());
        R1.displayAngle();

        System.out.println("Area : " + R2.calcArea());
        System.out.println("Perimeter : " + R2.calcPara());
        R2.displayAngle();
    }
}

// Output //

Area : 54.0
Perimeter : 30.0
Length : 6
Breadth : 9
=======================================
Area : 50.0
Perimeter : 30.0
Length : 10
Breadth : 5
=======================================

//============================================================================================================================================================================

// 10. Create a class BankCustomer with data members:
//     customerName, accountNumber and balance.

//     Create a default constructor.

//     Create a parameterized constructor.

//     Create 3 objects using the constructors.

//     Create a method to display the account type:
//     - balance >= 1,00,000 → "Premium Customer"
//     - balance >= 50,000 → "Regular Customer"
//     - otherwise → "Basic Customer"

class BankCustomer{
    String custName;
    int custNo;
    int custBalance;
    
    BankCustomer(){
        custName = "Avi";
        custNo = 201;
        custBalance = 250000;
    }
    BankCustomer(String bankCustName, int bankCustNo, int bankCustBalance){
        custName = bankCustName;
        custNo = bankCustNo;
        custBalance = bankCustBalance;
    }
    void displayAcc(){
        System.out.println("Customer Name : " + custName);
        System.out.println("Customer Number : " + custNo);
        System.out.println("Customer Balance : " + custBalance);
        
    }

    void accType(){
        if (custBalance >= 100000){
            System.out.println("Customer Account Type : Premium Customer");
        }
        else if (custBalance >= 50000){
            System.out.println("Customer Account Type : Regular Customer");
        }
        else{
            System.out.println("Customer Account Type : Basic Customer");
        }
        System.out.println("====================================================");
    }
}
public class Practice{
    public static void main(String [] args){
        BankCustomer b1 = new BankCustomer("Vedant", 26058488, 100000);
        BankCustomer b2 = new BankCustomer("Avi", 26058499, 50000);
        BankCustomer b3 = new BankCustomer("Vishu", 26585595, 15000);

        b1.displayAcc();
        b1.accType();

        b2.displayAcc();
        b2.accType();

        b3.displayAcc();
        b3.accType();
    }
}

// Output //

Customer Name : Vedant
Customer Number : 26058488
Customer Balance : 100000
Customer Account Type : Premium Customer
====================================================
Customer Name : Avi
Customer Number : 26058499
Customer Balance : 50000
Customer Account Type : Regular Customer
====================================================
Customer Name : Vishu
Customer Number : 26585595
Customer Balance : 15000
Customer Account Type : Basic Customer
====================================================

//============================================================================================================================================================================

// 11. Create a class Laptop with data members:
//     brand, ram, storage and price.

//     Create a default constructor and a parameterized constructor.

//     Create 4 laptop objects.

//     Display the details of the laptop having the highest price.

//     Do not use static or this.

class Laptop{
    String brand;
    int ram;
    int storage;
    int price;

    Laptop(){
        brand = "Asus";
        ram = 8;
        storage = 512;
        price = 55000;
    }

    Laptop(String newBrand, int newRam, int newStorage, int newPrice){
        brand = newBrand;
        ram = newRam;
        storage = newStorage;
        price = newPrice;
    }

    void displayDetails(){
        System.out.println("Laptop Brand : " + brand);
        System.out.println("Laptop Ram : " + ram + " GB");
        System.out.println("Laptop Storage : " + storage + " GB");
        System.out.println("Laptop Price : " + price);
    }
    int calcLap(){
        return (price);
    }
}

public class Practice{
    public static void main(String [] args){

        Laptop l1 = new Laptop("HP", 8, 512, 53000);
        Laptop l2 = new Laptop("Dell", 16, 512, 59000);
        Laptop l3 = new Laptop("Lenovo", 12, 512, 93000);
        Laptop l4 = new Laptop("Asus", 16, 512, 89000);

        Laptop highest = l1;

        if (l2.calcLap() > highest.calcLap()){
            highest = l2;
        }
        if (l3.calcLap() > highest.calcLap()){
            highest = l3;
        }
        if (l4.calcLap() > highest.calcLap()){
            highest = l4;
        }

        highest.displayDetails();
    }
}

// Output //

Laptop Brand : Lenovo
Laptop Ram : 12 GB
Laptop Storage : 512 GB
Laptop Price : 93000


//============================================================================================================================================================================

// 12. Create a class Student with data members:
//     name, rollNo, marks1, marks2 and marks3.

//     Create:
//     - A default constructor.
//     - A parameterized constructor.

//     Create a method calculatePercentage().

//     Create 3 student objects using parameterized constructors
//     and display the student having the highest percentage.

class Student{
    String name;
    int rollNo;
    int mark1;
    int mark2;
    int mark3;

    Student(){
        name = "Avi";
        rollNo = 20;
        mark1 = 88;
        mark2 = 82;
        mark3 = 78;
    }
    Student(String studentName, int studentRollNo, int studentMark1, int studentMark2, int studentMark3){
        name = studentName;
        rollNo = studentRollNo;
        mark1 = studentMark1;
        mark2 = studentMark2;
        mark3 = studentMark3;
    }
    void display(){
        System.out.println("Student Name : " + name);
        System.out.println("Student Roll No : " + rollNo);
        System.out.println("Student Mark 1 : " + mark1);
        System.out.println("Student Mark 2 : " + mark2);
        System.out.println("Student Mark 3 : " + mark3);
    }

    double calcMark(){
        return (mark1 + mark2 + mark3) / 3.0;
    }
}
public class Practice{
    public static void main(String [] args){
    
        Student s1 = new Student("Vedant", 101, 85, 90, 88);
        Student s2 = new Student("Amit", 103, 78, 85, 80);
        Student s3 = new Student("Rahul", 102, 92, 89, 95);

        Student highest = s1;

        if (s2.calcMark() > highest.calcMark()){
            highest = s2;
        }
        if (s3.calcMark() > highest.calcMark()){
            highest = s3;
        }

        highest.display();        
    }
}

// Output //

Student Name : Rahul
Student Roll No : 102
Student Mark 1 : 92
Student Mark 2 : 89
Student Mark 3 : 95


//============================================================================================================================================================================

// 13. Create a class HospitalPatient with data members:
//     patientName, patientId, age and billAmount.

//     Create a default constructor.

//     Create a parameterized constructor accepting all values.

//     Create 4 patient objects.

//     Create a method displayBillStatus():

//     billAmount >= 50,000 → "High Bill"
//     billAmount >= 20,000 → "Medium Bill"
//     otherwise → "Low Bill"

//     Display all patient details with their bill status.

class HospitalPatient{
    String patientName;
    int patientId;
    int patientAge;
    int billAmount;

    HospitalPatient(){
        patientName = "Piyu";
        patientId = 101;
        patientAge = 21;
        billAmount = 50000;
    }
    HospitalPatient(String hostName, int hostId, int hostAge, int hostBill){
        patientName = hostName;
        patientId = hostId;
        patientAge = hostAge;
        billAmount = hostBill;
    }
    void displayBillStatus(){
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Age : " + patientAge);
        System.out.println("Patient Bill Amount : "+ billAmount);
        
    }

    void category(){
        if (billAmount >= 50000){
            System.out.println("Bill Amount Status : High Cost");
        }
        else if (billAmount >= 20000){
            System.out.println("Bill Amount Status : Medium Cost");
        }
        else{
            System.out.println("Bill Amount Status : Low Cost");
        }
        System.out.println("=====================================");
    }
}
public class Practice{
    public static void main(String [] args){
        HospitalPatient h1 = new HospitalPatient();
        HospitalPatient h2 = new HospitalPatient("Suju", 102, 23, 1500);
        HospitalPatient h3 = new HospitalPatient("Priti", 103, 22, 50000);
        HospitalPatient h4 = new HospitalPatient("Satya", 104, 25, 20000);

        h1.displayBillStatus();
        h1.category();

        h2.displayBillStatus();
        h2.category();
        
        h3.displayBillStatus();
        h3.category();

        h4.displayBillStatus();
        h4.category();   
    }

}

// Output //

Patient Name : Piyu
Patient ID : 101
Patient Age : 21
Patient Bill Amount : 50000
Bill Amount Status : High Cost
=====================================
Patient Name : Suju
Patient ID : 102
Patient Age : 23
Patient Bill Amount : 1500
Bill Amount Status : Low Cost
=====================================
Patient Name : Priti
Patient ID : 103
Patient Age : 22
Patient Bill Amount : 50000
Bill Amount Status : High Cost
=====================================
Patient Name : Satya
Patient ID : 104
Patient Age : 25
Patient Bill Amount : 20000
Bill Amount Status : Medium Cost
=====================================



//============================================================================================================================================================================

// 14. Create a class Movie with data members:
//     movieName, director, rating and ticketPrice.

//     Create a default constructor.

//     Create a parameterized constructor.

//     Create 5 movie objects.

//     Create a method to display movies having:
//     rating >= 8

//     Also calculate the total ticket price of all movies.

class Movie{
    String movieName;
    String director;
    double rating;
    int ticketPrice;

    Movie(){
        movieName = "The Shawshank Redemption (1994)";
        director = "Frank Darabont";
        rating = 9.3;
        ticketPrice = 1500;
    }
    Movie(String moviName, String moviDirector, double moviRating, int movitPrice){
        movieName = moviName;
        director = moviDirector;
        rating = moviRating;
        ticketPrice = movitPrice;
    }
    void display(){
        if (rating >= 8){
            System.out.println("Movie Name : " + movieName);
            System.out.println("Movie Director : " + director);
            System.out.println("Movie Rating : " + rating);
            System.out.println("Movie Ticket Price : " + ticketPrice);
            System.out.println("=====================================");
        }
    }
}
public class Practice{
    public static void main(String [] args){
        Movie m1 = new Movie();
        Movie m2 = new Movie("The Godfather", "Francis Ford", 7.5, 1000);
        Movie m3 = new Movie("The Shawshank", "Frank Darabont", 8.8, 1200);
        Movie m4 = new Movie("3 Idiots", "Rajkumar Hirani", 8.4, 500);
        Movie m5 = new Movie("Curuption", "Narendra Modi", 9.9, 10000);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();

        int total = m1.ticketPrice
                  + m2.ticketPrice
                  + m3.ticketPrice
                  + m4.ticketPrice
                  + m5.ticketPrice;
        System.out.println("Total Ticket Price : " + total);
        System.out.println("=========================================");
    }
}

// Output //

Movie Name : The Shawshank Redemption (1994)
Movie Director : Frank Darabont
Movie Rating : 9.3
Movie Ticket Price : 1500
=====================================
Movie Name : The Shawshank
Movie Director : Frank Darabont
Movie Rating : 8.8
Movie Ticket Price : 1200
=====================================
Movie Name : 3 Idiots
Movie Director : Rajkumar Hirani
Movie Rating : 8.4
Movie Ticket Price : 500
=====================================
Movie Name : Curuption
Movie Director : Narendra Modi
Movie Rating : 9.9
Movie Ticket Price : 10000
=====================================
Total Ticket Price : 14200
=========================================


//============================================================================================================================================================================

// 15. CHALLENGE QUESTION

//     Create a class Employee with the following data members:

//     name
//     employeeId
//     department
//     salary
//     experience

//     Requirements:

//     1. Create a default constructor that initializes all values
//        with suitable default values.

//     2. Create a parameterized constructor that accepts all
//        employee details.

//     3. Create at least 5 employee objects using the parameterized
//        constructor.

//     4. Create one employee object using the default constructor.

//     5. Create a method displayEmployee() to display employee details.

//     6. Create a method calculateBonus():

//        Experience >= 10 years → 20% of salary
//        Experience >= 5 years  → 15% of salary
//        Experience < 5 years   → 10% of salary

//     7. Display the employee having the highest salary.

//     8. Display the employee having the highest experience.

//     9. Display the bonus of every employee.

//     10. Do NOT use static keyword.
//         Do NOT use this keyword.

class Employee{

    String name;
    int employeeId;
    String department;
    int salary;
    int experience;

    Employee(){
        name = "suju";
        employeeId = 1578;
        department = "Electric";
        salary = 58625;
        experience = 22;
    }
    Employee(String empName, int empId, String empDepartment, int empSalary, int empExpe){
        name = empName;
        employeeId = empId;
        department = empDepartment;
        salary = empSalary;
        experience = empExpe;
    }
    void desplayEmployee(){
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Department : " + department);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Experience " + experience + " Years");
        System.out.println("==================================================");
    }
     
    // Calculate bonus
    double calculateBonus(){
        if(experience >= 10){
            return salary * 0.20;
        }
        else if (experience >= 5){
            return salary * 0.15;
        }
        else{
            return salary * 0.10;
        }
    }
}

public class Practice{
    public static void main(String [] args){

        Employee E1 = new Employee();

        Employee E2 = new Employee("Vedant", 101, "IT", 90000, 6);
        Employee E3 = new Employee("Rahul", 102, "HR", 75000, 4);
        Employee E4 = new Employee("Amit", 103, "Finance", 120000, 12);
        Employee E5 = new Employee("Priya", 104, "IT", 95000, 8);
        Employee E6 = new Employee("Sneha", 105, "Marketing", 60000, 3);

        E1.desplayEmployee();
        E2.desplayEmployee();
        E3.desplayEmployee();
        E4.desplayEmployee();
        E5.desplayEmployee();
        E6.desplayEmployee();
        

    }
}

// Output //

Employee Name : suju
Employee ID : 1578
Employee Department : Electric
Employee Salary : 58625
Employee Experience 22 Years
==================================================
Employee Name : Vedant
Employee ID : 101
Employee Department : IT
Employee Salary : 90000
Employee Experience 6 Years
==================================================
Employee Name : Rahul
Employee ID : 102
Employee Department : HR
Employee Salary : 75000
Employee Experience 4 Years
==================================================
Employee Name : Amit
Employee ID : 103
Employee Department : Finance
Employee Salary : 120000
Employee Experience 12 Years
==================================================
Employee Name : Priya
Employee ID : 104
Employee Department : IT
Employee Salary : 95000
Employee Experience 8 Years
==================================================
Employee Name : Sneha
Employee ID : 105
Employee Department : Marketing
Employee Salary : 60000
Employee Experience 3 Years
==================================================