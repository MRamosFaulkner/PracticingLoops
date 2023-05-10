import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TakeABreak takeABreak = new TakeABreak();
        StopAtFive stopAtFive = new StopAtFive();
        PositiveNumbers positiveNumbers = new PositiveNumbers();
        CountToEleven countToEleven = new CountToEleven();
        Multiplication multiplication = new Multiplication();

        System.out.println("TakeABreak");
        takeABreak.printTakeABreak();

        System.out.println("StopAtFive");
        stopAtFive.printStopAtFive();

        System.out.println("PositiveNumbers");
        positiveNumbers.printPositiveNumbers();

        System.out.println("CountToEleven");
        countToEleven.printCountToEleven();

        System.out.println("Multiplication");
        multiplication.printMultiplication();
    }
}