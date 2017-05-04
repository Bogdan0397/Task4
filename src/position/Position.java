package position;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Position {
    private static int position;
        public int secondPositiveNumber(int[] array) {
        int index = -1;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > 0 && array[j] > 0) {
                    index=j;
                }
                break;
            }
        }
        return index;
    }

    public int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i+1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {-1, 2, 3, -4, 5};
        Position position = new Position();
        System.out.println(position.secondPositiveNumber(array));
        System.out.println(position.minimum(array)+" "+position);
    }
}
