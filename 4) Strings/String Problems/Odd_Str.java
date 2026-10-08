import java.util.Scanner;

public class Odd_Str {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        System.out.println("Character at Odd indexes: ");

        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
        scan.close();
    }
}
/*
output:

Enter a String: VEANU
Character at Odd indexes: 
E N 
