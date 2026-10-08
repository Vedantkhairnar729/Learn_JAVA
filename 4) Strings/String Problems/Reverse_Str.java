import java.util.Scanner;

public class Reverse_Str {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));

        }
        
        sc.close();
    }
}
/*
output:

Enter a String: 
Vedant
t
n
a
d
e
V