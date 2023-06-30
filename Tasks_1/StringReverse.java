import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter a text");
        Scanner console = new Scanner(System.in);
        String initString = console.nextLine();
        char[] arrayInitString = initString.toCharArray();
        char text;
        int index = 0;
        while (index < arrayInitString.length / 2) {
            text = arrayInitString[arrayInitString.length - 1 - index];
            arrayInitString[arrayInitString.length - 1 - index] = arrayInitString[index];
            arrayInitString[index] = text;
            index++;
        }
        System.out.println(arrayInitString);
    }

}