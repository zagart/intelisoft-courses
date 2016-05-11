import java.util.Scanner;

public class Main {

    public static void main(String...args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome!\nNow you can enter your number:");

        int targetNumber = 10;
        int enteredNumber;

        if (reader.hasNextInt()) {
            enteredNumber = reader.nextInt();

            if (enteredNumber == targetNumber) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        } else {
            System.out.println(false);
        }



    }

}
