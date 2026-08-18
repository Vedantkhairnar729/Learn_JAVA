import java.util.*;


// Instructions:
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

public class Assingment{
    public static void main(String [] args){
       
        Student S1 = new Student();
        Student S2 = new Student("Vedant", 256, 55);

        S1.Display();
        S2.Display();

    }
}


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

public class Assingment{
    public static void main( String [] args){
        Employee E1 = new Employee();
        Employee E2 = new Employee("Ved", 26895, 1900000);

        E1.display();
        E2.display();
    }
}



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
    void account(){
        System.out.println("Account No : " + accNo);
        System.out.println("Account Holder : " + accHolder);
        System.out.println("Account Balance : " + balance);
        System.out.println("==============================================");
    }
}
public class Assingment{
    public static void main( String [] args){
        BankAccount BankManager1 = new BankAccount();
        BankAccount BankManager2 = new BankAccount(1002, "vedant", 199999999);

        BankManager1.account();
        BankManager2.account();

    }
} 


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

public class Assingment{
    public static void main(String [] args){

        Book B1 = new Book();
        Book B2 = new Book("Moon Time", "Astor Ment", 5250);
        Book B3 = new Book("Agresive Mind", "Mild Optic", 2500);

        B1.display();
        B2.display();
        B3.display();
    }
}


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

    public class Assingment{
        public static void main(String [] args){

            Product P1 = new Product();
            Product P2 = new Product(4568, "Realme 10", 56200);

            P1.display();
            P2.display();
        }
    }


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
        price = 600000;
    }
    //parametarized constructor
    Car(String carBrand, String carModel, int carPrice){
        brand = carBrand;
        model = carModel;
        price = carPrice;
    }
    //method of display details
    void dcar(){
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Car price : " + price);
        System.out.println("===============================================");

    }
}
public class Assingment{
    public static void main(String [] args){
        Car C1 = new Car();
        Car C2 = new Car("Audi","R8",580000000);

        C1.dcar();
        C2.dcar();
    }
}


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
        salary = 500000;
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
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Department : " + department);
        System.out.println("======================================");
    }


}
public class Assingment{
    public static void main(String [] args){
        
        Employee E1 = new Employee();
        Employee E2 = new Employee("Vedant", 101, 600000, "IT");
        Employee E3 = new Employee("Rahul", 102, 45000, "HR");
        Employee E4 = new Employee("Amit", 103, 75000, "Finance");
        Employee E5 = new Employee("Priya", 104, 50000, "IT");
        Employee E6 = new Employee("Sneha", 105, 90000, "Marketing");

        //Display employee whose salary is greater than 50,000
        if (E1.salary > 50000){
            E1.demp();
        }
        if (E2.salary > 50000){
            E2.demp();
        }
        if (E3.salary > 50000){
            E3.demp();
        }
        if (E4.salary > 50000){
            E4.demp();
        }
        if (E5.salary > 50000){
            E5.demp();
        }
        if (E6.salary > 50000){
            E6.demp();
        }
    }
}


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

public class Assingment{
    public static void main(String [] args){
        Mobile M1 = new Mobile();
        Mobile M2 = new Mobile("Vivo", "T3x", 35022, 256);
        
        M1.range();
        M1.cardetails();
       
        M2.range();
        M2.cardetails();
    }
}


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
public class Assingment{
    public static void main(String [] args){
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(10,5);

        R1.displayAngle();
        System.out.println("Area : " + R1.calcArea());
        System.out.println("Perimeter : " + R1.calcPara());

        R2.displayAngle();
        System.out.println("Area : " + R2.calcArea());
        System.out.println("Perimeter : " + R2.calcPara());
    }
}


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

//============================================================================================================================================================================

// 11. Create a class Laptop with data members:
//     brand, ram, storage and price.

//     Create a default constructor and a parameterized constructor.

//     Create 4 laptop objects.

//     Display the details of the laptop having the highest price.

//     Do not use static or this.

//============================================================================================================================================================================

// 12. Create a class Student with data members:
//     name, rollNo, marks1, marks2 and marks3.

//     Create:
//     - A default constructor.
//     - A parameterized constructor.

//     Create a method calculatePercentage().

//     Create 3 student objects using parameterized constructors
//     and display the student having the highest percentage.

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

//============================================================================================================================================================================

// 14. Create a class Movie with data members:
//     movieName, director, rating and ticketPrice.

//     Create a default constructor.

//     Create a parameterized constructor.

//     Create 5 movie objects.

//     Create a method to display movies having:
//     rating >= 8

//     Also calculate the total ticket price of all movies.

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

public class Assingment{
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