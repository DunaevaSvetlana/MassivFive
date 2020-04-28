import java.util.concurrent.ThreadLocalRandom;

public class Massiv {
    public static void main(String[] args) {
        int[] numbers = new int[12];
        int zp = 45000;
        int sumZp = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = zp;
            sumZp = sumZp + numbers[i];
        }
            System.out.println("sumZp = " + sumZp);

    }
}
