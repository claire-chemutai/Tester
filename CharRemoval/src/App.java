import java.util.Scanner;

/**
 * Program to remove occurences of a specified character or letter
 */
public class App {
    public static void charRemoval(String str, char c) {
        char[] strChar = str.toCharArray();

        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] != c) {
                System.out.print(strChar[i]);

            }
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = scan.nextLine();

        System.out.println("Enter the character you wnat removed");
        String strChr = scan.nextLine();
        char c = strChr.charAt(0);

        App.charRemoval(str, c);

    }
}
