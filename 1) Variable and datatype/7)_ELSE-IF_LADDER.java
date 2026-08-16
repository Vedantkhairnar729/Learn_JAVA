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


------------------------------
Example 1 — Grade:
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else if (marks >= 60) {
    System.out.println("C");
} else {
    System.out.println("Fail");
}

Example 2 — Number:
if (num > 0) {
    System.out.println("Positive");
} else if (num < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}

Example 3 — Age:
if (age <= 12) {
    System.out.println("Child");
} else if (age <= 19) {
    System.out.println("Teenager");
} else if (age <= 59) {
    System.out.println("Adult");
} else {
    System.out.println("Senior Citizen");
}

Example 4 — Temperature:
if (temp >= 35) {
    System.out.println("Hot");
} else if (temp >= 20) {
    System.out.println("Normal");
} else {
    System.out.println("Cold");
}

Example 5 — Salary:
if (salary >= 100000) {
    System.out.println("High Salary");
} else if (salary >= 50000) {
    System.out.println("Medium Salary");
} else {
    System.out.println("Low Salary");
}
