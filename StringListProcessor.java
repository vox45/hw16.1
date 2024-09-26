public class StringListProcessor {
    // Метод рахує кількість великих літер у рядку
    public static int countUppercase(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
