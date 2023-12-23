import java.util.Scanner;

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество членов последовательности: ");
        int n = scanner.nextInt();
        generateTriangularSequence(n);
        scanner.close();
    }

    public static void generateTriangularSequence(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            generateTriangularSequence(n - 1);
            int count = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print(n + " ");
                count++;
                if (count == n) {
                    System.out.println();
                }
            }
        }
    }
}
