JAVA BASICS — SHORT DEFINITIONS + CODE
==========================================

1. VARIABLES
Definition: A variable is a named memory location used to store a value.

Syntax:
int age = 20;

Examples:
int number = 10;
String name = "Vedant";
double price = 99.50;
char grade = 'A';
boolean passed = true;


2. DATA TYPES
Definition: A data type tells Java what kind of value a variable can store.

int      → whole numbers
long     → large whole numbers
float    → decimal numbers
double   → decimal numbers with more precision
char     → one character
boolean  → true or false
String   → text

Examples:
int age = 20;
double salary = 25000.50;
char grade = 'A';
boolean pass = true;
String name = "Vedant";


3. SCANNER INPUT
Definition: Scanner is used to take input from the user.

Import:
import java.util.Scanner;

Create:
Scanner sc = new Scanner(System.in);

Input:
int num = sc.nextInt();
long num = sc.nextLong();
float num = sc.nextFloat();
double num = sc.nextDouble();
String word = sc.next();
String line = sc.nextLine();
char ch = sc.next().charAt(0);

Close:
sc.close();


4. OPERATORS
Definition: Operators are symbols used for calculation, comparison, and logic.

Arithmetic:
+  addition
-  subtraction
*  multiplication
/  division
%  remainder

Comparison:
==  equal
!=  not equal
>   greater than
<   less than
>=  greater than or equal
<=  less than or equal

Logical:
&&  AND
||  OR
!   NOT

Increment / decrement:
i++;
i--;

Assignment:
a += 5;
a -= 5;
a *= 5;
a /= 5;


5. IF
Definition: if runs code when a condition is true.

if (age >= 18) {
    System.out.println("Adult");
}


6. IF-ELSE
Definition: if-else chooses between two possible blocks.

if (num % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}


7. ELSE-IF LADDER
Definition: An else-if ladder checks multiple conditions one by one.

if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else if (marks >= 60) {
    System.out.println("C");
} else {
    System.out.println("Fail");
}


8. NESTED IF-ELSE
Definition: A nested if is an if statement inside another if statement.

if (username.equals("admin")) {
    if (password.equals("1234")) {
        System.out.println("Login Successful");
    } else {
        System.out.println("Invalid Password");
    }
} else {
    System.out.println("Invalid Username");
}


9. SWITCH
Definition: switch selects one option from multiple fixed cases.

int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}

break   → stops the switch
default → runs when no case matches


10. TERNARY OPERATOR
Definition: The ternary operator is a short form of simple if-else.

Syntax:
condition ? valueIfTrue : valueIfFalse;

Example:
String result = (age >= 18) ? "Adult" : "Minor";
int max = (a > b) ? a : b;


11. FOR LOOP
Definition: A for loop repeats code when the number of repetitions is known.

Syntax:
for (initialization; condition; update) {
    // code
}

Example:
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

Common:
for (int i = 1; i <= 10; i++)   → increasing
for (int i = 10; i >= 1; i--)   → decreasing
for (int i = 2; i <= 20; i += 2) → step by 2


12. WHILE LOOP
Definition: A while loop repeats code while its condition is true.

int i = 1;

while (i <= 10) {
    System.out.println(i);
    i++;
}


13. NESTED LOOPS
Definition: A nested loop is a loop inside another loop, commonly used for patterns.

for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

Output:
*
**
***
****
*****

Outer loop → rows
Inner loop → columns/items


14. ARRAYS
Definition: An array stores multiple values of the same data type.

Create:
int[] numbers = new int[5];

Initialize:
int[] numbers = {10, 20, 30, 40, 50};

Access:
System.out.println(numbers[0]);

Important:
Array index starts from 0.

Length:
numbers.length

Loop:
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

For-each:
for (int num : numbers) {
    System.out.println(num);
}


15. STRINGS
Definition: A String is a sequence of characters used to store text.

Create:
String name = "Vedant";

Common methods:
name.length();                   → String length
name.charAt(0);                  → character at index 0
name.equals("Vedant");           → compare Strings
name.equalsIgnoreCase("vedant"); → compare ignoring case
name.toUpperCase();              → uppercase
name.toLowerCase();              → lowercase


16. METHODS
Definition: A method is a reusable block of code that performs a specific task.

No parameter / no return:
static void hello() {
    System.out.println("Hello");
}

Call:
hello();

With parameter:
static void greet(String name) {
    System.out.println("Hello " + name);
}

Call:
greet("Vedant");

With return value:
static int add(int a, int b) {
    return a + b;
}

Call:
int result = add(10, 20);


17. CLASSES & OBJECTS
Definition — Class: A class is a blueprint used to create objects.
Definition — Object: An object is an actual instance of a class.

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(
            brand + " is driving at " + speed + " km/h"
        );
    }
}

Create object:
Car car1 = new Car();

Set values:
car1.brand = "BMW";
car1.speed = 120;

Call method:
car1.drive();


QUICK LOGIC CHEAT SHEET
=======================

Even              → num % 2 == 0
Odd               → num % 2 != 0
Divisible by n    → num % n == 0
Last digit        → num % 10
Remove last digit → num / 10
Counter           → count++
Sum               → sum = sum + value
Product           → result = result * value
String comparison → str.equals("value")
Array size        → arr.length
String size       → str.length()


BASIC JAVA PROGRAM TEMPLATE
===========================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Your code here

        sc.close();
    }
}