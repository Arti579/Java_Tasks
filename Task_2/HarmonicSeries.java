public class HarmonicSeries {
    public static void main(String[] args) {
        double sum = 0.0;
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
            System.out.println(sum);
        }
    }
}
