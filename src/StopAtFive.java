import java.util.Scanner;
public class StopAtFive {
    public void printStopAtFive() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        while (!(num == 5)) {
            System.out.println("Enter a number: ");
            num = input.nextInt();
        }
    }
}
