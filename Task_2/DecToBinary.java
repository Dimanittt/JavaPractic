// programm work until dec < 1024

import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        DecToBinary decToBinary = new DecToBinary();
        System.out.print("Enter your number ");
        Scanner console = new Scanner(System.in);
        Integer dec = console.nextInt();
        int tempDec = dec;
        int bin = 0;
        if (dec % 2 == 1)
            bin = 1;
        int i = 0;
        while (dec > 1) {
            while (tempDec > 1) {
                tempDec = tempDec / 2;
                i++;
            }
            bin = bin + decToBinary.pow(10, i);
            dec = dec - decToBinary.pow(2, i);
            tempDec = dec;
            i = 0;
        }
        System.out.println("Your binary number is " + bin);
    }

    int pow(int a, int b) {
        int i = a;
        while (b > 1) {
            i = i * a;
            b--;
        }
        return i;
    }
}
