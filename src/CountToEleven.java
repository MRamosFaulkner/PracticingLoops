import java.util.Scanner;
public class CountToEleven {
    public void printCountToEleven() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number less than 11");

        int num = input.nextInt();

        while(!(num == 11)) {
            num++;
                System.out.println(num);
        }
    }
}


