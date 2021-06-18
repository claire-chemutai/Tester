import java.util.Scanner;

/**
 * Program to count the frequency of each vowel in a string
 */
public class App {
    public static void vowelFreq(String str) {

        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j] == 'a') {
                a = a + 1;
            } else if (charArray[j] == 'e') {
                e = e + 1;
            } else if (charArray[j] == 'i') {
                i = i + 1;
            } else if (charArray[j] == 'o') {
                o = o + 1;
            } else if (charArray[j] == 'u') {
                u = u + 1;
            }
        }
        System.out.println("a = " + a);
        System.out.println("e = " + e);
        System.out.println("i = " + i);
        System.out.println("o = " + o);
        System.out.println("u = " + u);

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a sentence");

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        App.vowelFreq(sentence);

    }
}
