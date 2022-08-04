import java.util.Random;
import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.print("array to be shuffled ");
        System.out.println(Arrays.toString(array));

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }

        System.out.print("shuffle array ");
        System.out.println(Arrays.toString(array));

    }

}