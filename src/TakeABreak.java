import java.util.Scanner;
public class TakeABreak {
    public void printTakeABreak() {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to take a break? (If so enter 'y' for yes)");
        String userInput = input.nextLine();

        while (!userInput.equals("y")) {
            System.out.println("Do you want to take a break?");
            userInput = input.nextLine();

        }
    }
}
