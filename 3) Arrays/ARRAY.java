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


-----------------------
Example 1 — Create:
int[] numbers = {10, 20, 30, 40, 50};

Example 2 — Access:
System.out.println(numbers[0]);

Example 3 — Print all:
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

Example 4 — Sum:
int sum = 0;
for (int num : numbers) {
    sum += num;
}

Example 5 — Find maximum:
int max = numbers[0];
for (int num : numbers) {
    if (num > max) {
        max = num;
    }
}


