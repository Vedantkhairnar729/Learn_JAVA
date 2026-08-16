3. SCANNER INPUT
Definition: Scanner is used to take input from the user.

Import:
import java.util.Scanner;

Create:
Scanner sc = new Scanner(System.in);

Input:
int num = sc.nextInt();
long num = sc.nextLong();
float num = sc.nextFloat();
double num = sc.nextDouble();
String word = sc.next();
String line = sc.nextLine();
char ch = sc.next().charAt(0);

Close:
sc.close();


-----------------------------
Example 1 — int:
int age = sc.nextInt();

Example 2 — double:
double salary = sc.nextDouble();

Example 3 — String:
String name = sc.next();

Example 4 — character:
char ch = sc.next().charAt(0);

Example 5 — complete line:
String address = sc.nextLine();

