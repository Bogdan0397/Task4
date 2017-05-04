package numbers;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, -2, 50, -100, 300, -400, 500, -600, 132, 133};
        Numbers numbersSum = new Numbers();
        System.out.println(numbersSum.sum1(array));
        System.out.println(numbersSum.sum2(array));
    }
}
