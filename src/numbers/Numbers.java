package numbers;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Numbers {
    public int sum1(int[] array) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public int sum2(int[] array) {
        int sum = 0;
        for (int i = 5; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
