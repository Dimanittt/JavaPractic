
// 371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
// 8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        System.out.println("Enter the number");
        int num = console.nextInt();
        int x = 0;
        int y = armstrongNumber.get10(num);
        while ((num * 10) / 10 != 0) {
            x = x + armstrongNumber.pow((num % 10), y);
            num = num / 10;
        }
        System.out.println(x);
    }

    int pow(int x, int y) {
        int out = x;
        for (int i = 1; i < y; i++) {
            out = out * x;
        }
        return out;
    }

    int get10(int num) {
        int y = 0;
        while ((num * 10) / 10 != 0) {
            y++;
            num = num / 10;
        }
        return y;
    }
}
