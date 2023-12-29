import java.util.Arrays;
import java.util.Random;

public class RandomArraySortSimple {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        System.out.println("\nОтсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
