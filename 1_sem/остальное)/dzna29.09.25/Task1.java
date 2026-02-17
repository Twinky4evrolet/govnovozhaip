import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int razmer1 = scan.nextInt();
        System.out.println("Введите количество столбцов массива");
        int razmer2 = scan.nextInt();
        int[][] massiv = new int[razmer1][razmer2];
        Random random = new Random();
        for (int i = 0; i < razmer1; i++) {
            for (int j = 0; j < razmer2; j++) {
                massiv[i][j] = random.nextInt(100);
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        int gencount = 0;
        for (int j = 0; j < razmer2; j++) {
            int count = 0;
            for (int i = 0; i < razmer1; i++) {
                if (massiv[i][j] % 3 == 0) {
                    count++;
                }
                if (count == razmer1) {
                    gencount++;
                }
            }
        }
        if (gencount >= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
