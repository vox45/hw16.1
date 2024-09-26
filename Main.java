import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Анонімний клас для додавання двох чисел
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = addition.operate(5, 10);
        System.out.println("Addition result: " + result);

        // Лямбда-вираз для перетворення рядка в верхній регістр
        StringManipulator toUpperCase = s -> s.toUpperCase();
        System.out.println("Uppercased: " + toUpperCase.manipulate("hello"));

        // Використання посилання на метод для підрахунку великих літер
        Function<String, Integer> countUppercase = StringListProcessor::countUppercase;
        System.out.println("Uppercase count: " + countUppercase.apply("Hello World"));

        // Створення постачальника випадкових чисел
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number: " + randomSupplier.get());
    }
}
