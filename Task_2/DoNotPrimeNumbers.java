import java.util.Scanner;

public class DoNotPrimeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Select range");
        int min = console.nextInt();
        int max = console.nextInt();
        boolean compare = false;
        while (min <= max) {
            for (int i = 1; min > i; i++) {
                if (min % i == 0 && i!=1) {
                    System.out.print(min + " ");
                    break;
                }
            }
        min++;
        }
    }
}
