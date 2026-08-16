------------------------
Example 1 — No parameter:
static void hello() {
    System.out.println("Hello");
}

Example 2 — One parameter:
static void greet(String name) {
    System.out.println("Hello " + name);
}

Example 3 — Two parameters:
static int add(int a, int b) {
    return a + b;
}

Example 4 — Check even:
static boolean isEven(int num) {
    return num % 2 == 0;
}

Example 5 — Find maximum:
static int max(int a, int b) {
    return (a > b) ? a : b;
}
