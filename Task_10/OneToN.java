import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        printNumbers(1, n);
        scanner.close();
    }

    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        } else {
            System.out.print(current + " ");
            printNumbers(current + 1, n);
        }
    }
}
