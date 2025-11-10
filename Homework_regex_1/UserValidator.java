public class UserValidator {

    public static boolean validateName(String name) {
        if (name == null) return false;
        String regex = "^[А-Я][а-я]{1,14}$";
        return name.matches(regex);
    }

    public static void main(String[] args) {
        String[] testNames = {
                "Анна", "Владимир", "Ян",
                "анна", "А", "ИВАН", "Алексей123", "Петр!", "ДмитрийДмитрийДмитрий"
        };

        System.out.println("=== Проверка имён ===\n");
        for (String name : testNames) {
            boolean result = validateName(name);
            System.out.printf("%-25s -> %s%n", name, result ? "валидно" : "НЕВЕРНО");
        }
    }
}
