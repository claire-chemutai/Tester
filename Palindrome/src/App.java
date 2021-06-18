/**
 * Program to check whether a word is a palindrome
 */
public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word to check for palidrome");
        String str = scan.nextLine();

        App.palindrome(str);
    }
}
