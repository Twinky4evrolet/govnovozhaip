public class TextAnalyzer {
    public static void findEmails(String text) {
        System.out.println("=== Email-адреса ===");
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String[] words = text.split("[\\s,;()]+");
        int count = 0;
        for (String word : words) {
            if (word.matches(regex)) {
                System.out.println(++count + ". " + word);
            }
        }
        if (count == 0) System.out.println("— не найдено —");
        System.out.println();
    }
    public static void findDates(String text) {
        System.out.println("=== Даты ===");
        String regex = "(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(19\\d{2}|20\\d{2})";
        String[] words = text.split("[\\s,;()]+");
        int count = 0;
        for (String word : words) {
            if (word.matches(regex)) {
                System.out.println(++count + ". " + word);
            }
        }
        if (count == 0) System.out.println("— не найдено —");
        System.out.println();
    }
    public static void findCapitalizedWords(String text) {
        System.out.println("=== Слова с заглавной буквы ===");
        String[] sentences = text.split("[.!?]\\s*");
        int count = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                String word = words[i].replaceAll("[^A-Za-zА-Яа-я-]", ""); // убираем лишние символы
                if (i > 0 && word.matches("[A-ZА-Я][a-zа-я-]*")) {
                    System.out.println(++count + ". " + word);
                }
            }
        }
        if (count == 0) System.out.println("— не найдено —");
        System.out.println();
    }
    public static void countDigits(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        System.out.println("=== Количество цифр ===");
        System.out.println("Всего цифр: " + count);
        System.out.println();
    }

    public static void main(String[] args) {
        String text = """
            Компания "Рога и копыта" основана 15.03.2005.
            Контакты: director@roga.ru, support@roga-kopita.com.
            Бюджет проекта: 1500000 рублей. Штаб-квартира в Москве.
            Некорректные данные: 45.13.2025, user@.com, 999.999.9999.
            Валидные: 01.01.2024, normal@email.com
            """;

        System.out.println("=== РЕЗУЛЬТАТ АНАЛИЗА ===\n");
        findEmails(text);
        findDates(text);
        findCapitalizedWords(text);
        countDigits(text);
    }
}
