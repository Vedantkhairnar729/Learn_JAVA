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


-------------------------
Example 1 — Print 1 to 10:
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

Example 2 — Even numbers:
for (int i = 2; i <= 20; i += 2) {
    System.out.println(i);
}

Example 3 — Sum:
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}

Example 4 — Multiplication table:
for (int i = 1; i <= 10; i++) {
    System.out.println(num + " x " + i + " = " + (num * i));
}

Example 5 — Factorial:
int fact = 1;
for (int i = 1; i <= num; i++) {
    fact *= i;
}
