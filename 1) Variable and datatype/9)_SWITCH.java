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


----------------------
Example 1 — Day:
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid Day");
}

Example 2 — Month:
switch (month) {
    case 1:
        System.out.println("January");
        break;
    case 2:
        System.out.println("February");
        break;
    default:
        System.out.println("Invalid Month");
}

Example 3 — Calculator:
switch (operator) {
    case '+':
        System.out.println(a + b);
        break;
    case '-':
        System.out.println(a - b);
        break;
    case '*':
        System.out.println(a * b);
        break;
    default:
        System.out.println("Invalid Operator");
}

Example 4 — Menu:
switch (choice) {
    case 1:
        System.out.println("Pizza");
        break;
    case 2:
        System.out.println("Burger");
        break;
    default:
        System.out.println("Invalid Choice");
}

Example 5 — Grade:
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    case 'C':
        System.out.println("Average");
        break;
    default:
        System.out.println("Invalid Grade");
}