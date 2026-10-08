import java.util.Scanner;

public class Str_Upper {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char chaha = str.charAt(i);

            if (chaha >= 'a' && chaha <= 'z') {
                chaha = (char)(chaha - 32);

            }

            result = result + chaha;

        }

        System.out.println("UpperCase: " + result);

        scan.close();
    }
}
/*
output:

Enter a String: veanu
UpperCase: VEANU