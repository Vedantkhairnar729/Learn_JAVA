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


------------------------------
Example 1 — Login:
if (username.equals("admin")) {
    if (password.equals("1234")) {
        System.out.println("Login Successful");
    } else {
        System.out.println("Invalid Password");
    }
} else {
    System.out.println("Invalid Username");
}

Example 2 — Age and student:
if (age >= 18) {
    if (isStudent) {
        System.out.println("Adult Student");
    } else {
        System.out.println("Adult");
    }
} else {
    System.out.println("Minor");
}

Example 3 — Loan eligibility:
if (age >= 21 && age <= 60) {
    if (salary >= 25000) {
        System.out.println("Salary Eligible");
    } else {
        System.out.println("Salary Not Eligible");
    }
} else {
    System.out.println("Age Not Eligible");
}

Example 4 — Exam:
if (marks >= 40) {
    if (attendance >= 75) {
        System.out.println("Pass");
    } else {
        System.out.println("Attendance Shortage");
    }
} else {
    System.out.println("Fail");
}

Example 5 — Ticket:
if (age < 18) {
    if (age < 5) {
        System.out.println("Free Ticket");
    } else {
        System.out.println("Child Ticket");
    }
} else {
    System.out.println("Adult Ticket");
}