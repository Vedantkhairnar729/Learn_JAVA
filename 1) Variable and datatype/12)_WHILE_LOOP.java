12. WHILE LOOP
Definition: A while loop repeats code while its condition is true.

int i = 1;

while (i <= 10) {
    System.out.println(i);
    i++;
}


---------------------------
Example 1 — Print 1 to 10:
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}

Example 2 — Countdown:
int i = 10;
while (i >= 1) {
    System.out.println(i);
    i--;
}

Example 3 — Sum of digits:
int sum = 0;
while (num != 0) {
    sum += num % 10;
    num /= 10;
}

Example 4 — Count digits:
int count = 0;
while (num != 0) {
    count++;
    num /= 10;
}

Example 5 — Reverse number:
int reverse = 0;
while (num != 0) {
    int digit = num % 10;
    reverse = reverse * 10 + digit;
    num /= 10;
}