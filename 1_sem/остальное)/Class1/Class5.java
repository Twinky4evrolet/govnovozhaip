import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int razmer = scan.nextInt();
        if (razmer <= 0) {
            System.out.println("Размер массива должен быть положительным!");
            return;
        }
        int[] mass = new int[razmer];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < razmer; i++) {
            mass[i] = scan.nextInt();
        }
        if (check(mass)) {
            System.out.println("Все положительные числа содержат хотя бы одну четную цифру");
        } else {
            System.out.println("Присутствуют положительные числа без четных цифр");
        }
    }
    public static boolean check(int[] array) {
        for (int num : array) {
            if (num > 0) {
                if (!proverksdva(num)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean proverkadva(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
