import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your number");
        Integer i = console.nextInt();
        char[] s = i.toString().toCharArray();
        int j = 0;
        int n = 0;
        while (j < (s.length / 2)) {
            if (s[s.length - j - 1] == s[j]) {
                n++;
            }
            j++;
        }
        if (n == j) {
            System.out.println("Yes, the number is a palidrome");
        } else {
            System.out.println("No, the number is not a palidrome");
        }
    }



}
