import java.util.Scanner;

public class MaximumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = findMaximum(scanner);
        System.out.println("Наибольшее значение в последовательности: " + max);
        scanner.close();
    }

    public static int findMaximum(Scanner scanner) {
        int num = scanner.nextInt();
        if (num == 0) {
            return 0;
        } else {
            int maxRest = findMaximum(scanner);
            return Math.max(num, maxRest);
        }
    }
}
