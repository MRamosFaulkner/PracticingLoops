import java.util.Scanner;

public class Multiplication {
    public void printMultiplication() {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a number: ");

        int num = input.nextInt();

        for(int i = 1; i < 11; i++) {
            int d = num * i;

            System.out.println(num + " + " + i + " = " + d);
        }
    }
}
