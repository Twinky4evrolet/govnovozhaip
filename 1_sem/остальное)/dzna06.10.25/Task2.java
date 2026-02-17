import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomize = new Random();

        System.out.println("Введи количество строк");
        int lines = scan.nextInt();
        System.out.println("Введи количество столбцов");
        int columns = scan.nextInt();
        int[][] array = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = randomize.nextInt(100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        boolean genflag = false;
        for (int i = 0; i < columns; i++) {
            boolean flag = true;
            int sum0 = sumdigits(array[0][i]);
            for (int j = 0; j < lines; j++) {
                if ((sumdigits(array[j][i])) != sum0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Найден столбец " + (i + 1) + " с одинаковой суммой цифр в столбце");
                genflag = true;
            }
        }
        if (!genflag) {
            System.out.println("Такого столбца нет");
        }
    }
    private static int sumdigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}