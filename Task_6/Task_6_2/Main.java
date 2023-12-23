public class Main {
    public static void main(String[] args) {
        LabradorRetriever labrador = new LabradorRetriever();
        System.out.println("Breed: " + labrador.getBreed());
        labrador.bark();

        System.out.println();

        GermanShepherd germanShepherd = new GermanShepherd();
        System.out.println("Breed: " + germanShepherd.getBreed());
        germanShepherd.bark();
    }
}