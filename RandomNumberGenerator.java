import java.util.Random;

public class RandomNumberGenerator {

    // Метод генерує випадкове число в діапазоні від min до max
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
