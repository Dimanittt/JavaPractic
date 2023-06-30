import java.util.Scanner;
// Палиндром

// Integer i = Integer.valueOf("12"); //valueOf gets Integer
// int ii = Integer.parseInt("2"); // parseInt gets int
// short iii = i.shortValue(); // short/double...Value alter to these ones

public class Task1 {
    static Integer i;
    static String s;

    public static void main(String[] args) {

        Task1 task = new Task1();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your number");
        i = console.nextInt();
        s = i.toString();
        char[] sChar = s.toCharArray();
        int sCharLength = sChar.length;
        int j = 1;
        int n = 0;
        int k = sCharLength - 1;
        while (j-1 < (sCharLength / 2)) {
            if (sChar[k] == sChar[j-1]) {
                n++;
            }
            j++;
            System.out.println(sChar[k]);
            System.out.println(sChar[j-1]);
            k--;
        }
        System.out.println(n);
        if (n == sCharLength / 2) {
            System.out.println("Да, число является палиндромом");
        } else {
            System.out.println("Нет, число не является палиндромом");
        }
    }
}