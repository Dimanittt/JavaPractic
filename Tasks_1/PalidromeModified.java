import java.util.Scanner;

public class PalidromeModified {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a text");
        String c = console.nextLine();
        char[] s = c.toCharArray();
        int j = 0;
        boolean compare = true;
        while (j < (s.length / 2)) {
            if (s[s.length - j - 1] != s[j]) {
                compare = false;
                break;
            }
            j++;
        }
        if (compare) {
            System.out.println("Yes, the text is a palidrome");
        } else {
            System.out.println("No, the text is not a palidrome");
        }
    }
}
