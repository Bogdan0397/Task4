package entering;

import java.util.Scanner;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Entering {

        public int sum(int[] array) {
            int sum = 0;
            for (int a : array) {
                if (a % 2 == 0) {
                    sum += a;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] < 0) {
                    break;
                }
            }
            Entering obj1 = new Entering();
            System.out.println(obj1.sum(array));
        }

}
