/* 1) what is an array

    An Array is a collection of multiple value of the same datatype stored under the one variable name

2) array diclaration

int [] arr;

3) array creation

int [] arr = new int[10];

4) array initialization

int [] arr = {10, 20, 30, 40, 50, 60};

5) accessing array elements

int [] arr = {1, 2, 3, 4, 5, 6};

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);

--------------------------------------------------------------------------------------------------------------------
6) updating an array element

int [] arr = {1, 2, 3, 4, 5};
arr[2] = 22;
System.out.println(arr[2]);

--------------------------------------------------------------------------------------------------------------------
7)array length

int [] arr = {1, 2, 3, 4, 5, 6};
System.out.println(arr.length);

--------------------------------------------------------------------------------------------------------------------
8) First complete example

class main {
    public static void main(String [] args) {
        int [] number = {10, 20, 30, 40};

        System.out.println("First: " + number[0]);
        System.out.println("Seccond: " + number[1]);
        System.out.println("Third: " + number[2]);
        System.out.println("Length: " + number.length);
    }
}
// Output

First: 10                 
Seccond: 20
Third: 30
Length: 4

--------------------------------------------------------------------------------------------------------------------
9) traversing an array

int[] trav = {1, 2, 3, 4, 5, 6};

for (int i = 0; i > trav.length; i++) {
    System.out.println(trav[i]);
}

output

10
20
30
40
50

understand the loop:

i = 0 → numbers[0]
i = 1 → numbers[1]
i = 2 → numbers[2]
i = 3 → numbers[3]
i = 4 → numbers[4]

--------------------------------------------------------------------------------------------------------------------
10) taking array input

import java.util.Scanner;

class main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];

        for (int i=0; i<arr.length; i++){

            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");

        for (int i = 0;  i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}

Output: 

Enter number: 10
Enter number: 20
Enter number: 30
Enter number: 40
Enter number: 50
Array: 
10
20
30
40
50

--------------------------------------------------------------------------------------------------------------------
10) Sum of array

class main{
    public static void main(String [] args) {

        int [] number = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];
        }

        System.out.println("Sum: " + sum);
    }
}

output: 

Sum: 150

--------------------------------------------------------------------------------------------------------------------
11) Average of Arrary

class main {
    public static void main(String [] args) {

        int [] marks = {75, 85, 68, 92, 83};

        int sum = 0;

        for (int mark : marks) {

            sum += mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("Average = " + average);
    }
}

output: 

Average = 80.6

--------------------------------------------------------------------------------------------------------------------
12) Find Largest Element

class main{
    public static void main(String [] args) {

        int [] number = {10, 50, 20, 90, 30};

        int largest = number[0];

        for (int i = 1; i < number.length; i++) {

            if (number[i] > largest) {
                largest = number[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}

output:

Largest = 90

--------------------------------------------------------------------------------------------------------------------
13) Find Smallest Element

class main {
    public static void main(String [] args) {

        int [] number = {40, 10, 50, 20, 5};

        int smallest = number[0];

        for (int i = 1; i < number.length; i++) {
            
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }

        System.out.println("Smallesr = " + smallest);
    }
}

output:
Smallesr = 5

--------------------------------------------------------------------------------------------------------------------
14) Count Even and Odd Number

class main {
    public static void main(String [] args) {

        int [] number = {10, 15, 20, 25, 30};

        int even = 0;
        int odd = 0;

        for (int numbers : number) {

            if (numbers % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}

output:
Even = 3
Odd = 2

--------------------------------------------------------------------------------------------------------------------
15) Search an Element

class main {
    public static void main(String [] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        int search = 30;

        boolean found = false;

        for (int number : numbers) {

            if (number == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Element Found : ");
            System.out.println(search);
        }
        else {
            System.out.println("Element Not Found");
        }
    }
}

output:
Element Found : 30

--------------------------------------------------------------------------------------------------------------------
16) Reverse an Array

class main {
    public static void main(String [] args) {
        
        int [] numbers = {10, 20, 30, 40, 50};

        for (int i = numbers.length -1; i >= 0; i--) {
            System.out.println(numbers[i] + " ");
        }
    }
}

output:

50 
40 
30 
20 
10 

--------------------------------------------------------------------------------------------------------------------
17) Copy an Array

class main {
    public static void main(String [] args) {

        int[] original = {10, 20, 30, 40};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {

            copy[i] = original[i];
        }

        for (int number : copy) {

            System.out.println(number + " ");
        }
    }
}

output:
10
20
30
40

--------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------

1) Two Dimensional Array

A 2D Array is like a table of matrix

    int[][] matrix = {
        {1, 2, 3}
        {4, 5, 6}
        {7, 8, 9}
    };
    
Diagram:
            Column
            0  1  2
          ┌─────────
    Row 0 │ 1  2  3
    Row 1 │ 4  5  6
    Row 2 │ 7  8  9


Access:

matrix[0][0] → 1
matrix[1][2] → 6
matrix[2][1] → 8

--------------------------------------------------------------------------------------------------------------------
2) Print 2D Array

class main {
    public static void main(String [] args) {

        int[][] matrix = {
            {1, 3, 4,},
            {2, 6, 8,},
            {3, 9, 6,}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

output:
1 3 4
2 6 8
3 9 6 

--------------------------------------------------------------------------------------------------------------------
3) Row Sum

class main {
    public static void main(String [] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //row
        for (int i = 0; i < matrix.length; i++){

            int sum = 0;

            //column
            for (int j = 0; j < matrix[i].length; j++){
                
                sum += matrix[i][j];
            }
            System.out.println("Row " + i + " Sum = " + sum);
        }
    }
}

output:
Row 0 Sum = 6
Row 1 Sum = 15
Row 2 Sum = 24

--------------------------------------------------------------------------------------------------------------------
4) Sum Column

class main {
    public static void main(String [] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < matrix[0].length; j++){
            
            int sum = 0;

            for (int i = 0; i < matrix.length; i++){

                sum += matrix[i][j];
                
            }

        System.out.println("Column " + j + " Sum = " + sum);

        }
    }
}

--------------------------------------------------------------------------------------------------------------------
5) Diagonal Sum

class main {

    public static void main(String [] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            sum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}

output:
Diagonal Sum = 15

--------------------------------------------------------------------------------------------------------------------
6) Matrix Addition

*/
class main{

    public static void main(String [] args) {

        int[][] a = {
            {1, 2},
            {3, 4},
        };

        int[][] b = {
            {5, 6},
            {7, 8},
        };

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                result[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }
}