/*
1) What is a String 

    A String is a sequence of characters.

--------------------------------------------------------------------------------------------------------------------
*/
2) Creating a String 

Method 1 - String Literal

    String name = "Vedant";

Method 2 - Using new

    String name = new String("Vedant");

--------------------------------------------------------------------------------------------------------------------
3) Basic String Example

class Main {
    
    public static void main(String [] args) {

        String name = "Vedant";

        System.out.println(name);
    }
}

--------------------------------------------------------------------------------------------------------------------
4) String length

Use:
    .length()

Example:

    String name = "Vedant";

    System.out.println(name.length());


##### IMP Difference:

Array:
    arr.length

String:
    str.length()

--------------------------------------------------------------------------------------------------------------------
5) Accessing Character - charAt()

String name = "Vedant";

System.out.println(name.charAt(0));
System.out.println(name.charAt(2));
System.out.println(name.charAt(5));

output:
V
d
t

--------------------------------------------------------------------------------------------------------------------
6) String Cancatenation

String firstName = "Vedant";
String lastName = "Khairnar";

String fullName = firstName + " " + lastName;

System.out.println(fullName);

output:
Vedant Khairnar

--------------------------------------------------------------------------------------------------------------------
7) Concatenation using

String first = "Vedant";
String last = "Khairnar";

String result = first.concat(" ").concat(second);

System.out.println(result);

output:
Hello World

--------------------------------------------------------------------------------------------------------------------
8) String Comparison

# Wrong for content comparison

String a = "Hello";
String b = "Hello";

System.out.println(a == b);
--------------------------------

Use equals()

String a = "Hello";
String b = "Hello";

System.out.println(a.equals(b));

output:
true

--------------------------------------------------------------------------------------------------------------------
9) equals() vs ==

        ==                          equals()

Compares reference              Compares content

Checks whether reference        Checks String value
point to same object

Usually not preferred for       Preferred for String content
string content

---------------------------
Use:

name.equals("Vedant")

---------------------------
rather than

name == "Vedant"

--------------------------------------------------------------------------------------------------------------------
10) equalsIgnoreCase()

# Ignores uppercase/lowercase difference

String a = "Java";
String b = "JAVA";

System.out.println(a.equalsIgnoreCase(b));

output:
true

--------------------------------------------------------------------------------------------------------------------
11) toUpperCase()

String name = "Vedant";

System.out.println(name.toUpperCase());

output:
VEDANT

--------------------------------------------------------------------------------------------------------------------
12) toLowerCase()

String name = "VEDANT";

System.out.println(name.toLowerCase());

output:
vedant

--------------------------------------------------------------------------------------------------------------------
13) charAt() + Loop

# you can process every character

String name = "Vedant";

for (int i = 0; i < name.length(); i++) {

    System.out.println(name.charAt(i));
}

output:
V
e
d
a
n
t

--------------------------------------------------------------------------------------------------------------------
14) substring()

# Used to extract part of a String

String name = "Vedant"; // V e d a n t
                           0 1 2 3 4 5

System.out.println(name.substring(2));

output:
dant

# String from index 2

-------------------------------------------
substring(start, end)

String name = "Vedant"; // V e d a n t
                           0 1 2 3 4 5

System.out.println(name.substring(1, 4));// start → included
                                         //  end   → excluded

output:
eda









