public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sumFor = 0;
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }
        System.out.println("Сумма (for): " + sumFor);

        int sumWhile = 0;
        int j = 0;
        while (j < array.length) {
            sumWhile += array[j];
            j++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        int sumDoWhile = 0;
        int k = 0;
        do {
            sumDoWhile += array[k];
            k++;
        } while (k < array.length);
        System.out.println("Сумма (do while): " + sumDoWhile);
    }
}
