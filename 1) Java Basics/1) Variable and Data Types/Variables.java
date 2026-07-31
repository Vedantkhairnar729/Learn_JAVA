import java.util.*;

public class Variables {
    public static void main(String[] args) {

    

// 1. Java Basic //

// type of variable

// String - stores text, such as "Hello". String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false

//Ex 1:
    String name = "Vedant";
    // System.out.println(name);

//Ex 2:
    int myNum = 15;
    // System.out.println(myNum);

//Ex 3:
    int yourNum;
    yourNum = 30;
    // System.out.println(yourNum);

//Ex 4: OverWrite
    int selfNum = 10;
    selfNum = 20; //new value
    // System.out.println(selfNum);

//Ex 5: Final Variable "constant"
    final int ownNum = 22;
    // System.out.println(ownNum);

//Ex 6: How to declare Variables of other types
    int firstNum = 07;
    char myLetter = 'V';
    boolean myBool = true;
    String myText = "Hello";
    float myFloatNum = 5.99f;       // Store decimal Number (single precision)
    double mySalary = 100000000.50; // Store decimal Numbers (double precision)

    System.out.println(firstNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    System.out.println(myFloatNum);
    System.out.println(mySalary);
    

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//// Print Variables ////

//Ex 1: 
    String name = "Vedant";
    System.out.println("Hello " + name);

//Ex 2:
    String firstName = "Vedant ";
    String lastName = "Khairnar";
    String fullName = firstName + lastName;
    System.out.println(fullName);

//Ex 3: Addition
    int x = 5;
    int y = 6;
    System.out.println(x + y);

//Ex 4: 
    int x = 5;
    int y = 6;
    System.out.println("The sum is " + x + y); // normal print
    System.out.println("The sum is " + (x + y)); // addition


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//// Declare Multiple Variables ////

//Ex 1:
    int x = 5;
    int y = 6;
    int z = 50;
    System.out.println(x + y + z);

//in Short
    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);

//Ex 2: One Value to Multiple Variables (same value)
    int x, y, z;
    x = y = z = 50;
    System.out.println(x + y + z);

//Ex 3:
    String firstName = "Vedant ", lastName = "Khairnar";
    System.out.println(firstName + lastName);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//// Identifiers ////

//Ex 1:
    int minutesPerHour = 60; //good
    int m = 60; // not easy to understand what is m actually is

//Ex 2:Invalid identifiers :Error
    int 2ndNumber = 5; //cannot start with a digit
    int my var = 10;   // cannot contain spaces
    int int = 20;       // cannpt use reserved keywords


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//// Constants (final) ////

//Ex 1:Error
    final int myNum = 15;
    myNum = 20;  // Error: Cannot assign a value to final variable 'myNum'
    System.out.println(myNum);

//Ex 2: Final Variables
    final int MINUTES_PER_HOUR = 60;
    final int BIRTHYEAR = 1985;
    System.out.println(MINUTES_PER_HOUR);
    System.out.println(BIRTHYEAR);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//// Real-Life Examples ////

//Ex 1: Student data
    String studentName = "Veanu";
    int studentID = 1152;
    int studentAge = 22;
    float studentFee = 25.56f;
    char studentGrade = 'A';
    
    System.out.println("Student name " + studentName);
    System.out.println("Student id " + studentID);
    System.out.println("Student age " + studentAge);
    System.out.println("Student fee " + studentFee);
    System.out.println("Student grade " + studentGrade);

//Ex 2: Calculate the Area of a Rectangle
    
    // Create integer variables
    int length = 4;
    int width = 6;
    int area;

    // Calculate the area of a rectangle
    area = length * width;

    // Print variables
    System.out.println("Length is: " + length);
    System.out.println("Width is: " + width);
    System.out.println("Area of rectangle is: " + area);




}
}


