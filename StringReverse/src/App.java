import java.util.Scanner;

/**
 * A program to reverse only the words of a string
 */
public class App {
    private static void stringReverse(String str) {
        // convert string into an array
        String[] strArray = str.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            char[] charArr = strArray[i].toCharArray();
            for (int j = charArr.length - 1; j >= 0; j--) {
                System.out.print(charArr[j]);
            }
            System.out.print(" ");

        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string to reverse");

        String str = scan.nextLine();

        App.stringReverse(str);

    }

}
