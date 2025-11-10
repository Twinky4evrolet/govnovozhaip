import java.util.Random;
import java.util.Scanner;

public class port {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = scan.nextInt();
        Random randomizer = new Random();
        int gencount = 0;
        int[][] arrays = new int[n*10][n*10];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                arrays[i][j] = randomizer.nextInt();
                System.out.print(arrays[i][j] + " ");
                if (proverkapalindrom(arrays[i][j])) {
                    count ++;
                }
            }
            System.out.println();
            if (count == 1) {
                gencount ++;
            }
        }
        if (gencount == n) {
            System.out.println("Да, в каждой строке матрицы есть число палиндром");
        } else {
            System.out.println("Лох");
        }
    }
    public static boolean proverkapalindrom(int numb) {
        int original = numb;
        int reserved = 0;
        while (numb > 0) {
            reserved = (reserved * 10) + (numb % 10);
            numb /= 10;
        }
        if (original == reserved) {
            return true;
        } else {
            return false;
        }
    }
}