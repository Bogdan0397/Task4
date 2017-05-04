package month;

import java.util.Scanner;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Month {

        public static void main(String[] args) {
            String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "December"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input month: ");
            int number = scanner.nextInt();
            String buff = "";
            int[] numberofdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < month.length; i++) {
                if (i == number - 1 && number >= 1 && number <= 12) {
                    buff = month[i] + " " + numberofdays[i] + " days.";
                }
            }
            System.out.println(buff);
    }
}
