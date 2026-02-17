import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int gencount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве");
        int razmer1 = scan.nextInt();
        System.out.println("Введите количество столбцов в массиве");
        int razmer2 = scan.nextInt();
        Random rand = new Random();
        int[][] array = new int[razmer1][razmer2];
        for (int i = 0; i < razmer1; i++) {
            for (int j = 0; j < razmer2; j++) {
                array[i][j] = rand.nextInt(100);
                //array[i][j] = scan.nextInt();
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < razmer1; i++) {
            int count = 0;
            for (int j = 0; j < razmer2; j++) {
                if (checkna5(array[i][j])) {
                    count += 1;
                }
            }
            if (count >= 2) {
                gencount += 1;
            }
        }
        if (gencount == razmer1) {
            System.out.println("Da");
        } else {
            System.out.println("Lox");
        }
    }

    private static boolean checkna5(int numb){
       boolean flag = true;
       int sum = 0;
       while (numb > 0) {
           sum += numb % 10;
           numb /= 10;
       }
       if ((sum % 5) == 0) {
           return true;
       } else {
           return false;
       }
    }
}