import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Select range");
        int min = console.nextInt();
        int max = console.nextInt();
        int j = 0;
        while (min <= max) {
            if (min == 1) {System.out.print(min + " ");}
            for (int i = 1; i < min; i++) {
                if (min % i == 0 && i != 1) {
                    j++;
                }
            }
            if (j == 1)
                System.out.print(min + " ");
            j = 1;
            min++;
        }
    }
}
