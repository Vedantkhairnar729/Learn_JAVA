JAVA BASICS — CODE + SHORT NOTES
===================================

1. VARIABLES
------------
Short note:
A variable stores a value in memory.

Syntax:
int age = 20;
String name = "Vedant";

Common examples:
int number = 10;
double price = 99.50;
char grade = 'A';
boolean passed = true;
String name = "Vedant";


2. DATA TYPES
-------------
Short note:
Data type tells Java what kind of value a variable stores.

Primitive:
int     → whole numbers
long    → large whole numbers
float   → decimal
double  → decimal (more precision)
char    → single character
boolean → true / false

Examples:
int age = 20;
long population = 1000000L;
float price = 10.5f;
double salary = 25000.50;
char grade = 'A';
boolean pass = true;

Reference:
String name = "Vedant";


3. SCANNER INPUT
----------------
Short note:
Scanner is used to take input from the user.

Import:
import java.util.Scanner;

Create:
Scanner sc = new Scanner(System.in);

Input types:
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
------------
Short note:
Operators perform calculations and comparisons.

Arithmetic:
+   addition
-   subtraction
*   multiplication
/   division
%   remainder

Example:
int a = 10;
int b = 3;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);

Comparison:
==  equal
!=  not equal
>   greater
<   less
>=  greater/equal
<=  less/equal

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
------
Short note:
Runs code only when a condition is true.

Syntax:
if (condition) {
    // code
}

Example:
if (age >= 18) {
    System.out.println("Adult");
}


6. IF-ELSE
----------
Short note:
Chooses between two possibilities.

Example:
if (num % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}


7. ELSE-IF
----------
Short note:
Used when there are multiple conditions.

Example:
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else if (marks >= 60) {
    System.out.println("C");
} else {
    System.out.println("Fail");
}


8. NESTED IF
------------
Short note:
An if statement inside another if statement.

Example:
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
---------
Short note:
Useful when one value has multiple fixed choices.

Example:
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

Remember:
break → stops the switch
default → runs when no case matches


10. TERNARY
-----------
Short note:
Short form of simple if-else.

Syntax:
result = condition ? valueIfTrue : valueIfFalse;

Example:
String result = (age >= 18) ? "Adult" : "Minor";

Another:
int max = (a > b) ? a : b;


11. FOR LOOP
------------
Short note:
Used when you know how many times you want to repeat something.

Syntax:
for (initialization; condition; update) {
    // code
}

Example:
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

Useful forms:
for (int i = 1; i <= 10; i++)
for (int i = 10; i >= 1; i--)
for (int i = 2; i <= 20; i += 2)


12. WHILE LOOP
--------------
Short note:
Repeats while a condition is true.

Example:
int i = 1;

while (i <= 10) {
    System.out.println(i);
    i++;
}


13. NESTED LOOPS
----------------
Short note:
A loop inside another loop. Commonly used for patterns.

Example:
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

Remember:
Outer loop → rows
Inner loop → columns/items


14. ARRAYS
----------
Short note:
An array stores multiple values of the same type.

Create:
int[] numbers = new int[5];

Initialize:
int[] numbers = {10, 20, 30, 40, 50};

Access:
System.out.println(numbers[0]);

Array index starts at 0.

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
-----------
Short note:
String stores text.

Create:
String name = "Vedant";

Length:
name.length();

Character:
name.charAt(0);

Compare:
name.equals("Vedant");

Ignore case:
name.equalsIgnoreCase("vedant");

Uppercase:
name.toUpperCase();

Lowercase:
name.toLowerCase();


16. METHODS
-----------
Short note:
A method is a reusable block of code.

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

With return:
static int add(int a, int b) {
    return a + b;
}

Call:
int result = add(10, 20);


17. CLASSES & OBJECTS
--------------------
Short note:
Class = blueprint.
Object = actual object created from the class.
Variables = data/properties.
Methods = actions/behavior.

Class:
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(
            brand + " is driving at " + speed + " km/h"
        );
    }
}

Object:
Car car1 = new Car();

Set values:
car1.brand = "BMW";
car1.speed = 120;

Call method:
car1.drive();


QUICK LOGIC CHEAT SHEET
=======================

Even:
num % 2 == 0

Odd:
num % 2 != 0

Divisible by:
num % n == 0

Last digit:
num % 10

Remove last digit:
num / 10

Counter:
count++

Sum:
sum = sum + value;

Product:
result = result * value;

String comparison:
str.equals("value")

Array size:
arr.length

String size:
str.length()


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