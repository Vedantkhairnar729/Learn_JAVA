import java.util.Scanner;

public class Com_Str {

    public static void main(String [] args) {

        Scanner sca = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sca.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sca.nextLine();

        boolean same = true;

        if (str1.length() != str2.length()) {
            same = false;
        }
        else {

            for (int i = 0; i < str1.length(); i++) {

                if (str1.charAt(i) != str2.charAt(i)) {

                    same = false;
                    break;
                }
            }
        }

        if (same) {

            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }

        sca.close();
    }
}
/*
output 1 :

Enter first string: Veanu
Enter second string: Veanu
String are equal


output 2 :

Enter first string: Veanu
Enter second string: Vedant
String are not equal